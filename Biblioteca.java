import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.Disponivel()) {
                System.out.println(livro);
            }
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().trim().equalsIgnoreCase(titulo.trim())) {
                return livro;
            }
        }
        return null;
    }
    
}
