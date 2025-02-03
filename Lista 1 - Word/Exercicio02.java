import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidade = scanner.nextInt();

        double valorTotal;
        if (quantidade <= 12) {
            valorTotal = valorUnitario * quantidade;
        } else {
            valorUnitario *= 0.90;
            valorTotal = valorUnitario * quantidade;
        }
        System.out.printf("O valor total da compra é: %.2f\n", valorTotal);
    }
}
