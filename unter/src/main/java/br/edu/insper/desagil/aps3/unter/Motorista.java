package br.edu.insper.desagil.aps3.unter;

public class Motorista extends Usuario {
    public Motorista(String nome,String cpf){
        super(nome,cpf);
    }
    @Override
    public void avalia(Corrida corrida, int nota){corrida.avaliaMotorista(nota);}
}
