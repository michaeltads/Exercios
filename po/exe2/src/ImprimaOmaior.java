import java.util.Scanner;

public class ImprimaOmaior {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("digite um número");
            int entradaValor = entrada.nextInt();

            if (i == 1) {
                maior = entradaValor;
            } else {
                if (entradaValor > maior) {
                    maior = entradaValor;
                }
            }
        }
        System.out.println("O maior número é: " + maior);

    }
}
