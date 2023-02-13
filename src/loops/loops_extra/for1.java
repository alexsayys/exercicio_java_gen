package loops.loops_extra;

public class for1 {
    public static void main(String[] args) {

        //Definição de variável
        int x;

        System.out.println("\nAqui estão os números dividos por 11 e dão resto 5: ");

        //Laço que adiciona + 1 a variável x
        for (x=1000; x <= 1999; x++)
        {
            //Condicional que calcula o resto de x / 11
            if (x % 11 == 5)
            {
                //Informa os números na tela
                System.out.printf("\n%d",x);
            }
        }
    }
}
