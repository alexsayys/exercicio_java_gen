package intro_logica;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        //Variáveis
        double x, y, a, b, c, d, e, f;

        //Leitor
        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite o valor ax: ");
        a = leia.nextDouble();
        System.out.println("\nDigite o valor by: ");
        b = leia.nextDouble();
        System.out.println("\nDigite o valor c: ");
        c = leia.nextDouble();
        System.out.println("\nDigite o valor dx: ");
        d = leia.nextDouble();
        System.out.println("\nDigite o valor ey: ");
        e = leia.nextDouble();
        System.out.println("\nDigite o valor f: ");
        f = leia.nextDouble();

        //Processamento
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));

        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        //Saída
        System.out.println("\nO valor de x é: "+x+" e o valor de y é: "+y);

    }
}
