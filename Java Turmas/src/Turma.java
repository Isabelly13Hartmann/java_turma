//Classe Turma
public class Turma {
    private String codigo = "CX12345";
    private String nomeCurso = "Programador Informática";
    private int ano = 2025;
    private int anoFim = 2026;

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    // toString
    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", ano=" + ano + ", anoFim=" + anoFim + "]";
    }

    // Construtor vazio
    public Turma() {
        this.codigo = "";
        this.nomeCurso = "";
        this.ano = 0;
        this.anoFim = 0;
    }

    // Construtor cheio
    public Turma(String codigo, String nomeCurso, int ano, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.ano = ano;
        this.anoFim = anoFim;
    }

    // Método para exibir as informações da turma
    public String getInfoTurma() {
        return "CÓDIGO: " + codigo + "\nNOME DO CURSO: " + nomeCurso + "\nANO DE INÍCIO: " + ano + "\nANO DE FIM: "
                + anoFim;
    }

}
