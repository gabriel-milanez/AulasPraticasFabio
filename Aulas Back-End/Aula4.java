import java.util.HashMap;
import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        produtos.put(78910, "Chocolate - R$4.50");
        produtos.put(78920, "Café - R$8.50");
        produtos.put(78930, "Azeite - R$12.50");

        System.out.println("Exiba o produto no leitor(Digite o código de barras)");
        int codigo = scanner.nextInt();
    }
}