public class Livro {
    private String titulo;
    private String autor;
    private int dataPubli;
    private boolean disponivel;


    public Livro (String titulo, String autor, int dataPubli){

        this.titulo = titulo;
        this.autor = autor;
        this.dataPubli = dataPubli;
        this.disponivel = true;

    }
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao() {
        return dataPubli;
    }

    public boolean Disponivel() {
        return disponivel;

    }

    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + dataPubli + ")";
    }

}