package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private static final double DELTA = 0.000001;
    //private Central central;

  //  @BeforeEach
  //  void setUp() {
  //      Central central = new Central();
  //  }

    @Test
    public void nenhumaAvaliacaoPassageiro(){
        Central central = new Central();
        assertEquals(0, central.mediaPassageiro("1111111111"), DELTA);
    }

    @Test
    public void nenhumaAvaliacaoMotorista(){
        Central central = new Central();
        assertEquals(0, central.mediaPassageiro("2222222222"), DELTA);
    }
    @Test
    public void avaliacoesPassageiro(){
        Central central = new Central();
        Passageiro passageiro1 = new Passageiro("Felipe", "1234512345");
        Motorista motorista1 = new Motorista("Marcelo", "5432154321");

        Corrida corrida1 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida1.avaliaPassageiro(0);
        corrida1.avaliaMotorista(1);
        central.adiciona(corrida1);

        Corrida corrida2 = new Corrida(passageiro1);
        corrida2.setMotorista(motorista1);
        corrida2.avaliaPassageiro(4);
        corrida2.avaliaMotorista(3);
        central.adiciona(corrida2);

        Corrida corrida3 = new Corrida(passageiro1);
        corrida3.setMotorista(motorista1);
        corrida3.avaliaPassageiro(5);
        corrida3.avaliaMotorista(5);
        central.adiciona(corrida3);

        Passageiro passageiro2 = new Passageiro("Joao", "1212121212");
        Corrida corrida4 = new Corrida(passageiro2);
        corrida4.setMotorista(motorista1);
        corrida4.avaliaPassageiro(3);
        corrida4.avaliaMotorista(2);
        central.adiciona(corrida4);

        assertEquals(4.5, central.mediaPassageiro("1234512345"), DELTA);
    }

    @Test
    public void avaliacoesMotorista(){
        Central central = new Central();
        Passageiro passageiro1 = new Passageiro("Felipe", "1234512345");
        Motorista motorista1 = new Motorista("Marcelo", "5432154321");

        Corrida corrida1 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida1.avaliaPassageiro(1);
        corrida1.avaliaMotorista(0);
        central.adiciona(corrida1);

        Corrida corrida2 = new Corrida(passageiro1);
        corrida2.setMotorista(motorista1);
        corrida2.avaliaPassageiro(3);
        corrida2.avaliaMotorista(2);
        central.adiciona(corrida2);

        Corrida corrida3 = new Corrida(passageiro1);
        corrida3.setMotorista(motorista1);
        corrida3.avaliaPassageiro(3);
        corrida3.avaliaMotorista(3);
        central.adiciona(corrida3);

        Motorista motorista2 = new Motorista("Joao", "1212121212");
        Corrida corrida4 = new Corrida(passageiro1);
        corrida4.setMotorista(motorista1);
        corrida4.avaliaPassageiro(3);
        corrida4.avaliaMotorista(1);
        central.adiciona(corrida4);

        Corrida corrida5 = new Corrida(passageiro1);
        corrida5.setMotorista(null);
        corrida5.avaliaPassageiro(3);
        corrida5.avaliaMotorista(1);
        central.adiciona(corrida5);

        assertEquals(2.5, central.mediaMotorista("5432154321"), DELTA);
    }
}
