package Model.DAO;

import Connection.Database;
import Model.BEAN.UsuarioBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdministradorDAO {
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    
    
    public int create(UsuarioBEAN u, String nome){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO ADMINISTRADOR (Admin_Nome,User_ID) VALUES(?,?);";
            
            this.stmt = this.conexao.prepareStatement(this.sql,Statement.RETURN_GENERATED_KEYS);
            
            this.stmt.setString(1, nome);
            this.stmt.setInt(2, u.getUser_id());
            this.stmt.execute();
            
            this.rs = this.stmt.getGeneratedKeys();
            
            if(this.rs.first()){
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

}
