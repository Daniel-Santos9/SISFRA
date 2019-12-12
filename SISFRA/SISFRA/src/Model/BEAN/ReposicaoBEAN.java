package Model.BEAN;

public class ReposicaoBEAN {
    private int rep_id;
    private int disc_id;
    private int falta_id;// colocar no BD DEPOIS
    private int qtd;
    private String dia;
    private String turno;
    private String status;

    public int getRep_id() {
        return rep_id;
    }

    public void setRep_id(int rep_id) {
        this.rep_id = rep_id;
    }

    public int getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFalta_id() {
        return falta_id;
    }

    public void setFalta_id(int falta_id) {
        this.falta_id = falta_id;
    }
}
