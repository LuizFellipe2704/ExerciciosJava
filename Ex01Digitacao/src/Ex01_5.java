import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
public class Ex01_5 {
    public static void main(String[] args) {
    double reais;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um valor inteiro aqui: ");
    reais = entrada.nextInt();
    double notas50;
    double notas10;
    double notas5;
    double notas1;

   notas50 = reais/50;
   notas10 = reais/10;
   notas5 = reais/5;
   notas1 = reais;
   System.out.println(notas50+" nota(s) de 50 reais");
   System.out.println(notas10+" nota(s) de 10 reais");
   System.out.println(notas5+" nota(s) de 5 reais");
   System.out.println(notas1+" nota(s) de 1 real\n");

   double moedas50;
   double moedas25;
   double moedas10;
   double moedas5;
   double moedas1;

   moedas50 = reais /0.50;
   moedas25 = reais /0.25;
   moedas10 = reais /0.10;
   moedas5 = reais /0.05;
   moedas1 = reais /0.01;


   System.out.println(moedas50+" moeda(s) de 50 centavos");
   System.out.println(moedas25+" moeda(s) de 25 centavos");
   System.out.println(moedas10+" moeda(s) de 10 centavos");
   System.out.println(moedas5+" moeda(s) de 5 centavos");
   System.out.println(moedas1+" moeda(s) de 1 centavo");
   entrada.close();
    }

}