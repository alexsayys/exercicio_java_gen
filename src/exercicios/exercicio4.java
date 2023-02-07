package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args) {
        //Variáveis
        int num1, num2, num3, num3_negativo, num4, calculo1, calculo2;

        //Leitor
        Scanner leitura = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite o valor 01: ");
        num1 = leitura.nextInt();
        System.out.println("\nDigite o valor 02: ");
        num2 = leitura.nextInt();
        System.out.println("\nDigite o valor 03: ");
        num3 = leitura.nextInt();
        System.out.println("\nDigite o valor 03 negativo: ");
        num3_negativo = leitura.nextInt();
        System.out.println("\nDigite o valor 04: ");
        num4 = leitura.nextInt();

        //Processamento
        calculo1 = (num1 * num2) - (num3 * num4);
        calculo2 = (num1 * num2) - (num3_negativo * num4);

        //Saída
        System.out.println("\nDiferença com o terceiro valor positivo: "+calculo1);
        System.out.println("\nDiferença com o terceiro valor negativo: "+calculo2);

    }
}
