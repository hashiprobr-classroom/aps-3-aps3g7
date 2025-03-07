package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;

    @BeforeEach
    void setup(){
        passageiro = new Passageiro("Felipe", "1234512345");
    }


    @Test
    public void constroi(){
        assertEquals("1234512345",passageiro.getCpf());
        assertEquals("Felipe",passageiro.getNome());
    }
    @Test
    public void mudaNome(){
        passageiro.setNome("Pedro");
        assertEquals("Pedro",passageiro.getNome());
    }
    @Test
    public void avalia(){
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 3);
        assertEquals(3,corrida.ajuste(corrida.getNotaPassageiro()));
    }
    @Test
    public void avaliaBaixo(){
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 0);
        assertEquals(1,corrida.ajuste(corrida.getNotaPassageiro()));
    }
    @Test
    public void avaliaAlto(){
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 6);
        assertEquals(5,corrida.ajuste(corrida.getNotaPassageiro()));
    }
}
