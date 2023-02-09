package condicionais;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nO animal é: Invertebrado(1) ou Vertebrado(2): ");
        String carac1 = sc.nextLine();
        boolean vdd1 = carac1.equals("1");

        if (vdd1) { //Invertebrado

            System.out.println("\nO animal é: Inseto(1) ou Anelídeo(2): ");
            String carac2 = sc.nextLine();
            boolean vdd2 = carac2.equals("1");

            if (vdd2) { //Inseto

                System.out.println("\nO animal é: Hematófago(1) ou Herbívoro(2): ");
                String carac3 = sc.nextLine();
                boolean vdd3 = carac3.equals("1");

                if (vdd3) { //Hematófago
                    System.out.println("\nO animal é uma Pulga");
                }
                else if (!vdd3) { //Herbívoro
                    System.out.println("\nO animal é uma Lagarta");
                }
                else {
                    System.out.println("\nAconteceu um erro, aff!");
                }
            }
            else if (!vdd2) { //Anelídeo

                System.out.println("\nO animal é: Hematófago(1) ou Onívoro(2): ");
                String carac3 = sc.nextLine();
                boolean vdd3 = carac3.equals("1");

                if (vdd3) { //Hematófago
                    System.out.println("\nO animal é um Sanguessuga");
                }
                else if (!vdd3) { //Onívoro
                    System.out.println("\nO animal é uma Minhoca");
                }
                else {
                    System.out.println("\nAconteceu um erro, aff!");
                }
            }
            else {
                System.out.println("\nDigitou errado? Acredito que sim.");
            }

        }
        else if (!vdd1) { // Vertebrado
            System.out.println("\nO animal é: Ave(1) ou Mamífero(2): ");
            String carac2 = sc.nextLine();
            boolean vdd2 = carac2.equals("1");

            if (vdd2) { //Ave
                System.out.println("\nO animal é: Carnívoro(1) ou Onívoro(2): ");
                String carac3 = sc.nextLine();
                boolean vdd3 = carac3.equals("1");

                if (vdd3) { //Carnívoro
                    System.out.println("\nO animal é uma Águia");
                }
                else if (!vdd3) { //Onívoro
                    System.out.println("\nO animal é uma Pomba");
                }
                else {
                    System.out.println("\nAconteceu um erro, aff!");
                }
            }
            else if (!vdd2) { //Mamífero

                System.out.println("\nO animal é: Herbívoro(1) ou Onívoro(2): ");
                String carac3 = sc.nextLine();
                boolean vdd3 = carac3.equals("1");

                if (vdd3) { //Herbívro
                    System.out.println("\nO animal é um Vaca");
                }
                else if (!vdd3) { //Onívoro
                    System.out.println("\nO animal é um Homem");
                }
                else {
                    System.out.println("\nAconteceu um erro, aff!");
                }
            }
            else {
                System.out.println("\nDigitou errado? Acredito que sim.");
            }
        }
        else {
            System.out.println("\nAlgo não está certo.");
        }
    }
}
