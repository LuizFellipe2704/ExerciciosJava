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

    public static class Array {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            // pergunta qual a linha de produto (1,2 ou 3)
            // pergunta a quantidade do produto
            // no fim diz quanto de cada linha vendeu
            int produto;
            int quant;
            int vendas1 = 0, vendas2 = 0, vendas3 = 0;
            String continua;

            // repete até dizer que não quer mais
            do {
                System.out.print("Produto: ");
                produto = entrada.nextInt();
                System.out.print("Quantidade: ");
                quant = entrada.nextInt();

                // soma o total daquele produto
                if (produto == 1) {
                    vendas1 += quant;
                } else if (produto == 2) {
                    vendas2 += quant;
                } else if (produto == 3) {
                    vendas3 += quant;
                } else {
                    System.out.println("Digite 1 a 3 no produto!");
                }

                System.out.println("Quer continuar (S/N):");
                continua = entrada.next();

            } while (continua.equalsIgnoreCase("S"));

            System.out.println("Total produto 1: "+vendas1);
            System.out.println("Total produto 2: "+vendas2);
            System.out.println("Total produto 3: "+vendas3);
        }
    }
}