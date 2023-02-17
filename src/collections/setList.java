package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class setList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> listaNumeros = new HashSet<Integer>();


        for (int i = 0; i < 10; i++)
        {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            listaNumeros.add(num);
        }

        Iterator<Integer> iLista = listaNumeros.iterator();

        System.out.println("LISTAR NUMEROS");
        while (iLista.hasNext())
        {
            System.out.println(iLista.next());
        }
    }
}
