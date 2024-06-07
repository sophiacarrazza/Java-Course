package oo.ooHeranca.Desafio;

public class NaRua {

    public static void main (String [] args){

        Carro civic = new Civic();

        Ferrari ferrari = new Ferrari(); //precisa ser Ferrari ferrari para acessar o metodo turbo

        ferrari.ligarTurbo();

        ferrari.acelerar();
        civic.acelerar();

        System.out.println("A velocidade da ferrari é: " + ferrari.velocidade);
        System.out.println("A velocidade do civic é: " + civic.velocidade);

    }
}
