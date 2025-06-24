import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o valor do lado A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("O valor da hipotenusa é: " + c);

        scanner.close();
    }
}
