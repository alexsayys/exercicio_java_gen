package condicionais;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //Leitor
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("\nEscreva um número inteiro: ");
        int num = sc.nextInt();

        //Condicional
        if (num % 2 > 0 ) {
            System.out.printf("\nO número %d é ímpar e positivo", num);
        }
        else if (num % 2 == 0 ) {
            System.out.printf("\nO número %d é par e positivo", num);
        }
        else if (num < 0 && (Math.abs(num) % 2) == 0 ) {
            System.out.printf("\nO número %d é par e negativo", num);
        }
        else if (num < 0 && (Math.abs(num) % 2) > 0 ) {
            System.out.printf("\nO número %d é ímpar e negativo", num);
        }
        else if (num == 0) {
            System.out.printf("\nO número %d é par representa a ausência de valor ou quantidade.\nPortanto, não pode ser considerado negativo ou positivo.", num);
        }
        else {
            System.out.println("\nVerifique o número digitado");
        }

    }
}
