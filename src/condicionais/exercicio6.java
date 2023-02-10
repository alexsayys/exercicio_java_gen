package condicionais;

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nNome do colaborador: ");
        String nome = sc.nextLine();
        System.out.println("\nCódigo do cargo: ");
        int cod = sc.nextInt();
        System.out.println("\nValor do Salário: ");
        float salario = sc.nextFloat();

        switch (cod) {
            case 1:
                double novoSalario = salario + (salario * 0.10);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Gerente\nSalário Reajustado: %.2f", nome, novoSalario);
            break;
            case 2:
                novoSalario = salario + (salario * 0.07);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Vendedor\nSalário Reajustado: %.2f", nome, novoSalario);
                break;
            case 3:
                novoSalario = salario + (salario * 0.09);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Supervisor\nSalário Reajustado: %.2f", nome, novoSalario);
                break;
            case 4:
                novoSalario = salario + (salario * 0.06);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Motorista\nSalário Reajustado: %.2f", nome, novoSalario);
                break;
            case 5:
                novoSalario = salario + (salario * 0.05);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Estoquista\nSalário Reajustado: %.2f", nome, novoSalario);
                break;
            case 6:
                novoSalario = salario + (salario * 0.08);
                System.out.printf("\n Nome do colaborador: %s\nCargo: Técnico de TI\nSalário Reajustado: %.2f", nome, novoSalario);
                break;
            default:
                System.out.println("\nERROR");
        }
    }
}
