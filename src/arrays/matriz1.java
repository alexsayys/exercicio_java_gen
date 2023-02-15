package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {
        //Leitor
        Scanner sc = new Scanner(System.in);

        //Definição de arrays e variáveis
        int[][] numMatriz = new int[3][3];
        int[] diagonalPrincipal = new int[numMatriz.length];
        int[] diagonalSecundaria = new int[numMatriz.length];
        int somaPrincipal = 0, somaSecundaria = 0;

        //Laço para inserir os valores do array principal(matriz)
        for (int linha = 0; linha < 3; linha++)
        {
            for (int coluna = 0; coluna < 3; coluna++)
            {
                System.out.printf("\nDigite um número para linha %d, coluna %d: ",linha, coluna);
                numMatriz[linha][coluna] = sc.nextInt();
            }
        }

        //Laço insere os valores da diagonal principal em um novo array (vetor)
        for (int p = 0; p < numMatriz.length; p++)
        {
            diagonalPrincipal[p] = numMatriz[p][p];
            somaPrincipal += diagonalPrincipal[p];
        }

        //Laço que insere os valores da diagonal secundária em um novo array (vetor)
        for (int s = 0; s < numMatriz.length; s++)
        {
            diagonalSecundaria[s] = numMatriz[s][numMatriz.length - 1 - s];
            somaSecundaria += diagonalSecundaria[s];
        }

        //Informa os resultados na tela
        System.out.println("\nElementos da Diagonal Principal: "+Arrays.toString(diagonalPrincipal));
        System.out.println("\nElementos da Diagonal Secundária: "+Arrays.toString(diagonalSecundaria));
        System.out.println("\nSoma da Diagonal Principal: "+somaPrincipal);
        System.out.println("\nSoma da Diagonal Secundária: "+somaSecundaria);
    }
}
