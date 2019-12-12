
package Model.DAO;

import Connection.Database;
import Model.BEAN.FuncionarioBEAN;
import Model.BEAN.UsuarioBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    FuncionarioBEAN funcB = null;
    
    public int create(UsuarioBEAN u, String nome){
        
        this.conexao = Database.openConnection();
       
        try {
            this.sql = "INSERT INTO FUNCIONARIO (Func_Nome,User_ID) VALUES(?,?);";
            
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
    
    public FuncionarioBEAN search(int user_id){
        
        this.conexao = Database.openConnection();
        
        try {
            this.sql = "SELECT * FROM FUNCIONARIO WHERE User_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,user_id);
            this.rs = this.stmt.executeQuery();
            
            if(this.rs.first()){
                this.funcB = new FuncionarioBEAN();
                this.funcB.setFunc_id(this.rs.getInt(1));
                this.funcB.setNome(this.rs.getString(2));
                this.funcB.setUser_id(this.rs.getInt(3));
                return this.funcB;
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }
        return this.funcB; 
    }
}
