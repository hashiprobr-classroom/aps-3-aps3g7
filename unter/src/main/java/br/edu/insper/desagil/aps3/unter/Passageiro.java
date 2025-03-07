package br.edu.insper.desagil.aps3.unter;

public class Passageiro extends Usuario {
    public Passageiro(String nome,String cpf){
        super(nome,cpf);
    }
    @Override
    public void avalia(Corrida corrida,int nota){corrida.avaliaPassageiro(nota);}


}
