package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    @Test
    public void constroi(){
        Motorista motorista = new Motorista("Marcelo","5432154321");
        assertEquals("5432154321",motorista.getCpf());
        assertEquals("Marcelo",motorista.getNome());
    }
    @Test
    public void mudaNome(){
        Motorista motorista = new Motorista("Marcelo","5432154321");
        motorista.setNome("Joao");
        assertEquals("Joao",motorista.getNome());
    }
    @Test
    public void avalia(){
        Motorista motorista = new Motorista("Marcelo","5432154321");
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 3);
        assertEquals(3,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaBaixo(){
        Motorista motorista = new Motorista("Marcelo","5432154321");
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 0);
        assertEquals(1,corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaAlto(){
        Motorista motorista = new Motorista("Marcelo","5432154321");
        Passageiro passageiro = new Passageiro("Felipe","1234512345");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 6);
        assertEquals(5,corrida.getNotaPassageiro());
    }

}
