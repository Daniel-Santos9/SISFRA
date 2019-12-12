package Model.DAO;

import Connection.Database;
import Model.BEAN.ProfessorBEAN;
import Model.BEAN.UsuarioBEAN;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProfessorDAO {
   
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql; 
    private ProfessorBEAN profB = null;
    private List<ProfessorBEAN> professores  = null;
    
    
    public int create(UsuarioBEAN u, String nome){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO PROFESSOR (Prof_Nome,User_ID) VALUES(?,?);";
            
            this.stmt = this.conexao.prepareStatement(this.sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            
            this.stmt.setString(1, nome);
            this.stmt.setInt(2, u.getUser_id());
            this.stmt.execute();
            
            this.rs = this.stmt.getGeneratedKeys();
            
            if(this.rs.next()){
                return this.rs.getInt(1);
            }
 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt, this.rs);
        }
        return 0;
    }
    
    public ProfessorBEAN search(int user_id){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM PROFESSOR WHERE User_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,user_id);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.profB = new ProfessorBEAN();
                this.profB.setProf_id(this.rs.getInt(1));
                this.profB.setNome(this.rs.getString(2));
                this.profB.setUser_id(this.rs.getInt(3));
                this.profB.setCurso_id(this.rs.getInt(4));
                return this.profB;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.profB; 
    } 
 
    public List<ProfessorBEAN> readAll(int id_disc){
        
    this.conexao = Database.openConnection();
    this.professores = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM PROFESSOR p"
                    + " INNER JOIN DISCIPLINA d ON p.Prof_ID = d.Prof_ID"
                    + " WHERE Disc_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1, id_disc);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.profB = new ProfessorBEAN();
                this.profB.setProf_id(this.rs.getInt(1));
                this.profB.setNome(this.rs.getString(2));
                this.profB.setUser_id(this.rs.getInt(3));
                this.profB.setCurso_id(this.rs.getInt(4));
                
                this.professores.add(this.profB);
            }
            return this.professores;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    } 
    
    public boolean addCurso(int id_curso, int id_prof){

        this.conexao = Database.openConnection();
        
        try {
            this.sql = "UPDATE PROFESSOR SET Curso_ID = ? WHERE Prof_ID = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql); 
            this.stmt.setInt(1, id_curso);
            this.stmt.setInt(2, id_prof);
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
}