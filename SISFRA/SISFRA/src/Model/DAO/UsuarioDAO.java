package Model.DAO;

import Connection.Database;
import Model.BEAN.UsuarioBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioDAO {
       
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
        
    public boolean login(UsuarioBEAN u){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "SELECT User_Acesso, User_ID FROM USUARIO "
                         + "WHERE BINARY User_Login = ? AND BINARY User_Senha = ? ;";
            
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setString(1, u.getLogin());
            this.stmt.setString(2, u.getSenha());
            
           this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                u.setUser_id(this.rs.getInt(2));
                u.setAcesso(this.rs.getInt(1));
                return true;
            }
 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt, this.rs);
        }
        return false;
    }
    
    public int create(UsuarioBEAN u){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO USUARIO (User_Login,User_Senha,User_Acesso) VALUES(?,?,?);";
            
            this.stmt = this.conexao.prepareStatement(this.sql,Statement.RETURN_GENERATED_KEYS);
            
            this.stmt.setString(1, u.getLogin());
            this.stmt.setString(2, u.getSenha());
            this.stmt.setInt(3, u.getAcesso());
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
    
}
