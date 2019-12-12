package Model.BEAN;

public class ProfessorBEAN extends UsuarioBEAN{
    
    private int prof_id;
    private String nome;
    private int curso_id;

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
