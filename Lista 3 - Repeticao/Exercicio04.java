import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("número: ");
        int numero = scanner.nextInt();
        System.out.print("incremento: ");
        int incremento = scanner.nextInt();

        for (int i = 0; i <= numero; i += incremento) {
            System.out.println(i);
        }
        scanner.close();
    }
}
