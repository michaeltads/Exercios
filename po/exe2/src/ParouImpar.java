import java.util.Scanner;

public class ParouImpar {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o fim : ");
        int fim = entrada.nextInt();


        for (int i = 1; i <= fim; i++) {
        if (i % 2 == 0) {
                System.out.println("O número é par " + i);
            } else {
                System.out.println("O número é ímpar " + i);
            }
        }
       
    }
}
