package intro_logica;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //Variáveis
        double nota1, nota2, nota3, media;

        //Leitor
        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite sua primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("\nDigite sua segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("\nDigite sua terceira nota: ");
        nota3 = leia.nextDouble();

        //Processamento
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

        //Saída
        System.out.printf("\nA sua media é: %.2f", media);
    }
}
