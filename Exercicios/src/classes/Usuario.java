package classes;
import java.util.Objects;

public class Usuario {
    public String nome;
    public String email;

    public Usuario (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    public boolean equals (Object objeto){

        if (objeto instanceof Usuario) { //a variavel objeto é uma instancia de Usuario?
            Usuario outro = (Usuario) objeto; //casting de object para usuario
            return super.equals(outro);
        }
        return false;

        // ou:
//        Usuario outro = (Usuario) objeto; //casting de object para usuario
//        boolean nomeIgual = (outro.nome.equals(this.nome));
//        boolean emailIgual = (outro.email.equals(this.email));
//        return nomeIgual && emailIgual;

    }
}
