package condicionais;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldo = 1000;

        System.out.println("\nCódigo da operação: ");
        int cod = sc.nextInt();

        switch (cod) {
            case 1:
                System.out.printf("\nOperação -Saldo\nSaldo: R$ %.2f", saldo);
            break;
            case 2:
                System.out.println("\nOperação - Saque\nDigite o valor do saque: ");
                float saque = sc.nextFloat();

                if (saque > saldo) {
                    System.out.printf("Operação - Saque\nSaldo Insuficiente!");
                }
                else if (saque <= saldo) {
                    saldo = saldo - saque;
                    System.out.printf("\nOperação - Saque\nNovo Saldo R$ %.2f",saldo);
                }
                else {
                    System.out.println("\nOcorreu um erro inesperado");
                }
            break;
            case 3:
                System.out.println("\nOperação - Deposito\nDigite o valor do depósito: ");
                float deposito = sc.nextFloat();

                if (deposito <= 0) {
                    System.out.println("\nOperação Inválida!");
                }
                else if (deposito > 0) {
                  saldo = saldo + deposito;
                    System.out.printf("\nOperação - Deposito\nNovo saldo: R$ %.2f",saldo);
                }
            break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}
