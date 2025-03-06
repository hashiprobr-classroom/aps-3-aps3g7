package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private double notaPassageiro;
    private double notaMotorista;
    public Corrida(){
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    private double naoentendi(int n){
        int f = 0;
        if (n<1){f=1;}
        if (n>5){f=5;}
        return f;
    }
    public avaliaPassageiro(int nota){

    }
    public avaliaMotorista(int nota){

    }
}
