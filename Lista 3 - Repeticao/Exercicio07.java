import java.util.Scanner;
import java.util.HashMap;

public class Exercicio07 {
    public static void main(String[] args) {
        HashMap<String, Double> dados_peso = new HashMap<>();
        HashMap<String, Double> dados_altura = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=6; i++){
            System.out.printf("-----%d-----\n",i);
            System.out.print("Digite o nome: ");
            String nome = scanner.next();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();
            dados_peso.put(nome, peso);
            dados_altura.put(nome, altura);
        }

        String maisPesada = "";
        double maiorPeso = 0;
        for (String nome : dados_peso.keySet()) {
            double peso = dados_peso.get(nome);
            if (peso > maiorPeso) {
                maiorPeso = peso;
                maisPesada = nome;
            }
        }

        String maisAlta = "";
        double maiorAltura = 0;
        for (String nome : dados_altura.keySet()) {
            double altura = dados_altura.get(nome);
            if (altura > maiorAltura) {
                maiorAltura = altura;
                maisAlta = nome;
            }
        }

        System.out.printf("A pessoa mais pesada é: %s\n", maisPesada);
        System.out.printf("A pessoa mais alta é: %s\n", maisAlta);
    }
}
