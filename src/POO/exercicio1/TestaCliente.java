package POO.exercicio1;

import POO.exercicio1.Cliente;

public class TestaCliente {

    public static void main(String[] args) {

        //Instanciando objetos
        Cliente ct1 = new Cliente("Lucas Santana","333.444.555-66","Rua São Luiz, 34","(11)99999-8888","lucas.santana@email.com");
        Cliente ct2 = new Cliente("Geovana Martins","777.333.555-66","Alameda Bastião, 455","(11) 55555-4444","martins_geovana@email.com");

        ct1.visualizarCliente();
        ct2.visualizarCliente();
    }
}
