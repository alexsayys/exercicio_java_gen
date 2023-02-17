package collections;

import java.util.*;

public class collectionList {
    public static void main(String[] args) {
        ArrayList<String> listaCores = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        String cor;
        int x;

        do {
            System.out.println("Insira a cor: ");
            cor = sc.next();

            listaCores.add(cor);

            System.out.println("Deseja adicionar outra: \n1 - Sim\n2 - Não");
            x = sc.nextInt();
            sc.nextLine();
        } while (x == 1);

        Iterator<String> iLista = listaCores.iterator();

        System.out.println("LISTAR CORES");
        while (iLista.hasNext())
        {
            System.out.println(iLista.next());
        }

        Collections.sort(listaCores);
        System.out.println("\nLISTA ORDENADA");

        for (String nome : listaCores)
        {
            System.out.println(nome);
        }

    }

}
