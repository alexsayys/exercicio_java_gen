package condicionais;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        //Leitor
        Scanner sc = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite o valor A: ");
        int a = sc.nextInt();
        System.out.println("\nDigite o valor B: ");
        int b = sc.nextInt();
        System.out.println("\nDigite o valor C: ");
        int c = sc.nextInt();

        //Calculo
        int soma = a + b;

        //Condicional
        if (soma > c ) {
            System.out.printf("\nC é igual a %d e a soma de A + B é igual a %d.\nPortanto, a soma de A e B é maior que C.\n",c,soma);
        }
        else if (soma < c) {
            System.out.printf("\nC é igual a %d e a soma de A + B é igual a %d.\nPortanto, a soma de A e B é menor que C.\n",c,soma);
        }
        else if (soma == c) {
            System.out.printf("\nC é igual a %d e a soma de A + B é igual a %d.\nPortanto, a soma de A e B é igual que C.\n",c,soma);
        }
        else {
            System.out.println("\nErro, por favor, verifique os valores inseridos");
        }

    }
}
