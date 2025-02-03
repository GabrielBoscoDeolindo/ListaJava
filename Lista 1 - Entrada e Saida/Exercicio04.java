import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("Seu antecessor é %d\n",num-1);
        System.out.printf("Seu sucessor é %d\n", num+1);
    }
}
