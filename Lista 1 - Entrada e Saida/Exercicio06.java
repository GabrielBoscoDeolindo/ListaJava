import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double peso1 = 0.4;
        double peso2 = 0.6;

        double mediaPonderada = (nota1 * peso1) + (nota2 * peso2);
        System.out.printf("A media ponderada é: %.2f\n", mediaPonderada);
    }
}
