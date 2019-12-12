package Model.BEAN;

public class FuncionarioBEAN extends UsuarioBEAN{
    
    private int func_id;
    private String nome;

    public int getFunc_id() {
        return func_id;
    }

    public void setFunc_id(int func_id) {
        this.func_id = func_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
