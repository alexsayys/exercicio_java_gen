package loops.loops_extra;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMenores = 0, totalMaiores = 0, idade = 0, totalGeral = 0;

        //Laço que ler idades até que o usuário digite -99
        while (idade != -99)
        {
            System.out.println("\nDigite uma idade: ");
            idade = sc.nextInt();

            //Condicional que valida as idades
            if (idade < 21 && idade >= 0)
            {
                totalMenores++;
                totalGeral++;

                //Mostra o total de idade digitadas, idades maiores que 50 e menores que 21
                System.out.println("Total de idades inseridas: "+totalGeral);
                System.out.println("Total de pessoas maiores que 50 anos: "+totalMaiores);
                System.out.println("Total de pessoas menores que 21 anos: "+totalMenores);
            }
            else if (idade > 50)
            {
                totalMaiores++;
                totalGeral++;

                //Mostra o total de idade digitadas, idades maiores que 50 e menores que 21
                System.out.println("Total de idades inseridas: "+totalGeral);
                System.out.println("Total de pessoas maiores que 50 anos: "+totalMaiores);
                System.out.println("Total de pessoas menores que 21 anos: "+totalMenores);
            }
            else if (idade < 0)
            {
                System.out.println("\nIdade inválida");
            }
            else
            {
                totalGeral++;

                //Mostra o total de idade digitadas, idades maiores que 50 e menores que 21
                System.out.println("Total de idades inseridas: "+totalGeral);
                System.out.println("Total de pessoas maiores que 50 anos: "+totalMaiores);
                System.out.println("Total de pessoas menores que 21 anos: "+totalMenores);
            }

        }

        //Mostra o total de idade digitadas, idades maiores que 50 e menores que 21
        System.out.println("RESUMO:\nTotal de idades inseridas: "+totalGeral);
        System.out.println("Total de pessoas maiores que 50 anos: "+totalMaiores);
        System.out.println("Total de pessoas menores que 21 anos: "+totalMenores);
    }
}
