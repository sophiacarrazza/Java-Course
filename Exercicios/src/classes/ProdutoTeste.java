package classes;

public class ProdutoTeste {

    public static void main (String[] args){
        Produto p1 = new Produto();
        p1.nome = "Notebook Acer";
        p1.preco = 4567.78;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Teclado Attack Shark preto";
        p2.preco = 267.50;
        p2.desconto = 0.15;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double somaCarrinho = precoFinal1 + precoFinal2;

        System.out.println("A soma dos produtos do carrinho é: " + somaCarrinho);
        

    }
}
