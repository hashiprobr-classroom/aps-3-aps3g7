package br.edu.insper.desagil.aps3.unter;

public class Usuario {
    private int cpf;
    private String nome;

    public Usuario(String nome,int cpf){
        this.cpf = cpf;
        this.nome = nome;
    }
    public int getCpf(){return cpf;}
    public String getNome(){return nome;}
    public void setNome(String newnome){nome = newnome;}
    public void avalia(Corrida corrida, int nota){

    }
}
