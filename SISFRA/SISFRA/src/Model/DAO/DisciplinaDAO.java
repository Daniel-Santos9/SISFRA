package Model.DAO;

import Connection.Database;
import Model.BEAN.DisciplinaBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisciplinaDAO {
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql; 
    DisciplinaBEAN discB = null;
    
    public DisciplinaBEAN search(int disc_id){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM DISCIPLINA WHERE Disc_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,disc_id);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.discB = new DisciplinaBEAN();
                this.discB.setDisc_id(this.rs.getInt(1));
                this.discB.setNome(this.rs.getString(2));
                this.discB.setCh(this.rs.getInt(3));
                this.discB.setAs(this.rs.getInt(4));
                this.discB.setProf_id(this.rs.getInt(5));
                return this.discB;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.discB; 
    }
    
    public DisciplinaBEAN search(String nome){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM DISCIPLINA WHERE Disc_Nome = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setString(1,nome);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.discB = new DisciplinaBEAN();
                this.discB.setDisc_id(this.rs.getInt(1));
                this.discB.setNome(this.rs.getString(2));
                this.discB.setCh(this.rs.getInt(3));
                this.discB.setAs(this.rs.getInt(4));
                this.discB.setProf_id(this.rs.getInt(5));
                return this.discB;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.discB; 
    } 
}
