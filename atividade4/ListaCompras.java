import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos itens deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[] itens = new String[quantidade];
        double[] precos = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o nome do item: ");
            itens[i] = scanner.nextLine();

            System.out.print("Digite o preço do item: ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            total = total + precos[i];
        }

        System.out.println();
        System.out.println("--- RESUMO DA COMPRA ---");

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%s - R$ %.2f%n", itens[i], precos[i]);
        }

        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}