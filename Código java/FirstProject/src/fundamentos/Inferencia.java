package fundamentos;

public class Inferencia {

    public static void main (String[] args) {
        double a = 4.5;

        //o tipo var faz com que o java infira qual é o tipo
        //pelo valor que vc colocar
        var b = 4.5;
        var c = "Texto";
        //mas dps vc n pode mudar o tipo dessa var, pq o java
        // já inferiu e amarrou um tipo pra ela, que não mudará.

    }
}
