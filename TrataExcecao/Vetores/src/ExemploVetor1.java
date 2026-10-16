import java.util.Scanner;

    public class ExemploVetor1 {
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



