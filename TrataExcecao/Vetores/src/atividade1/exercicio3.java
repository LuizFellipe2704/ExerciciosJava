package atividade1;
//3. Um professor precisa de um programa para calcular médias. O programa pergunta quantas notas,
// cria um vetor de doubles com esse tamanho, pede para digitar cada uma das notas.
// Depois disso ele imprime todas as notas usando um loop for e calcula a média, que imprime no final.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas aqui: ");
        int indice = input.nextInt();

        double[] notas = new double[indice];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota aqui " + (i + 1) + ": ");
          notas[i] = input.nextDouble();
        }
       double soma=0;
       for(int i = 0 ; i < notas.length; i++) {
       System.out.println("Nota "+(i+1) +" = " +notas[i]);
       soma += notas[i];;
       }
       double media = soma / indice;
      System.out.println("Média = " + media);
     input.close();
    }

}
