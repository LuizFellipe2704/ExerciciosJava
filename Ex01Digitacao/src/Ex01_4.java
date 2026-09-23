import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
public class Ex01_4 {
    public static void main(String[] args) {
    int ovos;
     Scanner entrada = new Scanner(System.in);
    System.out.println("Quantos ovos foram postos hoje?");
  ovos = entrada .nextInt();
   int caixas;
   int resto;
  caixas = ovos / 12;
  resto = ovos % 12;
  System.out.println(caixas+" caixas completas");
  System.out.println("Restarão "+resto+" ovos");

  entrada .close();


    }
}
