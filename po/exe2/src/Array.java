import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] n = new int[5];
        n = preencherVetor(n);
        somatorioVetor(n);

        mediaVetor(n);
        System.out.println("vetor atualizado");
        imprimiVetor(n);
        obtemElemnetoVetornaPosicao(n);
        menorElementoVetor(n);
        maiorElementoVetor(n);
        insereElementoVetor(n);
        System.out.println("\n vetor atualizado apos inserir ");
        imprimiVetor(n);
        System.out.println("Subititui por zero o que e impares: ");
        substituirporZero(n);
        imprimiVetor(n);

    }

    public static int[] preencherVetor(int v[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            v[i] = entrada.nextInt();
        }
        return v;

    }

    static void imprimiVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("vetor[" + i + "]: " + v[i]);

        }

    }

    public static int somatorioVetor(int v[]) {

        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
        return soma;
    }

    public static int mediaVetor(int v[]) {
        int soma = 0;
        int cont = 0;
        int media = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
            cont++;

        }
        System.out.println("A media dos elementos do vetor é: " + soma / cont);

        return media;
    }

    static int obtemElemnetoVetornaPosicao(int[] v) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a posição que deseja ver o elemento: ");
        int numero = entrada.nextInt();
        for (int i = 0; i < v.length; i++) {
            if (i == numero)
                System.out.println("Vetor na posicaçãi digitada é " + v[i]);

        }
        return numero;
    }

    static int insereElementoVetor(int[] v) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a posição que deseja inserir o elemento: ");
        int posicao = entrada.nextInt();
        System.out.println("Digite o elemento que deseja inserir: ");
        int elemento = entrada.nextInt();
        for (int i = 0; i < v.length; i++) {
            if (i == posicao) {
                v[i] = elemento;
            }
        }
        return posicao;
    }

    static int[] substituirporZero(int v[]) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                v[i] = 0;

            }

        }

        return v;
    }

    static int maiorElementoVetor(int v[]) {

        int maior = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }

        }
        System.out.println("O maior elemento do vetor é: " + maior);
        return maior;
    }

    static int menorElementoVetor(int v[]) {
        int menor = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        System.out.println("O menor elemento do vetor é: " + menor);
        return menor;

    }

}
