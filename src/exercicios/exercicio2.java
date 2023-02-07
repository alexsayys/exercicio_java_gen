package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args) {
        //Variáveis
        float nota1, nota2, nota3, nota4, media;

        //Leitor
        Scanner leitura = new Scanner(System.in);

        //Entradas
        System.out.println("\nInsira sua primeira nota: ");
        nota1 = leitura.nextFloat();
        System.out.println("\nInsira sua segunda nota: ");
        nota2 = leitura.nextFloat();
        System.out.println("\nInsira sua terceira nota: ");
        nota3 = leitura.nextFloat();
        System.out.println("\nInsira sua quarta nota: ");
        nota4 = leitura.nextFloat();

        //Processamento
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Saída
        System.out.printf("\nSua média final é: %.1f",media);

    }
}
