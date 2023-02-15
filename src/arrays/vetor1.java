package arrays;

import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Define um array com valores
        int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        //Ler um valor digitado pelo usuário
        System.out.println("Digite um númedo de 1 à 10 para achar sua posição no array: ");
        int numSelect = sc.nextInt();

        //Condicional que verifica se o valor digitado está entre 1 e 10
        if (numSelect >= 1 && numSelect <= 10)
        {
            //laço que percorre o array
            for (int indice = 0; indice < numeros.length; indice++)
            {
                //Condição que verifica se o valor do array é igual ao valor inserido
                if (numeros[indice] == numSelect)
                {
                    //Retorna a posição do valor inserido.
                    System.out.printf("O número %d está localizado na posição: %d", numSelect, indice);
                    break;
                }
            }
        }
        else
        {
            //Informa que o número não faz parte do array
            System.out.printf("\nO número %d não foi encontrado!",numSelect);
        }
    }
}
