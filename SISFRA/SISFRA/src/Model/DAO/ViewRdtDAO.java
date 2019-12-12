package Model.DAO;

import Connection.Database;
import Model.BEAN.CursoBEAN;
import Model.BEAN.ViewRdtBEAN;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewRdtDAO {
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private List<ViewRdtBEAN> disciplinas = null;
    private ViewRdtBEAN rdtB = null;
    
    public List<ViewRdtBEAN> readAll(int turma_id){
        
    this.conexao = Database.openConnection();
    this.disciplinas = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM RDT WHERE Turma_ID = ?;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1, turma_id);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.rdtB = new ViewRdtBEAN();
                this.rdtB.setDisc_id(this.rs.getInt(1));
                this.rdtB.setNome(this.rs.getString(2));
                this.rdtB.setTurma_id(this.rs.getInt(3));
                
                this.disciplinas.add(this.rdtB);
            }
            return this.disciplinas;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewRdtDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }  
}
