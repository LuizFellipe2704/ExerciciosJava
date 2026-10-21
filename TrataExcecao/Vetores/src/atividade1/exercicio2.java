package atividade1;
//2. Um prédio de escritório tem cinco salas:
//101 - Dr. Silva, Dentista
//102 - Contabilidade Silva
//103 - Dr. Silva, Cardiologista
//104 - Silvana Silva, Manicure
//105 - Silva & Silva Advogados Associados
//Faça um programa que tenha um vetor com os nomes das empresas (sem os números). Em seguida pergunte
// o número do escritório e, se esse número existir, imprima qual a empresa que está nele.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     String [] empresas ={
             "Dr. Silva, Dentista:",
             "Contabilidade Silva:",
             "Dr.Silva, Cardiologista",
             "Silvana Silva, Manicure:",
             "Silva & Silva Advogados Associados:"
     };

  for( int i=0; i < empresas.length; i++  ){
   System.out.print("Empresa "+ (i+1) +": ");
   int sala = 101+i;
   System.out.println("Sala"+sala+": " +empresas[i]);
  }

   input.close();
    }
}
