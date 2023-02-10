package loops;

import java.util.Scanner;

public class for01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, multiplo, x;

        System.out.println("\nDigite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("\nDigite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2)
        {

            System.out.println("\nIntervalo inválido!");
        }
        else if (num1 < num2) {
            for (num1 = num1; num1 <= num2; num1++)
            {
                if (num1 % 3 == 0 && num1 % 5 == 0) {
                    System.out.printf("\n%d é múltiplo de 3 e 5",num1);
                }
            }
        }
        else {
            System.out.println("\nOcorreu um erro");
        }
    }
}
