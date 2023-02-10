package loops;

import java.util.Scanner;

public class for01 {
    public static void main(String[] args) {
        //Leitor
        Scanner sc = new Scanner(System.in);
        //Variáveis
        int num1, num2;

        //Entradas
        System.out.println("\nDigite o primeiro número: ");//valor menor
        num1 = sc.nextInt();
        System.out.println("\nDigite o segundo número: "); //valor maior
        num2 = sc.nextInt();

        //Condicional - verifica os valores digitados
        if (num1 < num2)
        {
            //Laço de repetição - Soma um ao menor valor
            for (num1 = num1; num1 <= num2; num1++)
            {
                //Condição - Verifica se o número é multiplo de 3 e 5
                if (num1 % 3 == 0 && num1 % 5 == 0)
                {
                    //Saída
                    System.out.printf("\n%d é múltiplo de 3 e 5",num1);
                }
            }
        }
        else if (num1 >= num2)
        {
            //Saída
            System.out.println("\nIntervalo inválido!");
        }
        else
        {
            //Saída
            System.out.println("\nOcorreu um erro, verifique os valores inseridos.");
        }
    }
}
