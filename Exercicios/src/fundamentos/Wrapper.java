package fundamentos;
import java.util.Scanner;

public class Wrapper {

    public static void main (String[] args){
        //Wrappers são a versão objeto dos tipos primitivos!
    Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        Short s = 1000;

        //Integer.parseInt(entrada.next());
        Integer i = 10000; //int
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Float f = 123.89F;
        System.out.println(f);

        Double d = 1234.4543;
        System.out.println(d);
    }
}
