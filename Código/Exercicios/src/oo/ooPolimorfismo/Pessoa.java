package oo.ooPolimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa (double peso){
        setPeso(peso);
    }

    //polimorfismo estatico -> sobrecarga de metodos
//    public void comer(Arroz arroz){
//        this.peso += arroz.getPeso();
//    }
//    public void comer(Feijao feijao){
//        this.peso += feijao.getPeso();
//    }
//    public void comer(Sorvete sorvete){
//        this.peso += sorvete.getPeso();
//    }
//    public double getPeso(){
//        return peso;
//    }

    //polimorfismo dinamico -> criando uma superclasse pras comidas
    public void comer(Comida alimento){
        this.peso += alimento.getPeso();
    }

    public void setPeso(double peso){
        if(peso >= 0){
            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }
}
