package oo.oo.Encapsulamento.casaB;
import oo.oo.Encapsulamento.casaA.Ana;

public class Pedro extends Ana{ // Pedro é filho de Ana

    Ana mae = new Ana();

    //tudo que for acessado por heranca nao deve ser acessado pela
    //instancia do objeto pai, mas acessar diretamente.

    void testeAcessos(){
        //System.out.println(mae.segredo); nao é possivel acessar
        //System.out.println(mae.facoDentroDeCasa); nao é possivel acessar

        //System.out.println(mae.formaDeFalar); nao é possivel acessar um atributo de heranca via instancia
        System.out.println(formaDeFalar); //acessando via heranca
        System.out.println(todosSabem);

    }

}
