package intro_logica;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //Variáveis
        int anos, meses, dias, idadeDias, diasRestantes;

        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite sua idade expressa em dias: ");
        idadeDias = leia.nextInt();

        //Processamento
        anos = idadeDias / 365;
        diasRestantes = idadeDias % 365;

        meses = diasRestantes / 30;
        diasRestantes = diasRestantes % 30;

        dias = diasRestantes;

        //Saída
        System.out.println("\nVocê possui "+anos+" anos, "+meses+" meses e "+dias+" dias vida");
    }
}
