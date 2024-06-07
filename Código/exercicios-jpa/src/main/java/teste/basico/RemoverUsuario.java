package teste.basico;
import modelo.basico.Usuario;
import javax.persistence.*;

public class RemoverUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();


        Usuario usuario = em.find(Usuario.class, 7L);
        if(usuario != null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();
    }
}
