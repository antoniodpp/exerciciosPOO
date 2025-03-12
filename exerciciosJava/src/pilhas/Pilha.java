package pilhas;

public class Pilha {
    private Livro topo;

    public boolean estaVazia() {
        return topo == null;
    }

    // Pilha vazia
    public void empilhar(Livro livro) {
        if (estaVazia()) {
            topo = livro;
        } else {
            Livro temp = topo;
            topo = livro;
            topo.setAnterior(temp);
        }
    }

    public Livro desenpilhar() {
        if (!estaVazia()) {
            Livro livro = topo;
            topo = topo.getAnterior();
            return livro;
        }
        return null;
    }

    public String espiaTopo() {
        if (!estaVazia()) {
            return topo.toString();
        }
        return "Pilha vazia!";
    }

    public String imprimeTodosLivros() {
        if (estaVazia()) {
            return "Pilha vazia!";
        } else {
            String retorno = "";
            Livro auxiliar = topo;
            while (auxiliar != null) {
                retorno += auxiliar.toString() + ",";
                auxiliar = auxiliar.getAnterior();
            }
            return retorno.substring(0, retorno.length() - 1) + ".";
        }
    }
    public String getTopo() {
        return topo.getTitulo();
    }

}