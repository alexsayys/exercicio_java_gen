package POO.exercicio2;

public class TestaFuncionario {

    public static void main(String[] args) {

        //Objetos

        Funcionario[] lista = new Funcionario[2];

        lista[0] = new Funcionario("Jorge","Xavier Falcão","Product Owner","jorge.xavier@empresa.com",6500.15f);
        lista[1] = new Funcionario("Carolina","Gusmão","Gerente de Produto","carolina.gusmao@empresa.com",9000.00f);

        for (Funcionario roda:lista) {

            roda.visualizar();
        }
    }
}
