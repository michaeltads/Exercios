import java.util.Scanner;

public class LeiaSeis {

    public static void main(String[] args) {

        int vetor[] = new int[6];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor  : ");
        vetor[0] = entrada.nextInt();
        System.out.println("Digite o segundo valor  : ");
        vetor[1] = entrada.nextInt();
        System.out.println("Digite o terceiro valor  : ");
        vetor[2] = entrada.nextInt();
        System.out.println("Digite o quarto valor  : ");
        vetor[3] = entrada.nextInt();
        System.out.println("Digite o quinto valor  : ");
        vetor[4] = entrada.nextInt();
        System.out.println("Digite o sexto valor  : ");
        vetor[5] = entrada.nextInt();

        int soma = 0;
        int cont = 0;
        int media = 0;

        for (int i = 0; i < vetor.length; i++) {
         
            if (vetor[i] > 0) {
                soma = soma + vetor[i];
                cont++;
                media = soma / cont;
            
            }
          
        }

        System.out.println("Soma dos números positivos: " + soma);
        System.out.println("Quantidade de números positivos: " + cont);
        System.out.println("media dos números positivos: " + media);
    }
}
