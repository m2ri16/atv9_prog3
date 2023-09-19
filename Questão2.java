import java.util.ArrayList;

public class Questão2{

class ItemPedido {
    private String nome;
    private double preco;

    public ItemPedido(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}

class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens;
    private double total;

    public Pedido(int numero, ArrayList<ItemPedido> itens) {
        this.numero = numero;
        this.itens = itens;
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    private void calcularTotal() {
        total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
    }

    public String getNumero() {
        return null;
    }
}
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        ArrayList<ItemPedido> itensPedido1 = new ArrayList<>();
        itensPedido1.add(new ItemPedido("Produto 1", 100.0));
        itensPedido1.add(new ItemPedido("Produto 2", 200.0));
        Pedido pedido1 = new Pedido(1, itensPedido1);
        pedidos.add(pedido1);

        ArrayList<ItemPedido> itensPedido2 = new ArrayList<>();
        itensPedido2.add(new ItemPedido("Produto 3", 300.0));
        Pedido pedido2 = new Pedido(2, itensPedido2);
        pedidos.add(pedido2);

        ArrayList<ItemPedido> itensPedido3 = new ArrayList<>();
        itensPedido3.add(new ItemPedido("Produto 4", 400.0));
        Pedido pedido3 = new Pedido(3, itensPedido3);
        pedidos.add(pedido3);

        ArrayList<ItemPedido> itensPedido4 = new ArrayList<>();
        itensPedido4.add(new ItemPedido("Produto 5", 200.0));
        itensPedido4.add(new ItemPedido("Produto 6", 400.0));
        Pedido pedido4 = new Pedido(4, itensPedido4);
        pedidos.add(pedido4);


        for (Pedido pedido : pedidos) {
            System.out.println("Pedido #" + pedido.getNumero() + ": Total = R$" + pedido.getTotal());
            if (pedido.getTotal() > 500.0) {
                System.out.println("Este pedido tem um valor total superior a R$ 500.");
            }
        }
    }
}