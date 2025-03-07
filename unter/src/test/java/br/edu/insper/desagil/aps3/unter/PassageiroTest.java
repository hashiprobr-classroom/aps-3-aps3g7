package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    @Test
    public void constroi(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        assertEquals("1234512345",passageiro.getCpf());
        assertEquals("Felipe",passageiro.getNome());
    }
    @Test
    public void mudaNome(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        passageiro.setNome("Pedro");
        assertEquals("Pedro",passageiro.getNome());
    }
    @Test
    public void avalia(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 3);
        assertEquals(3,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaBaixo(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 0);
        assertEquals(1,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaAlto(){
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 6);
        assertEquals(5,corrida.getNotaPassageiro());
    }
}
