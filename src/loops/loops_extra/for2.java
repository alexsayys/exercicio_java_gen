package loops.loops_extra;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        //Leitor
        Scanner sc = new Scanner(System.in);
        //Definição de variáveis
        int num, totalP = 0, totalIP = 0 ;

        //Laço que roda o bloco de código 10 vezes
        for (int i = 1; i < 11; i++) {

            //Pega um valor inteiro digitado e informa a rodada
            System.out.printf("\nRODADA %d DE 10\nDigite um número: ",i);
            num = sc.nextInt();

            //Condicional que verifica se o valor digitado é par ou impar
            if (num % 2 == 0)
            {
                totalP++;
            }
            else
            {
                totalIP++;
            }
            //Imprime a quantidade de valores pares e impares
            System.out.println("O total de números ímpares são: "+totalIP);
            System.out.println("O total de números pares são: "+totalP);
        }
    }
}
