package poo;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123, "Alice", 18);
        Aluno aluno2 = new Aluno(456, "Bob", 20);

        System.out.println(aluno1);
        System.out.println(aluno2);

        double media = (aluno1.getIdade() + aluno2.getIdade()) / 2.0;
        System.out.println("Média de idade: " + media);
    }
}
