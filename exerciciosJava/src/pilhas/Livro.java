package pilhas;

public class Livro {
    private String titulo;
    private int paginas;
    private Livro anterior;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.anterior = null;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", anterior=" + anterior +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public Livro getAnterior() {
        return anterior;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }

}
