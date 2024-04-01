import java.util.Scanner;

public class Decimais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        double num2 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num3 = entrada.nextInt();
        double area = Math.pow(num1, num3) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
