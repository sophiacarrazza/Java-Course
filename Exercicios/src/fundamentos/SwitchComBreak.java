package fundamentos;

public class SwitchComBreak {

    public static void main (String[] args) {

        String switches = "brown";

        //com break, ele executa só um bloco (do caso) e sai
        switch(switches.toLowerCase()){
            case "red":
                System.out.println("silencioso e leve");
                break;
            case "brown":
                System.out.println("silencioso e pesado");
                break;
            case "blue":
                System.out.println("barulhento e leve");
                break;
            default:
                System.out.println("teclas de membrana");
        }

    }
}
