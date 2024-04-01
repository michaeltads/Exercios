import java.util.Scanner;

public class AreadoCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        int num1 = entrada.nextInt();
        double pi = 3.14;
        System.out.println("A área do círculo é: " + pi * (num1 * num1));
    }
}
