package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private ComunidadeDeJogo comunidade;
    private Jogo jogo;

    @Test
    void adicionaDoisInvalidos(){
        jogo = new Jogo(1,"cs");
        comunidade = new ComunidadeDeJogo(new ArrayList<>(),jogo);
        comunidade.adicionarMembro(new Usuario("aa","Arthur"));
        comunidade.adicionarMembro(new Usuario("bb","Bruno"));
        assertEquals(List.of(),comunidade.getApelidos());
    }

    @Test
    void adicionaUmInvalidoUmValido(){
        jogo = new Jogo(1,"cs");
        jogo.adicionarAvaliacao("bb",5);
        comunidade = new ComunidadeDeJogo(new ArrayList<>(),jogo);
        comunidade.adicionarMembro(new Usuario("aa","Arthur"));
        comunidade.adicionarMembro(new Usuario("bb","Bruno"));
        assertEquals(List.of("bb"),comunidade.getApelidos());
    }

    @Test
    void adicionaDoisValidos(){
        jogo = new Jogo(1,"cs");
        jogo.adicionarAvaliacao("aa",5);
        jogo.adicionarAvaliacao("bb",3);
        comunidade = new ComunidadeDeJogo(new ArrayList<>(),jogo);
        comunidade.adicionarMembro(new Usuario("aa","Arthur"));
        comunidade.adicionarMembro(new Usuario("bb","Bruno"));
        assertEquals(List.of("aa","bb"),comunidade.getApelidos());
    }
}