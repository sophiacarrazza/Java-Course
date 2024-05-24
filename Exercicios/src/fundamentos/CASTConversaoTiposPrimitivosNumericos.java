package fundamentos;

public class CASTConversaoTiposPrimitivosNumericos {

    public static void main (String[] args){
       double a = 1; //conversao implícita (double é maior e armazena
        //um tipo flutuante, ent n tem problema).

        float b = (float) 1.0; //conversao explicita (CAST)

        int c = 4;
        byte d = (byte) c; //cast
        System.out.println(d);

    }
}
