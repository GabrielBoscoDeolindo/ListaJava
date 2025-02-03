import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
