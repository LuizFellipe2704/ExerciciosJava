public class ExemploVetor2 {
    static void main(String[] args) {
        // eu posso inicializar um vetor com valores entre chaves
        String[] estacoes = {"Primavera", "Verao", "Outono", "Inverno"};

        System.out.println("Imprimindo uma a uma:");
        System.out.println(estacoes[0]);
        System.out.println(estacoes[1]);
        System.out.println(estacoes[2]);
        System.out.println(estacoes[3]);

        // vasculha o vetor usando um laço contador
        System.out.println("\nImprimindo com um loop for(i)");
        for(int i=0; i<estacoes.length; i++){
            System.out.println(estacoes[i]);
        }

        // vasculha um vetor com um laço para-cada
        System.out.println("\nImprimindo com um loop for(i)");
        for (String nome : estacoes) { /* para cada nome no vetor estações: */
            System.out.println(nome); /* imprima esse nome */
        }
    }
}

