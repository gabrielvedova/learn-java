public class Main {

    public static void main(String[] args) {
        System.out.println("Fala aí");

        // Comentário de uma linha

        /*
        * Comentário de várias linhas
        * Mais uma linha
        */

        //Atalho interessante
        System.out.println("Atalho para um comentário no intellij: sout");

        // Variáveis Primitivas vs Referencial
        //Primitiva
        /*
        * int
        * double
        * char
        * boolean
        */

        //Referencial
        /*
        string
        array
        object
         */

        // Primitiva: paga 10 dólares
        // Referencial: diz que deve 10 dólares

        // Criando variáveis
        int age = 16;

        System.out.println("Idade: "+age);

        double price = 19.99;

        System.out.println("R$"+price);


        char symbol = '$';

        System.out.println(symbol +""+ price);

        boolean isStudent = true;

        if (isStudent) {
            System.out.println("Você é estudante");
        } else {
            System.out.println("Você NÃO é estudante");
        }

        String name = "Gabriel Vedova";
        String food = "pizza";

        System.out.println("A comida favorita de "+name+" é "+food);

    }
}
