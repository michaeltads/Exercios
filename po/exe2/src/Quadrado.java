import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();

        int quadradonum1 = num1 * num1;
        int quadradonum2 = num2 * num2;
        int soma = quadradonum1 + quadradonum2;
        System.out.println("A soma dos quadrados dos números é: " + soma);
    }
}
