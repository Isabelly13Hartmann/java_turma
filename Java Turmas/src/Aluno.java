//Classe Aluno
public class Aluno {;
    //int currentYear = 2026;
    private int codigo = 12345;
    private String nomeProprio = "Filipe";
    private String nomeApelido = "Duarte";
    private int anoNascimento = 1999;
    private String turma = "turma";

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeApelido() {
        return nomeApelido;
    }

    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    }

    // Construtor vazio
    public Aluno() {
        this.codigo = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.turma = "";
    }

    // Construtor cheio
    public Aluno(int codigo, String nomeProprio, String nomeApelido, int anoNascimento, String turma) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }

    // Método para exibir o nome completo do aluno
    public void getNomeCompleto() {
        System.out.println("NOME COMPLETO: " + nomeProprio + " " + nomeApelido);
    }

    // Método para exibir a idade do aluno
    public void getIdade() {
        int idade = 2026 - anoNascimento;
        System.out.println("IDADE: " + idade);
    }
}
