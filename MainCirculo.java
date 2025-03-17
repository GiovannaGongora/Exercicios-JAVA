import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();

        // Solicita  o valor do raio
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Define o raio e exibe os dados
        circulo.setRaio(raio);
        circulo.exibeDados();

        scanner.close();
    }
}
