import java.util.Scanner;

public class Consecultivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();

        int resultado1 = num1 + 1;
        int resultado2 = num2 + 1;

        System.out.println("O resultado é: " + resultado1 + " e " + resultado2);

    }
}
