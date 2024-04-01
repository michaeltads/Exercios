import java.util.Scanner;

public class Expoente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        System.out.println("O resultado é: " + Math.pow(num1, num2));

    }
}
