package loops;

import java.util.Scanner;

public class do_while01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, somaPositivo=0;

        do {
            System.out.println("\nDigite um número inteiro: ");
            num = sc.nextInt();

            if (num > 0) {
                somaPositivo = somaPositivo + num;
            }


        } while (num != 0);

        System.out.println("\nA soma dos números positivos é: "+somaPositivo);

    }
}
