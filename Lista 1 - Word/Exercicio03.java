import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de gols do time A: ");
        int golsTimeA = scanner.nextInt();

        System.out.print("Digite a quantidade de gols do time B: ");
        int golsTimeB = scanner.nextInt();

        if (golsTimeA > golsTimeB) {
            System.out.println("O time A venceu!");
        } else if (golsTimeA < golsTimeB) {
            System.out.println("O time B venceu!");
        } else {
            System.out.println("Empate!");
        }
    }
}
