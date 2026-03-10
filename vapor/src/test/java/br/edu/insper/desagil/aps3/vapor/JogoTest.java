package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {
    private static double delta = 0.01;

    private Jogo jogo;

    @Test
    void constroi(){
        jogo = new Jogo(10,"cs");
        assertEquals(10,jogo.getIdentificador());
        assertEquals("cs", jogo.getNome());
        assertEquals(0,jogo.getMediaAvaliacoes(),delta);
    }
    @Test
    void avaliaUmaVez(){
        jogo = new Jogo(10,"cs");
        jogo.adicionarAvaliacao("guga",3);

        assertTrue(jogo.temAvaliacaoDe("guga"));
        assertEquals(3,jogo.getMediaAvaliacoes(),delta);
        assertFalse(jogo.temAvaliacaoDe("outro"));

    }

}
