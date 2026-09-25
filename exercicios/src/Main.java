import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //pede para digitar a uma palavra varias vezes
        // so para quando a pessoa digitar "banana"
        String texto;
        int voltas = 0;
        do {
            System.out.printf("Você tentou %d vezes \n", voltas);
            System.out.print("Digite uma palavra:");
            texto = entrada.next();
            voltas++; //soma mais 1 em voltas
            if (texto.equalsIgnoreCase("banana")) {
                System.out.println("Parabéns você acertou !! em " + voltas + " tentativa(s)"); return;
            } // Enquanto o break apenas te tira do ciclo, o return encerra imediatamente todo o método main.
          }while (voltas < 3);
        if (!texto.equalsIgnoreCase("banana")) {
            System.out.println("Excesso de tentativas!!! A palavra era banana");
        }
            // outra forma de fazer:
           //System.out.println("Excesso de tentativas!!! A palavra era banana");break;}
           // if (texto.equalsIgnoreCase("banana")) {
           //System.out.printf("Você tentou %d vezes ", voltas);}

    }
}