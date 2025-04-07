import java.util.Scanner;

public class desafio_estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-----DIGITE \"sair\" PARA SAIR-----");
        while (true){
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.next();
            System.out.print("Digite o preço do produto: ");
            float preco = scanner.nextFloat();
            System.out.print("Digite a quantidade do produto: ");
            int quant = scanner.nextInt();
        }
    }
}
