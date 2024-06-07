package oo.oo.Encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa (String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    //Getters
    public int getIdade(){ // ler idade
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
    //Setters
    public void setIdade(int novaIdade){ // alterar idade
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
