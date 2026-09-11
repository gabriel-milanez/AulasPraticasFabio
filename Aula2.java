import java.util.ArrayList;

public class Aula2 {
    public static void main(String[] args) {
        ArrayList<String> carrinho = new ArrayList<>();
        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        carrinho.add("Caixa de som");
        carrinho.add("Energético");
        carrinho.add("Controle");
        carrinho.add("Mousepad");
        carrinho.add("Placa de video");
        carrinho.add("SSD");

        System.out.println(carrinho);
        System.out.println("Este é seu ultimo produto: " + carrinho.get(9));
        System.out.println("Vocẽ tem essa quantidade de items: " + carrinho.size());
        carrinho.remove("Mouse");
        System.out.println("Depois de remover: " + carrinho);
        System.out.println("Vocẽ tem essa quantidade de items após remover um produto: " + carrinho.size());
    }
}