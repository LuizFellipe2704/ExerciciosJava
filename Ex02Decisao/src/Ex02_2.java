import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 2.2: Confirmacao de senha
  - informar uma senha
  - confirmar a senha
  - reclamar quando as senhas forem diferentes

  TAREFA:
  - peça para o usuário informar uma senha
  - peça para o usuário confirmar a senha
  - compare as duas senhas
  - se as senhas não conferirem, imprima uma mensagem reclamando
  - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
  - não é necessário repetir a digitação: é só pra exercitar um IF

  ATENÇÃO:
  - para verificar se duas Strings são iguais, use o método .equals()
  - exemplo: senha.equals(confirmacao)
  - não use o operador == para comparar duas strings
  -------------------------------------------------------------------*/
public class Ex02_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua senha: \n");
        String senha1 = entrada.nextLine();

        System.out.print("digite novamente sua senha: \n");
        String senha2 = entrada.nextLine();
        if (senha1.equals(senha2)) {
            System.out.println("Acesso Autorizado com Sucesso");
        }
      else {
                System.out.println("Senha Incorreta");
      }



    }
}