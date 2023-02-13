package loops.loops_extra;

import java.util.Scanner;

public class do_while6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int num1=0, num2, media, divisor=0;

         do {
             System.out.println("\nDigite um número inteiro: ");
             num2 = sc.nextInt();

             if (num2 % 3 == 0)
             {
                 divisor++;
                 num1 += num2;

                 media = num1 / divisor;

                 System.out.println("\nA média é: "+media);
             }
         } while (num2 != 0);
    }
}
