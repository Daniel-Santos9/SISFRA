package Model.BEAN;

public class AulaBEAN {
    private int aula_id;
    private int disc_id;
    private int turma_id;
    private int hora_id;
    private String dia;

    public int getAula_id() {
        return aula_id;
    }

    public void setAula_id(int aula_id) {
        this.aula_id = aula_id;
    }

    public int getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
    }

    public int getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(int turma_id) {
        this.turma_id = turma_id;
    }

    public int getHora_id() {
        return hora_id;
    }

    public void setHora_id(int hora_id) {
        this.hora_id = hora_id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
