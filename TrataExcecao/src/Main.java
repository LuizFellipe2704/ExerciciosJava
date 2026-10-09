import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        boolean entradaValida = false;

        // Repete até o usuário digitar um inteiro válido
        while (!entradaValida) {
            try {
                System.out.print("Digite sua idade (inteiro): ");
                idade = scanner.nextInt();
                entradaValida = true; // Se leu sem erro, sai do loop
            } catch (InputMismatchException e) {
                System.out.println("Erro: DIGITE NÚMEROS INTEIROS!!");
                scanner.next(); // LIMPA o texto inválido que ficou no buffer(fila)
            }
        }

        System.out.print("Digite sua altura (ex: 1,75): ");
        double altura = scanner.nextDouble();

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");

        scanner.close();
    }
}