package condicionais;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, result;
        System.out.println("\nPrimeiro valor: ");
        num1 = sc.nextFloat();
        System.out.println("\nSegundo Valor: ");
        num2 = sc.nextFloat();
        System.out.println("\nCódigo da operação");
        int cod = sc.nextInt();

        switch (cod) {
            case 1:
                result = num1 + num2;
                System.out.printf("\nResultado %.1f + %.1f = %.1f", num1, num2, result);
            break;
            case 2:
                result = num1 - num2;
                System.out.printf("\nResultado %.1f + %.1f = %.1f", num1, num2, result);
            break;
            case 3:
                result = num1 * num2;
                System.out.printf("\nResultado %.1f + %.1f = %.1f", num1, num2, result);
            break;
            case 4:
                result = num1 / num2;
                System.out.printf("\nResultado %.1f + %.1f = %.1f", num1, num2, result);
            break;
            default:
                System.out.println("\nOperação inválida!");
        }
    }
}
