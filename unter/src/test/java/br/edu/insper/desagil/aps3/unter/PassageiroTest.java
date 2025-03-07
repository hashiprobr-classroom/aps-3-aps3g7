package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    @Test
    public void constroi(){
        Passageiro passageiro = new Passageiro("Joao","12345567890");
        assertEquals("1234567890",passageiro.getCpf());
        assertEquals("Joao",passageiro.getNome());
    }
    @Test
    public void mudaNome(){
        Passageiro passageiro = new Passageiro("Joao","1234567890");
        passageiro.setNome("Maria");
        assertEquals("Maria",passageiro.getNome());
    }
    @Test
    public void avalia(){
        Passageiro passageiro = new Passageiro("Joao","12345567890");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 3);
        assertEquals(3,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaBaixo(){
        Passageiro passageiro = new Passageiro("Joao","12345567890");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 0);
        assertEquals(1,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaAlto(){
        Passageiro passageiro = new Passageiro("Joao","12345567890");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        passageiro.avalia(corrida, 6);
        assertEquals(5,corrida.getNotaPassageiro());
    }
}
