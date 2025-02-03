import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result_idade = 0, result_altura = 0, result_peso = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("-----%d-----\n",i);
            System.out.print("idade: ");
            int idade = scanner.nextInt();

            System.out.print("altura: ");
            double altura = scanner.nextDouble();

            System.out.print("peso: ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                result_idade++;
            }

            if (altura > 1.60) {
                result_altura++;
            }

            if (peso < 80) {
                result_peso++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade acima de 50 anos: " + result_idade);
        System.out.println("Quantidade de pessoas com altura acima de 1.60m: " + result_altura);
        System.out.println("Quantidade de pessoas com peso abaixo de 80kg: " + result_peso);

        scanner.close();
    }
}
