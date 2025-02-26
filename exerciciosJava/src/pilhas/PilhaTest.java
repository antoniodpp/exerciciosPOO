package pilhas;

public class PilhaTest {
    public static void main(String[] args) {
        Livro livro = new Livro("título do livro", 300);
        Livro livro2 = new Livro("título do livro 2", 200);
        Pilha pilha = new Pilha();

        pilha.empilhar(livro);
        pilha.empilhar(livro2);
        System.out.println(pilha.estaVazia()); // false
        System.out.println(pilha.imprimeTodosLivros()); // título do livro
        System.out.println(pilha.espiaTopo()); // título do livro
        pilha.desenpilhar();
        pilha.desenpilhar();
        System.out.println(pilha.estaVazia()); // true
        pilha.imprimeTodosLivros();
    }
}
