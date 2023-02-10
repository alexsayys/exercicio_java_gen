package loops;

import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, totalMenores=0, totalMaiores=0;
        System.out.println("\nDigite uma idade: ");
        idade = sc.nextInt();

        if (idade < 21) {

            totalMenores += 1;
        }
        else if (idade > 50) {

            totalMaiores += 1;
        }
        else {
            System.out.println("\nOcorreu um erro, tente novamente");
        }

        while (idade >= 0) {
            System.out.println("\nDigite outra idade: ");
            idade = sc.nextInt();

            if (idade < 21 && idade < 0) {

                totalMenores += 1;
            }
            else if (idade > 50) {

                totalMaiores += 1;
            }
            else {
                System.out.println("\nOcorreu um erro, tente novamente");
            }

            System.out.printf("\nTotal de pessoas menores de 21 anos: %d\nTotal de pessoas maiores de 50 anos: %d",totalMenores, totalMaiores);
        }

        System.out.printf("\nTotal de pessoas menores de 21 anos: %d\nTotal de pessoas maiores de 50 anos: %d",totalMenores, totalMaiores);
    }
}
