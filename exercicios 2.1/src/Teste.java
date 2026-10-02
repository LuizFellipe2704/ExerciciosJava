import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste {
    public static void main(String[] args) {
        int idade;
        char estudante;
        String continuar = "sim";
        Scanner entrada = new Scanner(System.in);
        double quantidadeEstudantes= 0;
        double quantidadenaoEstudantes= 0;

        int somaIdadeEstudantes=0;
        int somaIdadeNaoEstudantes=0;

        while(continuar.equalsIgnoreCase("sim")) {
            System.out.print("Olá Você deseja continuar(sim ou não): ");
            continuar = entrada.next();

            if (continuar.equalsIgnoreCase("sim")) {
                System.out.print("Qual a sua idade? ");
                idade = entrada.nextInt();

                System.out.print("Você é um estudante(sim ou não): ");
                estudante = entrada.next().charAt(0);

                // verifica se a resposta começa com 's' ou 'S'

                if(estudante =='s'|| estudante =='S' ){
                    quantidadeEstudantes++;//soma +1
                 somaIdadeEstudantes += idade;
                }else{
                    quantidadenaoEstudantes++; //soma +1
                    somaIdadeNaoEstudantes += idade;
                }
            }
        }
        System.out.println("=======RELÁTORIO=======");
        System.out.println("A quantidade de estudantes são= "+quantidadeEstudantes);
        System.out.println("A quantidade de NÃO estudantes são= "+quantidadenaoEstudantes);

        if(quantidadeEstudantes > 0)
        {double mediaEstudantes = (double) somaIdadeEstudantes / quantidadeEstudantes;
            System.out.println("A média de idade dos estudantes são= "+mediaEstudantes);

        }if(quantidadenaoEstudantes > 0){
        double mediaNaoEstudantes = (double) somaIdadeNaoEstudantes / quantidadenaoEstudantes;
        System.out.println("A média de idade dos NÃO estudantes são= "+mediaNaoEstudantes);
        }


    }
}