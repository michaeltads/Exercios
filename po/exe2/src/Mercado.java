import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao mercado");
        System.out.println("Digite o codigo do produto: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = entrada.nextInt();




            switch (num1) {
                case 100:
        
                    System.out.println("Detergente  O valor total é: " + (quantidade * 1.89));
                    break;

                case 101:
                System.out.println("Esponja");
                    System.out.println("O valor total é: " + (quantidade * 4.49));
                    break;
           
                    case 102:

                    System.out.println("lã de aço");      
                    System.out.println("O valor total é: " + (quantidade * 8.79));
                default:
                    break;
            }


    }
}
