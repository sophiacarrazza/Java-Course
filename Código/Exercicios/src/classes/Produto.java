package classes;

public class Produto {

    public String nome;
    public double preco;
    public double desconto;

    Produto(){

    }

    public Produto(String nome, double p, double d){
        this.nome = nome;
        preco = p;
        desconto = d;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
