package Model.DAO;

import Connection.Database;
import Model.BEAN.TurmaBEAN;
import java.sql.*;
import java.util.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TurmaDAO {

    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private List<TurmaBEAN> turmas = null;
    private TurmaBEAN turmaB = null;
    private List<TurmaBEAN> turnos = null;
    
    public List<TurmaBEAN> readAll(int id_curso, String turno){
        
    this.conexao = Database.openConnection();
    this.turmas = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM TURMA WHERE Curso_ID = ? AND Turma_Turno = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1, id_curso);
            this.stmt.setString(2, turno);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.turmaB = new TurmaBEAN();
                this.turmaB.setTurma_id(this.rs.getInt(1));
                this.turmaB.setNome(this.rs.getString(2));
                this.turmaB.setTurno(this.rs.getString(3));
                this.turmaB.setSemestre(this.rs.getString(4));
                this.turmaB.setCurso_id(this.rs.getInt(5));
                
                this.turmas.add(this.turmaB);
            }
            return this.turmas;
        } 
        catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    } 
    
    public List<TurmaBEAN> readAll(int id_curso){
        
    this.conexao = Database.openConnection();
    this.turnos = new ArrayList<>();
        
        try {

            this.sql = "SELECT DISTINCT Turma_Turno FROM TURMA WHERE Curso_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1, id_curso);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.turmaB = new TurmaBEAN();
                this.turmaB.setTurno(this.rs.getString(1));
                this.turnos.add(this.turmaB);
            }
            return this.turnos;
        } 
        catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    } 
}
