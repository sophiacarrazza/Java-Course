package ooComposition.Desafio;

public class ClienteTeste {

    public static void main (String [] args){

        Cliente cliente1 = new Cliente("Mara");
        Cliente cliente2 = new Cliente("SheRa");

        Produto p1 = new Produto("Miojo", 5.60);
        Produto p2 = new Produto("Chocolate", 10.50);

        Compra compra1 = new Compra();
        compra1.adicionarItem(p1, 20);
        compra1.adicionarItem("Caneta", 9.57, 50);

        Compra compra2 = new Compra();
        compra2.adicionarItem(p2, 15);
        compra2.adicionarItem(new Produto("Cavalo", 4), 15);

        cliente1.compras.add(compra1);
        cliente2.compras.add(compra2);

        System.out.println(cliente1.getValorTotal());
        System.out.println(cliente2.getValorTotal());

    }
}
