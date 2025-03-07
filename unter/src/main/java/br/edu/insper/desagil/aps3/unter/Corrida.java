package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista = null;
    private int notaPassageiro = 0;
    private int notaMotorista = 0;
    public Corrida(Passageiro passageiro){
        this.passageiro = passageiro;

    }
    public Passageiro getPassageiro(){
        return passageiro;
    }
    public Motorista getMotorista(){
        return motorista;
    }
    public void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }
    public int getNotaMotorista(){
        return notaMotorista;
    }
    public int getNotaPassageiro(){
        return notaPassageiro;
    }
    private int ajuste(int n){
        int f = 0;
        if (n<1){f=1;}
        if (n>5){f=5;}
        return f;
    }
    public void avaliaPassageiro(int nota){
        this.notaPassageiro = ajuste(nota);
    }
    public void avaliaMotorista(int nota){
        this.notaMotorista = ajuste(nota);
    }
}
