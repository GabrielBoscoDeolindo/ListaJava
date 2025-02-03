import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Escolha uma opção [1]pares [2]impares [3]negativos [4]positivos [5]Sair: ");
        int opcao = scanner.nextInt();

        int pares = 0;
        int impares = 0;
        int negativos = 0;
        int positivos = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (numeros[i] < 0) {
                negativos++;
            } else if (numeros[i] > 0) {
                positivos++;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println("Quantidade de números pares: " + pares);
                break;
            case 2:
                System.out.println("Quantidade de números ímpares: " + impares);
                break;
            case 3:
                System.out.println("Quantidade de números negativos: " + negativos);
                break;
            case 4:
                System.out.println("Quantidade de números positivos: " + positivos);
                break;
            case 5:
                System.out.println("Saindo");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}
