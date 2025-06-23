import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Insira o seu nome: ");
        String nameInput = scanner.nextLine();

        System.out.print("Insira a sua idade: ");
        int ageInput = scanner.nextInt();

        System.out.print("Insira a sua nota escolar: ");
        double gradeInput = scanner.nextDouble();

        System.out.println("Nota escolar: " + gradeInput);

        System.out.print("Você é estudante? (true/false): ");
        boolean isStudentInput = scanner.nextBoolean();

        if (isStudentInput) {
            System.out.println("Você é estudante");
        } else {
            System.out.println("Você NÃO é estudante");
        }

        System.out.println("Olá " + nameInput + ", você tem " + ageInput + " anos.");
        scanner.nextLine();

        // Calcular a área de uma área

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Insira a largura da área: ");
        width = scanner.nextDouble();

        System.out.print("Insira a altura da área: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("A área é: " + area + "m²");

        scanner.close();
    }
}