public class Engenheiro {
    private int idEngenheiro;
    private String nomeEngenheiro;
    private String especialidade;

    public Engenheiro(int idEngenheiro, String nomeEngenheiro, String especialidade) {
        this.idEngenheiro = idEngenheiro;
        this.nomeEngenheiro = nomeEngenheiro;
        this.especialidade = especialidade;
    }

    public Engenheiro(String nomeEngenheiro, String especialidade) {
        this.nomeEngenheiro = nomeEngenheiro;
        this.especialidade = especialidade;
    }

    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public void setIdEngenheiro(int idEngenheiro) {
        this.idEngenheiro = idEngenheiro;
    }

    public String getNomeEngenheiro() {
        return nomeEngenheiro;
    }

    public void setNomeEngenheiro(String nomeEngenheiro) {
        this.nomeEngenheiro = nomeEngenheiro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Engenheiro [idEngenheiro=" + idEngenheiro + ", nomeEngenheiro=" + nomeEngenheiro + ", especialidade=" + especialidade + "]";
    }
}
