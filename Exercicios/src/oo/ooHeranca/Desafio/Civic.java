package oo.ooHeranca.Desafio;

public class Civic extends Carro {

    public Civic (){
        this(200);
    }
    public Civic(int velMax){
        super(velMax);
        delta = 10;
    }
    //acelerar
    public void acelerar(){
        this.velocidade += 2 * delta;
    }

    //frear
    public void frear(){
        if(this.velocidade >= 5){
            this.velocidade -= 2 * delta;
        }
    }

}
