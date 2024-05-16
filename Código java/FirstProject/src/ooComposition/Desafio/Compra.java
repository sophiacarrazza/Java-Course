package ooComposition.Desafio;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qntd){
        this.itens.add(new Item(p, qntd));
    }
    void adicionarItem(String nome, double preco, int qntd){
        this.itens.add(new Item(new Produto(nome, preco), qntd));
    }

    double getValorTotal(){
        double total = 0;
        for(Item item : itens){
            total += (item.qntd * item.produto.preco);
        }
        return total;
    }
}
