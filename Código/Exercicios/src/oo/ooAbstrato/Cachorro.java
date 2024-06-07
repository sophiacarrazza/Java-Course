package oo.ooAbstrato;

public class Cachorro extends Mamifero{

    @Override
    public String mover() {
        return "Usando as patas";
    }
    @Override
    public String mamar() {
        return "Bebendo leite";
    }
}
