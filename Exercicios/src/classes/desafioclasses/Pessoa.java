package classes.desafioclasses;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String n, double p){
        this.nome = n;
        this.peso = p;
    }
    void comer(Comida alimento){
        if(alimento != null)
            this.peso += alimento.peso;

    }
}
