package intro_logica;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Variáveis
        double a, b, c, d, r, s;

        //Leitor
        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite um número natural diferente de zero para A: ");
        a = leia.nextInt();
        System.out.println("\nDigite um número natural diferente de zero para B:");
        b = leia.nextInt();
        System.out.println("\nDigite um número natural diferente de zero para C: ");
        c = leia.nextInt();

        //Processamento
        r = Math.pow(a + b, 2);
        s = Math.pow(b + c, 2);

        d = (r + s) / 2;

        //Saída
        System.out.printf("O resultado da expressão é: %.0f",d);

    }
}
