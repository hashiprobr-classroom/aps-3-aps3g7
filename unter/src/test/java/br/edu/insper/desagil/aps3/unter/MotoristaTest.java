package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private Motorista motorista;

    @BeforeEach
    void setup(){
        motorista = new Motorista("Marcelo", "5432154321");
    }

    @Test
    public void constroi(){
        assertEquals("5432154321",motorista.getCpf());
        assertEquals("Marcelo",motorista.getNome());
    }
    @Test
    public void mudaNome(){
        motorista.setNome("Joao");
        assertEquals("Joao",motorista.getNome());
    }
    @Test
    public void avalia(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 3);
        assertEquals(3,corrida.ajuste(corrida.getNotaMotorista()));
    }
    @Test
    public void avaliaBaixo(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 0);
        assertEquals(1,corrida.ajuste(corrida.getNotaMotorista()));
    }
    @Test
    public void avaliaAlto(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 6);
        assertEquals(5,corrida.ajuste(corrida.getNotaMotorista()));
    }

}
