import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorte = random.nextInt(10) + 1;
        for (int i=0; i<3; i++) {
            System.out.print("Qual o número da sorte (1 a 100): ");
            int numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido == numeroSorte) {
                System.out.println("Você acertou!");
                break;
            } else{
                System.out.println("Errou!");
            }
        }
    }
}
