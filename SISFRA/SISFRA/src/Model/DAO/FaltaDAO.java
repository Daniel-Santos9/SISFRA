package Model.DAO;

import Connection.Database;
import Model.BEAN.FaltaBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FaltaDAO {
    
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    
    public boolean update(int falta_id, String newStatus){

        this.conexao = Database.openConnection();
        
        try {
            this.sql = "UPDATE FALTA SET Falta_Status = ? WHERE Falta_ID = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql); 
            this.stmt.setString(1, newStatus);
            this.stmt.setInt(2, falta_id);
            if( this.stmt.executeUpdate() == 1){
                return true;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(FaltaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{
            Database.closeConnection(this.conexao,this.stmt,this.rs);
        }
        return false;
    }

    public int create(FaltaBEAN f, int id_disc, int id_func){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO FALTA (Falta_Dt,Falta_Obs,Falta_Qtd,Falta_Status,Func_ID,Disc_ID)"
                    + " VALUES(?,?,?,?,?,?);";
            
            this.stmt = this.conexao.prepareStatement(this.sql,Statement.RETURN_GENERATED_KEYS);
            
            this.stmt.setString(1, f.getData());
            this.stmt.setString(2, f.getObs());
            this.stmt.setInt(3, f.getQtd());
            this.stmt.setString(4, f.getStatus());
            this.stmt.setInt(5, id_func);
            this.stmt.setInt(6, id_disc); 
            this.stmt.execute();
            
            this.rs = this.stmt.getGeneratedKeys();
            
            if(this.rs.next()){
                return this.rs.getInt(1);
            }
 
        }
        catch(SQLException ex){
            Logger.getLogger(FaltaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt, this.rs);
        }
        return 0;
    }
}
