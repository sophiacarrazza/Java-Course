package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro Silva", "pedro.silva@email.com");
        Usuario u2 = new Usuario("Antonieta Saraiva", "antonieta.s@email.com");
        Usuario u3 = new Usuario("Pedro Silva", "pedro.silva@email.com");

        System.out.println(u1 == u3);
        System.out.println(u1.equals(u3));


    }
}
