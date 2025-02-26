package poo;

public class Aluno {
    // Atributos imutáveis
    private int matricula;
    private String nome;
    private int idade;

    // Construtor
    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters (Sem Setters para atributos finais)
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", idade=" + idade + "]";
    }

    // Método main para teste
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123, "Alice", 18);
        Aluno aluno2 = new Aluno(456, "Bob", 20);

        System.out.println(aluno1);
        System.out.println(aluno2);

        System.out.println("Média de idade: " + (aluno1.getIdade() + aluno2.getIdade()) / 2);
    }
}
