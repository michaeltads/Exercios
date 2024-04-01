import java.util.Scanner;

public class LadoDoQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um o tamannho do lado do quadrado: ");
        int num1 = entrada.nextInt();
        int l = 2;
        System.out.println("O lado do quadrado é: " + num1 * l);
       
    }
}
