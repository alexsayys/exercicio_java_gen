package loops.loops_extra;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Caracteristicas de imput
        int idade, genero, carac_psi, pessoa=0;

        //Caracteristicas de resultado
        int pessoa_calma=0, mulher_nervosa=0, homem_agressivo=0, outro_calmo=0, pessoaMais40=0, pessoasMenos18=0;

        while (pessoa <= 150)
        {
            System.out.println("\nDigite a idade: ");
            idade = sc.nextInt();

            System.out.println("\nGênero:\n1 - Feminino\n2 - Masculino\n3 - Outros");
            genero = sc.nextInt();

            System.out.println("\nCaracterísticas Psicológicas:\n1 - Calma(o)\n2 - Nervosa(o)\n3 - Agressiva(o)");
            carac_psi = sc.nextInt();

            //Condição que verifica a quantidade de pessoas calmas
            if (carac_psi == 1)
            {
                pessoa_calma++;
            }

            //Condição que verifica a quantidade de pessoas com mais 40 anos nervosas e pessoas menores de 18 calmas
            if (carac_psi == 2 && idade > 40)
            {
                pessoaMais40++;
            }
            else if (carac_psi == 1 && idade < 18)
            {
                pessoasMenos18++;
            }

            //Condição que verifica características psicológicas de acordo com o gênero

            if (genero == 1 && carac_psi == 2)
            {
                mulher_nervosa++;
            }
            else if (genero == 2 && carac_psi == 3)
            {
                homem_agressivo++;
            }
            else if (genero == 3 && carac_psi == 1)
            {
                outro_calmo++;
            }

            //Soma 1 na variável pessoa
            pessoa++;

            //Condição que sai do loop caso se o usuário desejar.
            System.out.println("\nInserir outra informação? (1-Sim) (2-Não)");
            int s = sc.nextInt();
            if (s == 2)
            {
                break;
            }
        }

        //Resultados dos dados inseridos
        System.out.println("\nRESULTADO: ");
        System.out.println("\nNúmero de pessoas calmas: "+pessoa_calma);
        System.out.println("\nNúmero de mulheres nervosas: "+mulher_nervosa);
        System.out.println("\nNúmero de homens agressivos: "+homem_agressivo);
        System.out.println("\nNúmero de outros calmos: "+outro_calmo);
        System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+pessoaMais40);
        System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+pessoasMenos18);
    }
}
