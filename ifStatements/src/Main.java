import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa de verificação de idade!");
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        // Estrutura de condição 1
        if (name.isEmpty()) {
            System.out.println("\nVocê não digitou seu nome.");
        } else {
            System.out.println("\nOlá, " + name + "! Sua idade é: " + age);
        }

        // Estrutura de condição 2

        if (age >= 18) {
            System.out.println("Você é maior de idade;");
        } else if (age < 0) {
            System.out.println("Você não nasceu ainda meu consagrado.");
        } else if (age == 0) {
            System.out.println("Você acabou de nascer, bem-vindo ao mundo!");
        } else {
            System.out.println("Você é menor de idade;");
        }

        scanner.close();
    }
}
