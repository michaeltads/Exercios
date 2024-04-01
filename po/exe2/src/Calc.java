import java.util.Scanner;

public class Calc {



public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Calculadora com 4 operações");
    System.out.println("Digite o primeiro número: ");
    int num1 = entrada.nextInt();
    System.out.println("Digite o segundo número: ");
    int num2 = entrada.nextInt();
    System.out.println("Digite a operação desejada: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
    String operacao = entrada.next();


    switch (operacao) {
        case "1":
            System.out.println("O resultado da soma é: " + (num1 + num2));
            break;
        case "2":
            System.out.println("O resultado da subtração é: " + (num1 - num2));
            break;
        case "3":
            System.out.println("O resultado da multiplicação é: " + (num1 * num2));
            break;
        case "4":
            System.out.println("O resultado da divisão é: " + (num1 / num2));
            break;
        default:
            System.out.println("Operação inválida");
    }
}

}
