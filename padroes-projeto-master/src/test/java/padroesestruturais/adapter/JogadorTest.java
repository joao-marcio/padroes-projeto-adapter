package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarDesempenhoJogador() {
        Jogador jogador = new Jogador();
        jogador.setAvaliacao("Pro");

        assertEquals("Pro", jogador.getAvaliacao());
    }

}