
package Controller;

import Model.BEAN.CursoBEAN;
import Model.BEAN.DisciplinaBEAN;
import Model.BEAN.FaltaBEAN;
import Model.BEAN.FuncionarioBEAN;
import Model.BEAN.ProfessorBEAN;
import Model.BEAN.TurmaBEAN;
import Model.BEAN.UsuarioBEAN;
import Model.BEAN.ViewFaltasBEAN;
import Model.BEAN.ViewRdtBEAN;
import Model.DAO.CursoDAO;
import Model.DAO.FaltaDAO;
import Model.DAO.FuncionarioDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.TurmaDAO;
import Model.DAO.ViewFaltasDAO;
import Model.DAO.ViewRdtDAO;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController extends MainController{
    
    private FuncionarioBEAN funcB = null;
    private CursoBEAN cursoB = null;
    private TurmaBEAN turmaB = null;
    private ViewRdtBEAN vrdB = null;
    
    private List<ViewFaltasBEAN> faltas = null;
    private List<CursoBEAN> cursos = null;
    private List<TurmaBEAN> turmas = null;
    private List<TurmaBEAN> turnos = null;
    private List<ViewRdtBEAN> disciplinas = null;
    private List<ProfessorBEAN> professores = null;
    
    private ViewFaltasDAO vfd = null;
    private ViewRdtDAO vrdD = null;
    private FuncionarioDAO funcD = null;
    private CursoDAO cursoD = null;
    private TurmaDAO turmaD = null;
    private ProfessorDAO profD = null;
    private FaltaDAO faltaD = null;
    
    private DefaultTableModel model = null;
    private String turno = "";
    
    public void loadFaltasTable(JTable tabela, int id_user, String status) {
        this.model = (DefaultTableModel) tabela.getModel();
        this.model.setNumRows(0);
        this.vfd = new ViewFaltasDAO();
        
        this.funcD = new FuncionarioDAO();
        this.funcB = this.funcD.search(id_user);
        this.faltas = this.vfd.readFunc(this.funcB.getFunc_id(), status);
        
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
    
    public void loadTurnoCombo(JComboBox curso, JComboBox turno){
        
        if(curso.getItemCount()>0){
            
            if(curso.getSelectedIndex()!=-1){
                this.cursoB = (CursoBEAN) curso.getSelectedItem();
                
                this.turmaD = new TurmaDAO();
                this.turnos = this.turmaD.readAll(this.cursoB.getCurso_id());

                turno.removeAllItems();
                this.turnos.forEach((b) -> {
                    turno.addItem(b.getTurno());
                });

                turno.setSelectedIndex(-1);
                turno.setEnabled(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione um curso antes");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Não há nenhum curso cadastrado");
        }
    }
    
    public void loadTurmaCombo(JComboBox curso, JComboBox turma, JComboBox turno){

        if(turno.getItemCount()>0){
            
            if(turno.getSelectedIndex()!=-1){
                this.cursoB = (CursoBEAN) curso.getSelectedItem();
                this.turno = (String) turno.getSelectedItem();
                
                this.turmaD = new TurmaDAO();
                this.turmas = this.turmaD.readAll(this.cursoB.getCurso_id(),this.turno);

                turma.removeAllItems();
                this.turmas.forEach((b) -> {
                    turma.addItem(b);
                });

                turma.setSelectedIndex(-1);
                turma.setEnabled(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione um turno antes");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Não há nenhum Turno Cadastrado");
        }
    }
    
    public void loadDisciplinaCombo(JComboBox turma, JComboBox disciplina){
        
        if(turma.getItemCount()>0){
            
            if(turma.getSelectedIndex()!=-1){
                this.turmaB = (TurmaBEAN) turma.getSelectedItem();
                
                this.vrdD = new ViewRdtDAO();
                this.disciplinas = this.vrdD.readAll(this.turmaB.getTurma_id());

                disciplina.removeAllItems();
                this.disciplinas.forEach((b) -> {
                    disciplina.addItem(b);
                });

                disciplina.setSelectedIndex(-1);
                disciplina.setEnabled(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione uma turma");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Não há nenhuma Turma");
        }
    }
    
    public void loadProfessorCombo(JComboBox disciplina, JComboBox professor){
        if(disciplina.getItemCount()>0){
            
            if(disciplina.getSelectedIndex()!=-1){
                this.vrdB = (ViewRdtBEAN) disciplina.getSelectedItem();
                
                this.profD = new ProfessorDAO();
                this.professores = this.profD.readAll(this.vrdB.getDisc_id());

                professor.removeAllItems();
                this.professores.forEach((b) -> {
                    professor.addItem(b);
                });

                professor.setSelectedIndex(-1);
                professor.setEnabled(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione uma disciplina");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Não há nenhuma Disciplina");
        }
    }
    
    public FuncionarioBEAN recuperaFunc(UsuarioBEAN u){
        this.funcD = new FuncionarioDAO();
        if(funcD.search(u.getUser_id())!= null){
            this.funcB = funcD.search(u.getUser_id());
        }
        
            return this.funcB; 
    }
    
    public void cadastrarFalta(FaltaBEAN falta,JComboBox disciplina,
            JComboBox turma, JComboBox curso, JComboBox professor,
            JComboBox turno, int id_func, JTextField tex, JFormattedTextField data ){
        
        switch (this.verificaCombo(curso)) {
            case 1:
                switch (this.verificaCombo(turno)) {
                    case 1:
                        switch (this.verificaCombo(turma)) {
                            case 1:
                                switch (this.verificaCombo(disciplina)) {
                                    case 1:
                                        this.vrdB = (ViewRdtBEAN) disciplina.getSelectedItem();
                                        switch (this.verificaCombo(professor)) {
                                            case 1:
                                                if(!falta.getData().equals("")){
                                                
                                                    if(falta.getQtd()>0){
                                                        this.faltaD = new FaltaDAO();
                                                        if(faltaD.create(falta, this.vrdB.getDisc_id(), id_func) !=0){
                                                            JOptionPane.showMessageDialog(null,"Falta cadastrada com sucesso");
                                                            this.LimpaCombo(professor);
                                                            this.LimpaCombo(disciplina);
                                                            this.LimpaCombo(turno);
                                                            this.LimpaCombo(turma);
                                                            curso.setSelectedIndex(-1);
                                                            tex.setText("");
                                                            data.setText("");
                                                        }
                                                        else{
                                                            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar falta");
                                                        }
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"Quantidade não pode ser menor ou igual a zero");
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null,"Data inválida e/ou vazia");
                                                }
                                                break;
                                            case 0:
                                                JOptionPane.showMessageDialog(null,"Selecione um professor");
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null,"Nenhum professor cadastrado");
                                                break;
                                        }
                                        break;
                                    case 0:
                                        JOptionPane.showMessageDialog(null,"Selecione uma disciplina");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null,"Nenhuma disciplina cadastrada");
                                        break;
                                }
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null,"Selecione uma turma");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Nenhuma turma cadastrada");
                                break;
                        }
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"Selecione um turno");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Nenhum turno cadastrado"); 
                        break;
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Selecione uma disciplina");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Nenhuma disciplina cadastrada");
                break;  
        }

    }
    
}
