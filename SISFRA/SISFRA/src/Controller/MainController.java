package Controller;

import Model.BEAN.CursoBEAN;
import Model.DAO.CursoDAO;
import java.awt.*;
import java.util.List;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.JMenu;

public class MainController{
    private Date data = null;
    private SimpleDateFormat formato = null;
    private String strgform = "";
    private CursoDAO cursoD = null;
    private List<CursoBEAN> cursos = null;
    
    public  void LimpaTela(JFrame frame) {     
        //limpa os campos     
        for (int i=0; i < frame.getContentPane().getComponentCount(); i++) {   
            //varre todos os componentes     
            Component c = frame.getContentPane().getComponent(i);     
            if (c instanceof JTextField) {                           
                JTextField texto = (JTextField) c;   
                texto.setText("");                      
            }
            else if(c instanceof JComboBox){
                JComboBox box = (JComboBox) c;
                box.setSelectedIndex(-1);
            }
            else if(c instanceof JPasswordField){
                JPasswordField senha = (JPasswordField) c;   
                senha.setText("");   
            }
        }   
    }
    
    public void LimpaCombo(JComboBox combo){
        combo.setSelectedIndex(-1);
        combo.setEnabled(false);
    }
    
    public void LimpaJtext(JTextField texto){
        texto.setText("");  
    }
    
    public void corMenu(JMenuBar menu){

        menu.setUI(new BasicMenuBarUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(new Color(0,153,102));
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
        });
        
        MenuElement[] menus = menu.getSubElements();

         for (MenuElement menuElement : menus) {

             JMenu item_menu = (JMenu) menuElement.getComponent();
             changeComponentColors(item_menu);
             item_menu.setOpaque(true);

             MenuElement[] menuElements = item_menu.getSubElements();

             for (MenuElement popupMenuElement : menuElements) {

                 JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                 popupMenu.setBorder(null);

                 MenuElement[] menuItens = popupMenuElement.getSubElements();

                 for (MenuElement menuItemElement : menuItens) {

                     JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                     changeComponentColors(menuItem);
                     menuItem.setOpaque(true);

                 }
             }
         }

        menu.setOpaque(true);
        menu.setBackground(Color.CYAN);
    }
    
    private void changeComponentColors(Component comp) {
        comp.setBackground(new Color(0,130,102));
        comp.setFont(new Font("Arial",Font.BOLD,14));
        comp.setForeground(Color.white);
    }
    
    private boolean verificaData(String dataS){
        this.formato = new SimpleDateFormat("dd/MM/yyyy");
        this.formato.setLenient(false);  

        try {
            this.data = this.formato.parse(dataS);
            return true;

        } catch(ParseException e) {
            return false;
        }
    }
    
    public String converterDataBD(JFormattedTextField d){
        if(this.verificaData(d.getText())){
            this.formato = new SimpleDateFormat("yyyy/MM/dd"); 
            this.strgform = this.formato.format(this.data);
            return this.strgform;
        }
        else{
            d.setText("");
            return this.strgform;
        }
    }
    
    public String converterDataTable(String dataBD){
        this.formato = new SimpleDateFormat("yyyy/MM/dd"); 
        this.strgform = this.formato.format(dataBD);
        return this.strgform;
    }
    
    public void isNumeric(java.awt.event.KeyEvent evt){
        String caracteres="0987654321";
     
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }
    
    public void isText(java.awt.event.KeyEvent evt){
        String caracteres="abcdefghijklmnopqrstuvxywzãéíçABCDEFGHIJLLMNOPQRSTUXYWZÃÉÍÇ";
     
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }
    
    public int verificaCombo(JComboBox box){
    
        if(box.getItemCount()>0){
            
            if(box.getSelectedIndex()!=-1){
                return 1;

            }
            else{
                return 0; // se não tiver selecionado um item
            }
        }
        else{
            return -1; // Se não tiver linhas no combo
        }
    }
    
    public void loadCursoCombo(JComboBox curso){
        this.cursoD = new CursoDAO();
        this.cursos = this.cursoD.readAll();
        curso.removeAllItems();
        this.cursos.forEach((b) -> {
            curso.addItem(b);
        });

        curso.setSelectedIndex(-1);
    }
    
}


