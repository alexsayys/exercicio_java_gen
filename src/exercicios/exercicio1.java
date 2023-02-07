package exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args) {
        // Variáveis
        float salario, abono, novoSalario;

        //Leitor
        Scanner leitura = new Scanner(System.in);

        //Entradas
        System.out.println("\nDigite seu salário: ");
        salario = leitura.nextFloat();

        System.out.println("\nDigite o valor do abono: ");
        abono = leitura.nextFloat();

        //Processamento
        novoSalario = salario + abono;

        //Saída
        System.out.printf("\nValor do novo salário: %.2f",novoSalario);
    }
}
