package Controller;

import Model.BEAN.DisciplinaBEAN;
import Model.BEAN.ProfessorBEAN;
import Model.BEAN.ReposicaoBEAN;
import Model.BEAN.ViewFaltasBEAN;
import Model.BEAN.ViewReposicaoBEAN;
import Model.DAO.DisciplinaDAO;
import Model.DAO.FaltaDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.ReposicaoDAO;
import Model.DAO.ViewFaltasDAO;
import Model.DAO.ViewReposicaoDAO;
import View.JframeCadastrarReposicao;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProfessorController extends MainController{

    private ProfessorBEAN profB = null;
    private DisciplinaBEAN discB = null;
    private DisciplinaDAO discD = null;
    private ProfessorDAO profD = null;
    private List<ViewFaltasBEAN> faltas = null;
    private List<ViewReposicaoBEAN> reposicoes = null;
    private DefaultTableModel model = null;
    private ViewFaltasBEAN vfb = null;
    private ViewFaltasDAO vfd = null;
    private ViewReposicaoDAO vrd = null; 
    private ReposicaoDAO repD = null;
    private FaltaDAO faltaD = null;
    private ReposicaoBEAN repB  = null;
    private int falta_id, reposicao_id;
    
    
    public void loadFaltasTableProf(JTable tabela, int id_user, String status) {
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
        this.vfd = new ViewFaltasDAO();
        
        this.profD = new ProfessorDAO();
        this.profB = this.profD.search(id_user);
        this.faltas = vfd.readProf(this.profB.getProf_id(), status);
        
        this.faltas.forEach((f) -> {
            this.model.addRow(new Object[]{
                f.getFalta_id(),
                f.getDisc(),
                f.getTurno(),
                f.getTurma(),
                f.getCurso(),
                f.getPeriodo(),
                f.getDia(),
                f.getQtd(),
                f.getObs()
            });
        });  
    }
 
    public void loadReposicaoTableProf(JTable tabela, int id_user, String status) {
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
        this.vrd = new ViewReposicaoDAO();
        
        this.profD = new ProfessorDAO();
        this.profB = this.profD.search(id_user);
        this.reposicoes = vrd.readProf(this.profB.getProf_id(), status);
        
        this.reposicoes.forEach((f) -> {
            this.model.addRow(new Object[]{
                f.getRep_id(),
                f.getDisc(),
                f.getTurno(),
                f.getTurma(),
                f.getCurso(),
                f.getPeriodo(),
                f.getDia(),
                f.getQtd()
            });
        });  
    }
    
    public void marcarReposi(JTable tabela, int id_user){
        
        if(tabela.getModel().getRowCount() > 0){
  
            if (tabela.getSelectedRow() != -1) {
                profD = new ProfessorDAO();
                discD = new DisciplinaDAO();
                
                profB = profD.search(id_user);
                discB = discD.search((String) tabela.getValueAt(tabela.getSelectedRow(), 1));
                
                vfb = new ViewFaltasBEAN();
                vfb.setFalta_id((int) tabela.getValueAt(tabela.getSelectedRow(),0));
                vfb.setDisc((String) tabela.getValueAt(tabela.getSelectedRow(), 1));
                vfb.setTurno((String) tabela.getValueAt(tabela.getSelectedRow(), 2));
                vfb.setTurma((String) tabela.getValueAt(tabela.getSelectedRow(), 3));
                vfb.setQtd((int) tabela.getValueAt(tabela.getSelectedRow(),7));
                vfb.setProf_id(profB.getProf_id());
                vfb.setProf(profB.getNome());
                vfb.setDisc_id(discB.getDisc_id());
                
                JframeCadastrarReposicao cad_repo = new JframeCadastrarReposicao(vfb, id_user);
                cad_repo.setVisible(true);
                cad_repo.setLocationRelativeTo(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Selecione uma falta para continuar!!");
            }
       }
       else{
            JOptionPane.showMessageDialog(null, "Nenhum registro na tabela!!");   
        }
    }
    
    public void cadastrarReposi(ReposicaoBEAN repB, JFrame j){
        if(!repB.getDia().equals("")){
            
            if(repB.getQtd()>0){
                this.repD = new ReposicaoDAO();
                
                if(this.repD.create(repB) != 0){
                    JOptionPane.showMessageDialog(null, "Reposição Marcada");
                    j.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro ao Marca Reposição");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "A quantidade não pode ser menor ou igual a zero");  
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Inválida/Vazia!!");
        }
    }
        
    public void atualizaFaltaStatus(JTable tabela, String status){

        if(tabela.getModel().getRowCount() > 0){
            
            if (tabela.getSelectedRow() != -1) {
                
                this.falta_id = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
                faltaD = new FaltaDAO();
                if(faltaD.update(this.falta_id, status)){

                    if(status.equals("ACC")){
                        JOptionPane.showMessageDialog(null, "Falta confirmada!!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Falta cancelada!!");
                    }
                }
                else{
                    if(status.equals("ACC")){
                        JOptionPane.showMessageDialog(null, "Erro ao confirmar Falta!!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao cancelar Falta!!");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Selecione uma falta para continuar!!");
            }
       }
       else{
            JOptionPane.showMessageDialog(null, "Nenhum registro na tabela!!");   
        }
    }
    
    public void atualizaReposicaoStatus(JTable tabela, String status){

        if(tabela.getModel().getRowCount() > 0){
            
            if (tabela.getSelectedRow() != -1) {
                
                this.reposicao_id = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
                this.repD = new ReposicaoDAO();
                if(this.repD.update(this.reposicao_id, status)){

                    if(status.equals("ACC") && this.aulaReposta()){    
                        JOptionPane.showMessageDialog(null, "Reposição confirmada!!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Reposição cancelada!!");
                    }
                }
                else{
                    if(status.equals("ACC")){
                        JOptionPane.showMessageDialog(null, "Erro ao confirmar Reposição!!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao cancelar Reposição!!");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Selecione uma falta para continuar!!");
            }
       }
       else{
            JOptionPane.showMessageDialog(null, "Nenhum registro na tabela!!");   
        }
    }
    
    //Função que quando o Coordenador confirma a reposição, indica que a falta foi reposta
    private boolean aulaReposta(){
         this.repB = this.repD.search(this.reposicao_id);
         this.faltaD = new FaltaDAO();
         return this.faltaD.update(this.repB.getFalta_id(),"PAG");
    }
    
    public void loadCombo(String turno ,JComboBox combo){
    
        switch (turno){
            case "M":
                combo.addItem("T");
                combo.addItem("N");
                break;
            case "T":
                combo.addItem("M");
                combo.addItem("N");
                break;
            case "N":
                combo.addItem("M");
                combo.addItem("T");
                break;
        }
    }
}
