import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        double number2;
        boolean isNumber;

        number1 = random.nextInt(1, 101); // Gera um número aleatório entre 1 e 100
        number2 = random.nextDouble(); // Gera um número aleatório entre 0.0 e 1.0
        isNumber = random.nextBoolean(); // Gera um valor booleano aleatório

        System.out.println(number1 + ", " + number2 + ", É número " + isNumber);
    }
}
