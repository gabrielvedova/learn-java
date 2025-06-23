import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Digite um adjetivo (descrição): ");
        adjective1 = scanner.nextLine();
        System.out.print("Digite um substantivo (animal ou pessoa): ");
        noun1 = scanner.nextLine();
        System.out.print("Digite outro adjetivo (característica): ");
        adjective2 = scanner.nextLine();
        System.out.print("Digite um verbo (ação): ");
        verb1 = scanner.nextLine();
        System.out.print("Digite um adjetivo (sentimento): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nHoje eu fui a um " + adjective1 + " zoológico.");
        System.out.println("Em uma exibição, eu vi um(a) " + noun1 + "." );
        System.out.println(noun1 + " era " + adjective2 + " e " + verb1 + "!");
        System.out.println("Eu estava " + adjective3 + "!");
    }
}