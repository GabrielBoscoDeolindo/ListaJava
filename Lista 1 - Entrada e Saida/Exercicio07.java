import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o vendedor: ");
        String nomeVendedor = scanner.nextLine();
        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        double salario = 1500.00;
        double comissaoPorCarro = 350.00;
        double percentualComissaoTotal = 0.001 / 100;
        double comissaoCarrosVendidos = carrosVendidos * comissaoPorCarro;
        double comissaoTotal = valorTotalVendas * percentualComissaoTotal;
        double salarioTotal = salario + comissaoCarrosVendidos + comissaoTotal;

        System.out.printf("\nSalário do vendedor %s no mês de %s:\n", nomeVendedor, mes);
        System.out.printf("Salário base: %.2f\n", salario);
        System.out.printf("Comissão por carro: R$ %.2f\n", comissaoCarrosVendidos);
        System.out.printf("Comissão do valor total das vendas: %.2f\n", comissaoTotal);
        System.out.printf("Salário total: R$ %.2f\n", salarioTotal);
    }
}
