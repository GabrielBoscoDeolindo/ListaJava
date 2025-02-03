import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alternativa = 0;
        System.out.println("Que pergunta deseja responder? [1/2]");
        int escolha = scanner.nextInt();
        if (escolha == 1){
        System.out.println("Qual o preço do medo abundante de todas as verdades?");
        System.out.println("1- Aerofolio pro meu carro");
        System.out.println("2- Horrores além da compreensão humana");
        System.out.println("3- Ablueblueblue");
        alternativa = scanner.nextInt();
        if (alternativa == 2){
            System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
        } else {
            System.out.println("Você não acertou, mas tente novamente numa próxima");
        }
        } else {
        System.out.println("1+1");
        System.out.println("1- 2");
        System.out.println("2- 5");
        System.out.println("3- 10");
        alternativa = scanner.nextInt();
        if (alternativa == 1){
            System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
        } else {
            System.out.println("Você não acertou, mas tente novamente numa próxima");
        }
        }
    }
}
