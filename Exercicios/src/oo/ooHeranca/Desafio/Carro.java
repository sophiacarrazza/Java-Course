package oo.ooHeranca.Desafio;

public class Carro {

    int velMax;
    int velocidade = 0;
    int delta;

    protected Carro (int velMax){
        this.velMax = velMax;
    }

    //acelerar
    public void acelerar(){
        if(velMax + 5 > this.velMax){
            velMax = this.velMax;
        } else{
            this.velocidade += delta;
        }
    }

    //frear
    public void frear(){
        if(this.velocidade >= 5){
            this.velocidade -= delta;
        }
    }


}
