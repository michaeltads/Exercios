import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo");
        int n = entrada.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {

            if (i % n == 0) {
                soma = +i;
            }
        }
        if (soma % n == 0) {
            
        }
        System.out.println("O numero é perfeito");
    }

}