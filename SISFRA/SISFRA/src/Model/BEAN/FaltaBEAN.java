package Model.BEAN;

public class FaltaBEAN {
    private int falta_id;
    private int func_id;
    private int disc_id;
    private int qtd;
    private String obs;
    private String status;
    private String data;

    public int getFalta_id() {
        return falta_id;
    }

    public void setFalta_id(int falta_id) {
        this.falta_id = falta_id;
    }

    public int getFunc_id() {
        return func_id;
    }

    public void setFunc_id(int func_id) {
        this.func_id = func_id;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
