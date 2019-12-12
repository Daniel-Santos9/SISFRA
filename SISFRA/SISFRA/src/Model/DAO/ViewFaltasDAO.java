package Model.DAO;

import Connection.Database;
import Model.BEAN.ViewFaltasBEAN;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewFaltasDAO {
    
    private Connection conexao = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private String sql;
    private ViewFaltasBEAN vfb = null;
    
public List<ViewFaltasBEAN> readCoord(int id_curso, String status){
        
    this.conexao = Database.openConnection();
    List<ViewFaltasBEAN> faltas = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM FALTAS WHERE Curso_ID = ? AND SITUACAO = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,id_curso);
            this.stmt.setString(2,status);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.vfb = new ViewFaltasBEAN();
                this.vfb.setProf_id(this.rs.getInt(1));
                this.vfb.setProf(this.rs.getString(2));
                this.vfb.setDisc_id(this.rs.getInt(3));
                this.vfb.setDisc(this.rs.getString(4));
                this.vfb.setQtd(this.rs.getInt(5));
                this.vfb.setDia(this.rs.getString(6));
                this.vfb.setObs(this.rs.getString(7));
                this.vfb.setTurma(this.rs.getString(8));
                this.vfb.setTurno(this.rs.getString(9));
                this.vfb.setPeriodo(this.rs.getString(10));
                this.vfb.setCurso_id(this.rs.getInt(11));
                this.vfb.setCurso(this.rs.getString(12));
                this.vfb.setStatus(this.rs.getString(13));
                this.vfb.setFalta_id(this.rs.getInt(14));
                faltas.add(this.vfb);
            }
            return faltas;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewFaltasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }

public List<ViewFaltasBEAN> readProf(int id_prof, String status){
        
    this.conexao = Database.openConnection();
    List<ViewFaltasBEAN> faltas = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM FALTAS WHERE Prof_ID = ? AND SITUACAO = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,id_prof);
            this.stmt.setString(2,status);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.vfb = new ViewFaltasBEAN();
                this.vfb.setProf_id(this.rs.getInt(1));
                this.vfb.setProf(this.rs.getString(2));
                this.vfb.setDisc_id(this.rs.getInt(3));
                this.vfb.setDisc(this.rs.getString(4));
                this.vfb.setQtd(this.rs.getInt(5));
                this.vfb.setDia(this.rs.getString(6));
                this.vfb.setObs(this.rs.getString(7));
                this.vfb.setTurma(this.rs.getString(8));
                this.vfb.setTurno(this.rs.getString(9));
                this.vfb.setPeriodo(this.rs.getString(10));
                this.vfb.setCurso_id(this.rs.getInt(11));
                this.vfb.setCurso(this.rs.getString(12));
                this.vfb.setStatus(this.rs.getString(13));
                this.vfb.setFalta_id(this.rs.getInt(14));
                faltas.add(this.vfb);
            }
            return faltas;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewFaltasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }

public List<ViewFaltasBEAN> readFunc(int id_func, String status){
        
    this.conexao = Database.openConnection();
    List<ViewFaltasBEAN> faltas = new ArrayList<>();
        
        try {

            this.sql = "SELECT * FROM FALTAS WHERE func_ID = ? AND SITUACAO = ? ;";
            this.stmt = this.conexao.prepareStatement(this.sql);
            this.stmt.setInt(1,id_func);
            this.stmt.setString(2,status);
            this.rs = this.stmt.executeQuery();
             
            while(this.rs.next()){
                this.vfb = new ViewFaltasBEAN();
                this.vfb.setProf_id(this.rs.getInt(1));
                this.vfb.setProf(this.rs.getString(2));
                this.vfb.setDisc_id(this.rs.getInt(3));
                this.vfb.setDisc(this.rs.getString(4));
                this.vfb.setQtd(this.rs.getInt(5));
                this.vfb.setDia(this.rs.getString(6));
                this.vfb.setObs(this.rs.getString(7));
                this.vfb.setTurma(this.rs.getString(8));
                this.vfb.setTurno(this.rs.getString(9));
                this.vfb.setPeriodo(this.rs.getString(10));
                this.vfb.setCurso_id(this.rs.getInt(11));
                this.vfb.setCurso(this.rs.getString(12));
                this.vfb.setStatus(this.rs.getString(13));
                this.vfb.setFalta_id(this.rs.getInt(14));
                faltas.add(this.vfb);
            }
            return faltas;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ViewFaltasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        finally{
            Database.closeConnection(this.conexao, this.stmt,this.rs);
        }    
    }
 
}
