import java.util.ArrayList;

public class Aula2 {
    public static void main(String[] args) {
        ArrayList<String> carrinho = new ArrayList<>();
        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        System.out.println("Primeiro produto: " + carrinho.get(0));
        System.out.println("Segundo produto: " + carrinho.get(1));
        System.out.println("Terceiro produto: " + carrinho.get(2));
        System.out.println("Quarto produto: " + carrinho.get(3));
        System.out.println(carrinho);
        carrinho.remove("Mouse");
        System.out.println("Depois de remover: " + carrinho);
    }
}