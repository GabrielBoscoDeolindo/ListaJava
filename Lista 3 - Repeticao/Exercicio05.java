import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = new String();
        int saldo = 0;
        int SaldoPositivo = 0;
        int SaldoNegativo = 0;
        do{
            System.out.print("Digite seu saldo atual: ");
            saldo = scanner.nextInt();
            if (saldo>0){
                SaldoPositivo++;
            }
            else{
                SaldoNegativo++;
            }
            System.out.print("Deseja continuar? (S/N): ");
            repeat = scanner.next();
        } while (repeat.equals("S"));

        if (SaldoPositivo < SaldoNegativo){
            System.out.println("Risco ao banco");
        }
        else{
            System.out.println("Nenhum risco");
        }
    }
}
