package oo.ooHeranca.Desafio;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari (){
        this(315);
    }
    public Ferrari(int velMax){
        super(velMax);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;

    }

    //escrevemos override quando estamos sobreescrevendo um metodo
    //ele serve como uma validação pra vc ter certeza que realmente
    //está sobreescrevendo esse metodo
    @Override
    public void acelerar() {
        this.velocidade += 4 * delta; // 4x mais rapido que o pai Carro
    }

    @Override
    public void frear() {
        if (this.velocidade >= 5) {
            this.velocidade -= 4 * delta;
        }
    }

}
