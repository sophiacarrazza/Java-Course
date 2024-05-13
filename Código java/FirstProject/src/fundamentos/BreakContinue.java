package fundamentos;

public class BreakContinue {

    public static void main (String[] args) {

        // o break sai da estrutura for
        for(int i=0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim");

        // o continue só sai desta repetição e continua para a próxima
        for(int i=0; i<10; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
