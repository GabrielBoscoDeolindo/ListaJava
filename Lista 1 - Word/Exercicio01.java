import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade <= 14){
            System.out.println("Criança");
        }
        else if (idade <= 17){
            System.out.println("Adolescente");
        }
        else if (idade <= 30){
            System.out.println("Adulto jovem");
        }
        else{
            System.out.println("Adulto");
        }
    }
}
