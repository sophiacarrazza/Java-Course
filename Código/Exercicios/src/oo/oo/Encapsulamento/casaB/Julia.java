package oo.oo.Encapsulamento.casaB;
import oo.oo.Encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos(){
        //System.out.println(sogra.segredo); nao é possivel acessar
        //System.out.println(sogra.facoDentroDeCasa); nao é possivel acessar
        //System.out.println(sogra.formaDeFalar); nao é possivel acessar
        System.out.println(sogra.todosSabem);
    }
}
