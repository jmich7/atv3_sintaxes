import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc < 25) {
            System.out.println("Normal");

        } else if (imc < 30) {
            System.out.println("Sobrepeso");

        } else {
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}