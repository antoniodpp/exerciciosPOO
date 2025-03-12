package pilhas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuasPilhasTest {

    Pilha pOriginal = new Pilha();
    Pilha pSecudarian = new Pilha();

    @Test
    public void testarPilhas(){
        pOriginal.empilhar(new Livro("teste1", 10));
        pOriginal.empilhar(new Livro("teste2",20 ));
        pOriginal.empilhar(new Livro("teste3", 30));

        System.out.println(pOriginal.getTopo());



    }
}
