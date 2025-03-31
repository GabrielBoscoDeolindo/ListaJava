import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);
            
            int resultado = 0;
            
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida.");
            }
            
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("impossivel dividir pro zero amigo");
        } catch (Exception e) {
            System.out.println("isso não é um número RAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } 
    }
}
