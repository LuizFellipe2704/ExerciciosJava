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

public class exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] salas = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr.Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"
        };

        for (int i = 0; i < salas.length; i++) {
            System.out.print("Sala " + (i + 1) + ": ");
            System.out.println(salas[i]);
        }
        System.out.print("Qual o número de sua sala?: ");
        int sala = input.nextInt();
        if (sala >=101 && sala <= 105){
        int indice = sala -101;// vai diminuir o numero (101 até 105) pelo menor(101),
            // o que vai dar o indice da sala (0,1,2,3,4)
            System.out.println("No escritório " + sala + " fica: " + salas[indice]);
        } else {
            System.out.println("Escritório não encontrado!");
        }
        }
    }
