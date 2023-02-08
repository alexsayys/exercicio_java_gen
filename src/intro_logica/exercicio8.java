package intro_logica;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Entrada e Variáveis
        System.out.println("Insira o custo de fabricação do veículo:");
        double custoFabricacao = leia.nextDouble();
        double custoDistribuidor = custoFabricacao * 0.28;
        double custoImpostos = custoFabricacao * 0.45;

        //Processamento
        double custoFinal = custoFabricacao + custoDistribuidor + custoImpostos;

        //Saída
        System.out.println("Custo final do veículo: " + custoFinal);
    }
}
