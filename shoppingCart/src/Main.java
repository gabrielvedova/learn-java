import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String product;
        double price;
        int quantity;
        double total;

        System.out.print("Digite o nome do produto: ");
        product = scanner.nextLine();

        System.out.print("Digite o preço: ");
        price = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nProduto: "+ product);
        System.out.println("Preço: "+ price);
        System.out.println("Quantidade: "+ quantity);
        System.out.println("Total: "+ total);

        scanner.close();

    }
}
