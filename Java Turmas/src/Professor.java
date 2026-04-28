//Classe 
public class Professor {
    private int numero = 12345;
    private String nomeProprio = "Luís";
    private String nomeApelido = "Santos";
    private int anoNascimento = 1999;
    private String area = "Programação";

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // toString
    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", area=" + area + "]";
    }

    // Construtor vazio
    public Professor() {
        this.numero = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.area = "";
    }

    // Construtor cheio
    public Professor(int numero, String nomeProprio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }

    // Método para exibir o nome completo do professor
    public String getNomeCompleto() {
        return (nomeProprio + " " + nomeApelido);
    }

}
