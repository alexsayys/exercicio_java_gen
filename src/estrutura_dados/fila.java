package estrutura_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<String>();
        int opcao;

        //Mostra o menu e as opções ao usuário
        do
        {
            //Mostra o menu principal
            System.out.println("\n################ MENU PRINCIPAL ###################");
            System.out.println("1 - Adicionar cliente à fila");
            System.out.println("2 - Listar todos os clientes");
            System.out.println("3 - Retirar cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("Entre com a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); //Consome a quebra de linha pendente

            //Adiciona um cliente ao fim da fila
            if (opcao == 1)
            {
                int adicionar;
                String nomeCliente;

                do
                {
                    System.out.println("Insira o nome: ");
                    nomeCliente = sc.nextLine();


                    filaClientes.add(nomeCliente);

                    System.out.println("\nCliente adicionado!\nDeseja adicionar outro?\n1 - Sim\n2 - Não");
                    adicionar = sc.nextInt();
                    sc.nextLine();

                } while (adicionar == 1);

            }

            //Lista os clientes na fila
            else if (opcao == 2)
            {
                if (filaClientes.isEmpty())
                {
                    System.out.println("A fila está vazia!");
                }
                else
                {
                    System.out.println("\nLista de clientes na fila: \n"+filaClientes);
                }

                System.out.println("\nOPÇÕES:\n1 - Ínicio\n0 - Sair");
                opcao = sc.nextInt();
            }

            //Remove o primeiro cliente da fila
            else if (opcao == 3)
            {
                do {

                    if (filaClientes.isEmpty())
                    {
                        System.out.println("A fila está vazia");
                    }
                    else
                    {
                        System.out.println("Cliente chamado(a): "+filaClientes.poll());
                    }

                    System.out.println("\nDeseja remover outro?\n1 - Sim\n2 - Não\n0 - Sair");
                    opcao = sc.nextInt();
                }while (opcao == 1);

            }
            else if (opcao < 0 || opcao > 3)
            {
                System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa Finalizado!");
    }
}
