package pilhas;

public class PilhaTest {
    public static void main(String[] args) {
        Livro livro = new Livro("título do livro", 300);
        Pilha pilha = new Pilha();

        pilha.empilhar(livro);
        System.out.println(pilha.estaVazia()); // false
        System.out.println(pilha.imprimeTodosLivros()); // título do livro
        System.out.println(pilha.espiaTopo()); // título do livro
        Livro livroDesenpilhado = pilha.desenpilhar();

    }
}
