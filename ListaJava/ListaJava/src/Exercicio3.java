import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        scanner.close();
    }
}
