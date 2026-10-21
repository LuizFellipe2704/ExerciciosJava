package atividade1;

import java.util.Scanner;

//4. Aproveitando a lista de cores do arco-iris do exercício 1,
// faça um programa peça ao usuário para informar uma cor e diga se ela está no arco-iris ou não,
// diga quantos acertos e quantos erros ele já fez até que ele acerte 7 cores ou desista.
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cores = {"vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta",};
        String chute = "";
        int erros = 0, acertos = 0;

        while (true) {
            System.out.printf("Digite uma cor aqui(Digite \"desisto\" para sair do jogo):");
            chute = input.nextLine();

            boolean acertou = false;
            for (int i = 0; i < cores.length; i++) {
                if (chute.equalsIgnoreCase(cores[i]))
                    acertou = true;

                if(acertou) {

                }
                if (acertos == 7) {
                    System.out.print("Parabéns!!");
                    break;
                }
                if (chute.equalsIgnoreCase("desisto")) {
                    System.out.print("Parabéns!!");
                    break;
                }

            }
        }
    }
}