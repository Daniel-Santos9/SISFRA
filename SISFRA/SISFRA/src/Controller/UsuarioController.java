package Controller;

import Model.BEAN.UsuarioBEAN;
import Model.DAO.UsuarioDAO;
import View.JframeAdministrador;
import View.JframeCoordenador;
import View.JframeFuncionario;
import View.JframeProfessor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsuarioController extends MainController {
    
    private UsuarioDAO userD = null;
    
    public void autentica(UsuarioBEAN u, JFrame frame){
        
        if(!u.getLogin().equals("") || !u.getSenha().equals("") ){ 
            
            userD = new UsuarioDAO();

            if(this.userD.login(u)){

                if(this.telaUser(u)!= null){
                    frame.dispose();
                }

            }
            else{
                    JOptionPane.showMessageDialog(null, "Login e/ou Senha Incorretos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo(s) de Login e/ou Senha em Branco");
        }
            
    }
    
    private JFrame telaUser (UsuarioBEAN u){
        String user = "";
        JFrame telaU = null;
        
        switch (u.getAcesso()){
            //Tela Administrador
            case 0:
                user = "ADMINISTRADOR";
                telaU = new JframeAdministrador();
                break;
            //Tela Professor
            case 1:
                user = "PROFESSOR";
                telaU = new JframeProfessor(u);
                break;
            //Tela Funcionário
            case 2:
                user = "FUNCIONÁRIO";
                telaU = new JframeFuncionario(u);
                break;
            //Tela Coordenador
            case 3:
                user = "COORDENADOR";
                telaU = new JframeCoordenador(u);
                break;
        }
        
        JOptionPane.showMessageDialog(null, "" + user + " Logado com Sucesso!!"); 
        telaU.setLocationRelativeTo(null);
        telaU.setVisible(true);
        
        return telaU;
    }

}
