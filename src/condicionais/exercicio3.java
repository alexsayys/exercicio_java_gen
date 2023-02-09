package condicionais;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entradas
        System.out.println("\nNome do doador: ");
        String nome = sc.nextLine();
        System.out.println("\nIdade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("\nPrimeira doação de sangue? (aperte S para sim N para não) ");
        String s = sc.nextLine();
        boolean doacao = s.equals("S");

        //Condicional
        if (idade < 18 || idade > 69) {
            System.out.printf("\n%s não está apto(a) para doar sangue.", nome);
        }
        else if (idade >= 18 && idade < 60) {
            System.out.printf("\n%s está apta(o) para doar sangue.", nome);
        }
        else if (idade >= 60 && idade <=69 && doacao == true) {
            System.out.printf("\n%s está apta(o) para doar sangue.", nome);
        }
        else if (idade >= 60 && idade <=69 && doacao == false) {
            System.out.printf("\n%s não está apto(a) para doar sangue.", nome);
        }
        else {
            System.out.println("\nVerifique os valores digitados.");
        }

    }
}
