package fundamentos;
import javax.swing.JOptionPane;

public class ConversaoNumeroString {

    public static void main (String[] args){
        Integer num1 = 1000;
        //o numero precisa ser um wrapper pq a gnt vai usar o operador "."
        System.out.println(num1.toString());
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        //ou -> concatenando (mas nao é mto elegante)
        System.out.println(("" + num2).length());

        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo numero: ");
        System.out.println(valor1 + valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);




    }
}
