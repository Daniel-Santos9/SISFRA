package Controller;

import Model.BEAN.CursoBEAN;
import Model.BEAN.UsuarioBEAN;
import Model.DAO.AdministradorDAO;
import Model.DAO.CursoDAO;

import Model.DAO.FuncionarioDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.UsuarioDAO;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AdministradorController extends MainController{
    
    UsuarioDAO udao = null;
    ProfessorDAO pdao = null;
    FuncionarioDAO fdao = null;
    AdministradorDAO adao = null;
    CursoDAO cursoD = null;
    CursoBEAN cursoB = null;
      
    public void cadastrarUser(UsuarioBEAN u, String nome, JComboBox curso){
    
        udao = new UsuarioDAO();
        u.setUser_id(udao.create(u));
        
        switch(u.getAcesso()){
            case 0:
                adao = new AdministradorDAO();
                if(adao.create(u,nome)== 0 ){
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar!!");
                }
                break;
            case 1:
                pdao = new ProfessorDAO();
                if(pdao.create(u,nome)== 0 ){
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar!!");
                }
                break;
            case 2:
                fdao = new FuncionarioDAO();
                if(fdao.create(u,nome) == 0 ){
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar!!");
                }
                break;
                
           /*case 3:                
                switch (this.verificaCombo(curso)) {
                    case 1:
                        pdao = new ProfessorDAO();
                        cursoD = new CursoDAO();
                        
                        int id_prof = pdao.create(u,nome);
                        
                        if( id_prof != 0 ){
                            String nome_curso = (String) curso.getSelectedItem();
                            cursoB = cursoD.search(nome_curso);
                            
                            if(pdao.addCurso(cursoB.getCurso_id(),id_prof) && cursoD.addCoord(cursoB.getCurso_id(), id_prof)){
                                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!!");
                            }
                        }
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"Selecione um curso");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Nenhum curso cadastrado");
                        break;  
                }
                break;*/
        }
                
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

    }
   
}
