public class App {
    public static void main(String[] args) throws Exception {
        // Criar um professor
        Professor professor = new Professor(12345, "Luis", "Silva", 1970, "Matemática");

        // Criar uma turma
        Turma turma = new Turma("T01", "Engenharia de Software", 2022, 2025);

        // Criar tres alunos
        Aluno aluno1 = new Aluno(1, "Isabelly", "Hartmann", 2009, "T01");
        Aluno aluno2 = new Aluno(2, "Kenai", "Santos", 2008, "T01");
        Aluno aluno3 = new Aluno(3, "Thiago", "Oliveira", 2010, "T01");

        // Exibir informações do professor
        System.out.println("Informações do Professor:");
        System.out.println(professor);

        // Exibir informações da turma
        System.out.println("\nInformações da Turma:");
        System.out.println(turma);

        // Exibir informações dos alunos
        System.out.println("\nInformações dos Alunos:");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

        String aux = professor.getNomeCompleto();
        System.out.println("Informacao do professor: " + aux);

        aux = turma.getInfoTurma();
        System.out.println("Informacao da turma: " + aux);

        aluno1.getNomeCompleto();
        aluno1.getIdade();

        aluno2.getNomeCompleto();
        aluno2.getIdade();

        aluno3.getNomeCompleto();
        aluno3.getIdade();

    }
}
