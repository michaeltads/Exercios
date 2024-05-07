import java.util.Scanner;

public class AlunoMaisVelho {

    public static void main(String[] args) {
        int idade = 0;
        int maiorIdade = 0;
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        int cont = 0;

        do {
            cont++;
            System.out.println("Digite a idade do aluno: ");
            idade = entrada.nextInt();
            System.out.println("Digite seu nome  ");
            nome = entrada.next();
            System.out.println("Digite seu sexo M/F: "); 
            String sexo = entrada.next();
          


            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

        } while (cont < 5);

        System.out.println("A maior idade é: " + maiorIdade +"nome: " + nome );
  
    }
}
