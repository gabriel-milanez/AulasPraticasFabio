import java.util.HashMap;

public class Aula3 {
    public static void main(String[] args){
        HashMap<Integer, String> produtos = new HashMap<>();
        
        produtos.put(201, "Notebook");
        produtos.put(202, "Mouse");
        produtos.put(203, "Teclado");
        produtos.put(204, "Monitor");
        produtos.put(205, "Mousepad");

        System.out.println("Produto 202: " + produtos.get(202));
        System.out.println("Produto 203: " + produtos.get(203));

        if (produtos.containsKey(999)) {
            System.out.println("Produto: " + produtos.get(999));
        } else {
            System.out.println("Produto não encontrado!!");
        }

        produtos.remove(201);

        System.out.println("Depois de remover" + produtos);
    }
}