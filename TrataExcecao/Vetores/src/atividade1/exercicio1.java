package atividade1;
// 1. Crie um vetor de strings que contenha as sete cores do arco-iris e imprima usando um loop for
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] colors = new String[7];

        for ( int i=0; i < colors.length; i++) {
        System.out.print("cor" + (i + 1) + ":");
        colors [i] = input.nextLine();
        }
      System.out.println("\n Cores cadastradas:");
      for (int i=0 ; i < colors.length; i++){
      System.out.println((i + 1) + "a cor" + colors[i]);
      }
      input.close();
    }
}