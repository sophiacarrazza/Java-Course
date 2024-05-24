package fundamentos;

public class SwitchSemBreak {

    public static void main (String[] args) {

        String switches = "vermelho";

        // sem break, o switch faz tudo que esta em todos os casess
        switch(switches.toLowerCase()){
            case "red":
                System.out.println("silencioso e leve");
            case "brown":
                System.out.println("silencioso e pesado");
            case "blue":
                System.out.println("barulhento e leve");
        }

    }
}
