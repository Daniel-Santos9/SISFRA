package Model.DAO;

import Connection.Database;
import Model.BEAN.CursoBEAN;
import java.sql.*;
import java.util.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CursoDAO {
    
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private List<CursoBEAN> cursos = null;
    private CursoBEAN cursoB = null;
    
    public List<CursoBEAN> readAll(){
        
    this.conexao = Database.openConnection();
    this.cursos = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM CURSO;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.cursoB = new CursoBEAN();
                this.cursoB.setCurso_id(this.rs.getInt(1));
                this.cursoB.setNome(this.rs.getString(2));
                this.cursoB.setSigla(this.rs.getString(3));
                this.cursoB.setProf_id(this.rs.getInt(4));
                
                this.cursos.add(this.cursoB);
            }
            return cursos;
        } 
        catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    } 
    
    public boolean addCoord(int id_curso, int id_prof){

        this.conexao = Database.openConnection();
        
        try {
            this.sql = "UPDATE CURSO SET Prof_ID = ? WHERE Curso_ID = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql); 
            this.stmt.setInt(1, id_prof);
            this.stmt.setInt(2, id_curso);

            if( this.stmt.executeUpdate() == 1){
                return true;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{
            Database.closeConnection(this.conexao,this.stmt,this.rs);
        }
        return false;
    }
    
    public CursoBEAN search(String nome){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM CURSO WHERE Curso_Nome = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setString(1,nome);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.cursoB = new CursoBEAN();
                this.cursoB.setCurso_id(this.rs.getInt(1));
                this.cursoB.setNome(this.rs.getString(2));
                this.cursoB.setSigla(this.rs.getString(3));               
                this.cursoB.setProf_id(this.rs.getInt(4));
                return this.cursoB;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.cursoB; 
    }
}
