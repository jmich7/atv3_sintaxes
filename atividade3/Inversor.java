import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        scanner.close();
    }
}