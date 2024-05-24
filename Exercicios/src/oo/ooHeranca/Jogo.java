package oo.ooHeranca;

public class Jogo {

    public static void main (String [] args){
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(11, 10);
        //ou
//      Jogador heroi = new Heroi(11, 10);

        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);

        System.out.println("Monstro tem " + monstro.vida + "de vida");
        System.out.println("Heroi tem " + heroi.vida + "de vida");

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.OESTE);


    }
}
