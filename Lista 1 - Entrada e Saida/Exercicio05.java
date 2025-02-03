import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("Digite os segundos: ");
        int segundos = scanner.nextInt();

        horas = horas*60*60;
        minutos = minutos*60;
        int total = horas+minutos+segundos;
        System.out.println(total);
    }
}
