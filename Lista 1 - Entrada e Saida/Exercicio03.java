import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextInt();
        double representante = (20.0/100*valor);
        double imposto = (30.0/100*valor);

        System.out.printf("Representante: %2f\n",representante);
        System.out.printf("imposto: %2f\n",imposto);

        double valorVenda = valor+(20.0/100*valor)+(30.0/100*valor);
        System.out.printf("Total: %2f",valorVenda);
    }
}
