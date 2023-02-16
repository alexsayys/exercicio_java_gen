package estrutura_dados;

import java.util.Scanner;
import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<String>();

        //Variável global
        int escolha;

        //Laço que informa e executas as opções
        do
        {
            //Mostra o menu principal
            System.out.println("\n################ MENU PRINCIPAL ###################");
            System.out.println("1 - Adicionar livro à pilha");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Retirar livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("\n*****************************************************");
            System.out.println("\nEntre com a opção desejada: ");
            escolha = sc.nextInt();
            sc.nextLine(); //Consome a quebra de linha pendente

            //Adicioa livro ao topo da pilha
            if (escolha == 1)
            {
                String nomeLivro;

                do
                {
                    System.out.println("Insira o nome: ");
                    nomeLivro = sc.nextLine();
                    pilhaLivros.push(nomeLivro);

                    System.out.println("\nLivro "+nomeLivro+" adicionado!\nDeseja adicionar outro?\n1 - Sim\n2 - Não");
                    escolha = sc.nextInt();
                    sc.nextLine();
                } while (escolha == 1);

            //Mostra lista de livros
            } else if (escolha == 2)
            {
                if (pilhaLivros.isEmpty()) //Lista vazia
                {
                    System.out.println("A pilha está vazia!");
                }
                else
                {
                    System.out.println("\nLista de livros: \n"+pilhaLivros);
                }

                //Mostra o menu secundário
                System.out.println("\nOPÇÕES:\n1 - Ínicio\n0 - Sair");
                escolha = sc.nextInt();
            }

            //Remove o livro do topo da pilha
            else if (escolha == 3)
            {
                //Executa o código quantas vezes o usuário quiser
                do {

                    if (pilhaLivros.isEmpty())
                    {
                        System.out.println("A pilha está fazia");
                    }
                    else
                    {
                        System.out.println("Livro removido: "+pilhaLivros.pop());
                    }

                    //Mostra o menu secundário
                    System.out.println("\nDeseja remover outro?\n1 - Sim\n2 - Não\n0 - Sair");
                    escolha = sc.nextInt();
                }while (escolha == 1);
            }

            //Informa uma opção inválida
            else if (escolha < 0 || escolha > 3)
            {
                //Informa que a opção digitada é inválida
                System.out.println("Opção Inválida!");
            }
        } while(escolha != 0);

        System.out.println("Programa finalizado!");
    }
}
