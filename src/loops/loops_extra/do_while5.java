package loops.loops_extra;

import java.util.Scanner;

public class do_while5 {
    public static void main(String[] args) {

        //Definição de variáveis e Scanner
        Scanner sc = new Scanner(System.in);
        int soma=0, num;

        //Laço que pede um valor inteiro e soma com o valor armazenados na variavel soma
        do
        {
            System.out.println("\nDigite um número inteiro: ");
            num = sc.nextInt();

            soma += num;

            System.out.println("\nSoma: "+soma);

        } while (num != 0); //Termina o laço se o valor digitado for zero

        //Mostra a soma ao sair do laço Do...While
        System.out.println("\nSoma Geral: "+soma);
    }
}
