import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Otimo = 0;
        int Bom = 0;
        int Ruim = 0;
        int TotalRespostas = 0;
        int Notas = 0;
        String repetir = new String();

        do {
            System.out.println("Qual a sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Digite sua resposta (1, 2 ou 3): ");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                Otimo++;
            } else if (resposta == 2) {
                Bom++;
            } else if (resposta == 3) {
                Ruim++;
            } else {
                System.out.println("Resposta inválida!");
                continue;
            }
            Notas += resposta;
            TotalRespostas++;
            System.out.print("Deseja continuar? (S/N): ");
            repetir = scanner.next();
        } while (repetir.equals("S"));

        double result_otimo = (100.0 * Otimo / TotalRespostas);
        double result_bom = (100.0 * Bom / TotalRespostas);
        double result_ruim = (100.0 * Ruim / TotalRespostas);

        System.out.println("\nResultados:");
        System.out.println("Ótimo: " + Otimo + " (" + result_otimo + "%)");
        System.out.println("Bom: " + Bom + " (" + result_bom + "%)");
        System.out.println("Ruim: " + Ruim + " (" + result_ruim + "%)");
        System.out.println("Total: " + TotalRespostas);

        if (TotalRespostas > 0) {
            double mediaNotas = (double) Notas / TotalRespostas;
            System.out.println("Media: " + mediaNotas);
        }

        scanner.close();
    }
}
