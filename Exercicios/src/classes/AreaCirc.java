package classes;

public class AreaCirc {
    double raio;
    final static double pi = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return pi * (raio * raio);
    }

}
