package Model.DAO;

import Connection.Database;
import Model.BEAN.ReposicaoBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReposicaoDAO {
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private ReposicaoBEAN repBe = null;
    
    public int create(ReposicaoBEAN repB){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO REPOSICAO (Rep_Dt,Rep_Qtd,Rep_Turno,Rep_Status,Disc_ID,Falta_ID) VALUES(?,?,?,?,?,?);";
            
            this.stmt = this.conexao.prepareStatement(this.sql,Statement.RETURN_GENERATED_KEYS);
            
            this.stmt.setString(1, repB.getDia());
            this.stmt.setInt(2, repB.getQtd());
            this.stmt.setString(3, repB.getTurno());
            this.stmt.setString(4, repB.getStatus());
            this.stmt.setInt(5, repB.getDisc_id());
            this.stmt.setInt(6, repB.getFalta_id());
            this.stmt.execute();
            
            this.rs = this.stmt.getGeneratedKeys();
            
            if(this.rs.first()){
                return this.rs.getInt(1);
            }
 
        }
        catch(SQLException ex){
            return 0;
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt, this.rs);
        }
        return 0;
    }
    
    public boolean update(int rep_id, String newStatus){

        this.conexao = Database.openConnection();
        
        try {
            this.sql = "UPDATE REPOSICAO SET Rep_Status = ? WHERE Rep_ID = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql); 
            this.stmt.setString(1, newStatus);
            this.stmt.setInt(2, rep_id);
            if( this.stmt.executeUpdate() == 1){
                return true;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ReposicaoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{
            Database.closeConnection(this.conexao,this.stmt,this.rs);
        }
        return false;
    }
    
    public ReposicaoBEAN search(int rep_id){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM REPOSICAO WHERE Rep_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,rep_id);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.repBe = new ReposicaoBEAN();
                this.repBe.setRep_id(this.rs.getInt(1));
                this.repBe.setDia(this.rs.getString(2));
                this.repBe.setQtd(this.rs.getInt(3));
                this.repBe.setTurno(this.rs.getString(4));
                this.repBe.setStatus(this.rs.getString(5));
                this.repBe.setDisc_id(this.rs.getInt(6));
                this.repBe.setFalta_id(this.rs.getInt(7));
                return this.repBe;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.repBe; 
    } 
}
