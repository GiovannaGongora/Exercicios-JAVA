import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📚 Sistema de Gerenciamento da Biblioteca 📚");
            System.out.println("1️⃣ Adicionar Livro");
            System.out.println("2️⃣ Adicionar Usuário");
            System.out.println("3️⃣ Listar Livros Disponíveis");
            System.out.println("4️⃣ Emprestar Livro");
            System.out.println("5️⃣ Devolver Livro");
            System.out.println("6️⃣ Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano));
                    break;

                case 2:
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("ID do usuário: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.adicionarUsuario(new Usuario(nomeUsuario, idUsuario));
                    break;

                case 3:
                    biblioteca.listarLivrosDisponiveis();
                    break;

                case 4:
                    System.out.print("ID do usuário: ");
                    int idEmprestimo = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuarioEmprestimo = biblioteca.buscarUsuarioPorId(idEmprestimo);
                    if (usuarioEmprestimo == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }
                    System.out.print("Título do livro a emprestar: ");
                    String tituloEmprestimo = scanner.nextLine();
                    Livro livroEmprestimo = biblioteca.buscarLivroPorTitulo(tituloEmprestimo);
                    if (livroEmprestimo == null) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        usuarioEmprestimo.pegarEmprestado(livroEmprestimo);
                    }
                    break;

                case 5:
                    System.out.print("ID do usuário: ");
                    int idDevolucao = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuarioDevolucao = biblioteca.buscarUsuarioPorId(idDevolucao);
                    if (usuarioDevolucao == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }
                    System.out.print("Título do livro a devolver: ");
                    String tituloDevolucao = scanner.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivroPorTitulo(tituloDevolucao);
                    if (livroDevolucao == null) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        usuarioDevolucao.devolverLivro(livroDevolucao);
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
