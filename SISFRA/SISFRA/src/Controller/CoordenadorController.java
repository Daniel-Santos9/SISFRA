package Controller;

import Model.BEAN.ProfessorBEAN;
import Model.BEAN.ViewFaltasBEAN;
import Model.BEAN.ViewReposicaoBEAN;
import Model.DAO.ProfessorDAO;
import Model.DAO.ViewFaltasDAO;
import Model.DAO.ViewReposicaoDAO;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CoordenadorController extends ProfessorController{
    
    private ProfessorBEAN profB = null;
    private ProfessorDAO profD = null;
    private List<ViewFaltasBEAN> faltas = null;
    private List<ViewReposicaoBEAN> reposicoes = null;
    private ViewFaltasDAO vfd = null;
    private ViewReposicaoDAO vrd = null; 
    private DefaultTableModel model = null;
    
    public void loadFaltasTable(JTable tabela, int id_user, String status) {
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
        this.vfd = new ViewFaltasDAO();
        
        this.profD = new ProfessorDAO();
        this.profB = this.profD.search(id_user);
        this.faltas = this.vfd.readCoord(this.profB.getCurso_id(), status);
        
        this.faltas.forEach((f) -> {
            this.model.addRow(new Object[]{
                f.getFalta_id(),
                f.getDisc(),
                f.getTurno(),
                f.getTurma(),
                f.getCurso(),
                f.getPeriodo(),
                f.getProf(),
                f.getDia(),
                f.getQtd(),
                f.getObs()
            });
        });  
    }
    
    public void loadReposicaoTable(JTable tabela, int id_user, String status) {
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
        this.vrd = new ViewReposicaoDAO();
        
        this.profD = new ProfessorDAO();
        this.profB = this.profD.search(id_user);
        this.reposicoes = vrd.readCoord(this.profB.getCurso_id(), status);
        
        this.reposicoes.forEach((f) -> {
            this.model.addRow(new Object[]{
                f.getRep_id(),
                f.getDisc(),
                f.getTurno(),
                f.getTurma(),
                f.getCurso(),
                f.getPeriodo(),
                f.getProf(),
                f.getDia(),
                f.getQtd(),
            });
        });  
    }

}
