import java.util.Scanner;

public class ArrayFuncoe {

    
       public static int  tamanhoVetor(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        return tamanho;
       }

       public static int[] criarVetor(int n){
            int vetor []= new int[n];
            return vetor;
       }

       public static int[] preencherVetor(int vetor[]){
            Scanner entrada = new Scanner(System.in);
            for(int i = 0; i < vetor.length; i++){
                System.out.printf("vetor[%d]: ", i);
                vetor[i] = entrada.nextInt();
            }
            return vetor;
       }

       public static void imprimir(int vetor  []){
        for(int i =0; i<vetor.length; i++)
        System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
   
       }

       public static int obterNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int numero = entrada.nextInt();
        return numero;
       }

       public static int verificarElemento(int vetor[], int numero){
        int cont = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numero){
               cont ++;
            }
        }
        return cont;
       }
       

       public static void main(String[] args) {
        int n = tamanhoVetor();
        int vetor[] = criarVetor(n);
        vetor = preencherVetor(vetor);
        int obterNumero = obterNumero();
        System.out.printf("O numero %d apareceu " + "apareceu %d\n", n, verificarElemento(vetor, obterNumero));
        imprimir(vetor);

       }

    }

