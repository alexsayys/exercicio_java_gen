package intro_logica;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //Variáveis
        double x1, x2, y1, y2, distancia;

        //Leitor
        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite o valor de x1: ");
        x1 = leia.nextDouble();
        System.out.println("\nDigite o valor de y1: ");
        y1 = leia.nextDouble();
        System.out.println("\nDigite o valor de x2: ");
        x2 = leia.nextDouble();
        System.out.println("\nDigite o valor de y2: ");
        y2 = leia.nextDouble();

        //Processamento
        distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));

        //Saída
        System.out.println("\nA distância é de: "+distancia);
    }
}
