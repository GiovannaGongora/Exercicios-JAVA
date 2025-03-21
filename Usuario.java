import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Usuario (String nome, int id){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void pegarEmprestado(Livro livro) {
        if (livro.Disponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            System.out.println(nome + " pegou o livro: " + livro.getTitulo());
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("Este livro não foi emprestado por " + nome);
        }
    }

}