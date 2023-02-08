package intro_logica;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        //Variáveis
        int anos, meses, dias, idadeDias;

        Scanner leia = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite sua idade expressa em anos: ");
        anos = leia.nextInt();
        System.out.println("\nQuantos meses se passaram após o mês do seu aniversário? ");
        meses = leia.nextInt();
        System.out.println("\nQuantos dias se passaram no mês atual? ");
        dias = leia.nextInt();

        // Processamento
        idadeDias = (anos * 365) + (meses * 30) + dias;

        //Saída
        System.out.println("\nSua idade em dias é: "+idadeDias);

    }
}
