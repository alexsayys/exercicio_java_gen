import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        int cod,qtd, valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nLanchonete Raio de Sol");
        System.out.println("\nCod 1 - Cachorro quente - 10,00");
        System.out.println("\nCod 2 - X-salada - 15,00");
        System.out.println("\nCod 3 - X-Bacon - 18,00");
        System.out.println("\nCod 4 - Bauru - 12,00");
        System.out.println("\nCod 5 - Refrigerante - 8,00");
        System.out.println("\nCod 6 - Suco de Laranja - 13,00");

        System.out.println("\nDigite o código do produto: ");
        cod = sc.nextInt();
        System.out.println("\nDigite a quantidade: ");
        qtd = sc.nextInt();

        switch (cod) {
            case 1:
                valor = qtd * 10;
                System.out.println("\nProduto: Cachorro quente - Valor a pagar: "+valor);
            break;
            case 2:
                valor = qtd * 15;
                System.out.println("\nProduto: X-Salada - Valor a pagar: "+valor);
            break;
            case 3:
                valor = qtd * 18;
                System.out.println("\nProduto: X-Bacon - Valor a pagar: "+valor);
            break;
            case 4:
                valor = qtd * 12;
                System.out.println("\nProduto: Bauru - Valor a pagar: "+valor);
            break;
            case 5:
                valor = qtd * 8;
                System.out.println("\nProduto: Refrigerante - Valor a pagar: "+valor);
            break;
            case 6:
                valor = qtd * 13;
                System.out.println("\nProduto: Suco de Laranja - Valor a pagar: "+valor);
            break;
            default:
                System.out.println("\nAlgo de errado aconteceu!");
        }

    }
}
