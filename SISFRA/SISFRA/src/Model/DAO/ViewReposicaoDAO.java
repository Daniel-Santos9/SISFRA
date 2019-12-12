package Model.DAO;

import Connection.Database;
import Model.BEAN.ViewReposicaoBEAN;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewReposicaoDAO {
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private ViewReposicaoBEAN vrb = null;
    
public List<ViewReposicaoBEAN> readCoord(int id_curso, String status){
        
    this.conexao = Database.openConnection();
    List<ViewReposicaoBEAN> reposicoes = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM REPOSICOES WHERE Curso_ID = ? AND SITUACAO = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,id_curso);
            this.stmt.setString(2,status);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.vrb = new ViewReposicaoBEAN();
                this.vrb.setProf_id(this.rs.getInt(1));
                this.vrb.setProf(this.rs.getString(2));
                this.vrb.setDisc_id(this.rs.getInt(3));
                this.vrb.setDisc(this.rs.getString(4));
                this.vrb.setQtd(this.rs.getInt(5));
                this.vrb.setDia(this.rs.getString(6));
                this.vrb.setTurno(this.rs.getString(7));
                this.vrb.setTurma(this.rs.getString(8));
                this.vrb.setPeriodo(this.rs.getString(9));
                this.vrb.setCurso_id(this.rs.getInt(10));
                this.vrb.setCurso(this.rs.getString(11));
                this.vrb.setStatus(this.rs.getString(12));
                this.vrb.setRep_id(this.rs.getInt(13));
                reposicoes.add(this.vrb);
            }
            return reposicoes;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewReposicaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }  

public List<ViewReposicaoBEAN> readProf(int id_prof, String status){
        
    this.conexao = Database.openConnection();
    List<ViewReposicaoBEAN> reposicoes = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM REPOSICOES WHERE Prof_ID = ? AND SITUACAO = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,id_prof);
            this.stmt.setString(2,status);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.vrb = new ViewReposicaoBEAN();
                this.vrb.setProf_id(this.rs.getInt(1));
                this.vrb.setProf(this.rs.getString(2));
                this.vrb.setDisc_id(this.rs.getInt(3));
                this.vrb.setDisc(this.rs.getString(4));
                this.vrb.setQtd(this.rs.getInt(5));
                this.vrb.setDia(this.rs.getString(6));
                this.vrb.setTurno(this.rs.getString(7));
                this.vrb.setTurma(this.rs.getString(8));
                this.vrb.setPeriodo(this.rs.getString(9));
                this.vrb.setCurso_id(this.rs.getInt(10));
                this.vrb.setCurso(this.rs.getString(11));
                this.vrb.setStatus(this.rs.getString(12));
                this.vrb.setRep_id(this.rs.getInt(13));
                reposicoes.add(this.vrb);
            }
            return reposicoes;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewReposicaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }  
}
