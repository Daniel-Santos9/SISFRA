package Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database{
   
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String ADDRESS = "localhost";
    private static final String PORTA = "3009";
    private static final String URL = "jdbc:mariadb://"+ADDRESS+":"+PORTA+"/sisfra";
    private static final String USER = "root";
    private static final String SENHA = "123";
    
    public static Connection openConnection(){
        
            try {
                Class.forName(DRIVER);
                return DriverManager.getConnection(URL, USER, SENHA);
            } 
            catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("ERRO NA CONEXÃO: ",ex);
            }
    }
    
    public static void closeConnection( Connection con, PreparedStatement stmt, ResultSet rs){
        try {
            if(rs!=null && stmt!=null && con!=null){
                rs.close();
                stmt.close();
                con.close();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
