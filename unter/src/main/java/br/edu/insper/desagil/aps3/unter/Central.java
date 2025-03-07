package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Central {
    private List<Corrida> corridas = new ArrayList<>();

    public double mediaPassageiro(String cpf){
        double media = 0;
        int quantidade = 0;
        for (Corrida corrida :this.corridas){
            if (Objects.equals(corrida.getPassageiro().getCpf(),cpf)&& corrida.getNotaPassageiro()!=0){
                media += corrida.getNotaPassageiro();
                quantidade +=1;
            }
        }
        if (quantidade == 0){
            return 0.0;
        }
        return media/quantidade;
    }
    public double mediaMotorista(String cpf){
        double media = 0;
        int quantidade = 0;
        for (Corrida corrida :this.corridas){
            if (corrida.getMotorista() != null) {
                if (Objects.equals(corrida.getMotorista().getCpf(), cpf) && corrida.getNotaMotorista() != 0) {
                    media += corrida.getNotaMotorista();
                    quantidade += 1;
                }
            }
        }
        if (quantidade == 0){
            return 0.0;
        }
        return media/quantidade;
    }
    public void adiciona(Corrida corrida){
        this.corridas.add(corrida);
    }
}
