import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua data de nascimento: ");
        String nasc = scanner.next();
        System.out.println("Digite seu nível de escolaridade: ");
        String ensino = scanner.next();
        System.out.println("Digite cargo pretendido: ");
        String cargo = scanner.next();
        System.out.println("Você tem CNH do tipo B? [1]Sim [2]Não: ");
        int CNH = scanner.nextInt();

        System.out.println(nome);
        System.out.println(nasc);
        System.out.println(ensino);
        System.out.println(cargo);
        System.out.println(CNH);
        System.out.println("Todos os dados foram cadastrados!");
    }
}
