import java.util.Date;

public class Projeto {
    private int idProjeto;
    private String nomeProjeto;
    private String local;
    private Date dataInicio;
    private Date dataTermino;

    // Construtores
    public Projeto(int idProjeto, String nomeProjeto, String local, Date dataInicio, Date dataTermino) {
        this.idProjeto = idProjeto;
        this.nomeProjeto = nomeProjeto;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public Projeto(String nomeProjeto, String local, Date dataInicio, Date dataTermino) {
        this.nomeProjeto = nomeProjeto;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Getters e Setters
    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Projeto [idProjeto=" + idProjeto + ", nomeProjeto=" + nomeProjeto + ", local=" + local + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + "]";
    }
}
