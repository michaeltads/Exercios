import java.util.Scanner;

public class SomeTodosde1aaN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int entradaValor = entrada.nextInt();
        int i = 1;

        int j = 0;
        while (i <= entradaValor) {
            j = +j + i;
            i++;

        }
        System.out.println(j);

    }

}
