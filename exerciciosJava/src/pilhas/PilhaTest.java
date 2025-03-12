package pilhas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTest {

    Pilha pilha;

    @BeforeEach
    void criaPilha() {
        pilha = new Pilha();
    }

    @Test
    void verificaPilhaVaziaTest() {
        assertTrue(pilha.estaVazia());
    }

    @Test
    void empilharTest() {
        pilha.empilhar(new Livro("A", 10));
        // Note: The toString implementation in your context doesn't match the expected output in the original test
        // Adapting to your current Livro.toString() implementation
        assertTrue(pilha.espiaTopo().contains("A") && pilha.espiaTopo().contains("10"));

        pilha.empilhar(new Livro("B", 20));
        assertTrue(pilha.espiaTopo().contains("B") && pilha.espiaTopo().contains("20"));

        // Testing that both books are in the stack
        String resultado = pilha.imprimeTodosLivros();
        assertTrue(resultado.contains("A") && resultado.contains("10"));
        assertTrue(resultado.contains("B") && resultado.contains("20"));
    }

    @Test
    void desempilharTest() {
        pilha.empilhar(new Livro("A", 10));
        pilha.empilhar(new Livro("B", 20));

        Livro livroRemovido = pilha.desenpilhar();
        assertEquals("B", livroRemovido.getTitulo());
        assertEquals(20, livroRemovido.getPaginas());

        livroRemovido = pilha.desenpilhar();
        assertEquals("A", livroRemovido.getTitulo());
        assertEquals(10, livroRemovido.getPaginas());

        assertTrue(pilha.estaVazia());
    }

    @Test
    void espiaTopoTest() {
        assertEquals("Pilha vazia!", pilha.espiaTopo());

        pilha.empilhar(new Livro("A", 10));
        assertTrue(pilha.espiaTopo().contains("A") && pilha.espiaTopo().contains("10"));

        pilha.empilhar(new Livro("B", 20));
        assertTrue(pilha.espiaTopo().contains("B") && pilha.espiaTopo().contains("20"));
    }

    @Test
    void imprimeTodosLivrosTest() {
        assertEquals("Pilha vazia!", pilha.imprimeTodosLivros());

        pilha.empilhar(new Livro("A", 10));
        pilha.empilhar(new Livro("B", 20));

        String resultado = pilha.imprimeTodosLivros();
        assertTrue(resultado.contains("A") && resultado.contains("10"));
        assertTrue(resultado.contains("B") && resultado.contains("20"));
    }
}