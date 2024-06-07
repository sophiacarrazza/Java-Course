package oo.ooComposicao;

public class CompraTeste {

    public static void main(String[] args){
        Compra c1 = new Compra();
        c1.cliente = "Joao Pedro";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.adicionarItem(new Item("Borracha", 12, 2.50));
        c1.itens.add(new Item("Caderno", 8, 20.75));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

    }
}
