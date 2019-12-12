package Model.BEAN;

public class AdministradorBEAN extends UsuarioBEAN {
    
    private int admin_id;
    private String nome;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
