package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {
        //Variáveis
        float salarioBruto, adNoturno,hrExtra, descontos, salarioLiquido;

        //Leitor
        Scanner leitura = new Scanner(System.in);

        //Entradas
        System.out.println("\nInsira o valor do seu salário bruto: ");
        salarioBruto = leitura.nextFloat();
        System.out.println("\nInsira o valor do seu adicional noturno: ");
        adNoturno = leitura.nextFloat();
        System.out.println("\nInsira o valor das suas horas extras: ");
        hrExtra = leitura.nextFloat();
        System.out.println("\nInsira o valor dos descontos: ");
        descontos = leitura.nextFloat();

        //Processamento
        salarioLiquido = salarioBruto + adNoturno + (hrExtra * 5) - descontos;

        //Saída
        System.out.printf("\nO valor do seu salário líquido é: %.2f",salarioLiquido);
    }
}
