package intro_logica;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String [] args) {
        //Variáveis
        int hr, min, seg, resto, inicio;

        //Leitor
        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite o tempo de duração expresso em segundos: ");
        inicio = leia.nextInt();

        //Processamento
        hr = inicio / 3600;
        resto = inicio % 3600;

        min = resto / 60;
        resto = resto % 60;

        seg = resto;

        //Saída
        System.out.println("\nO tempo é de "+hr+" horas, "+min+" minutos e "+seg+" Segundos.");
    }
}
