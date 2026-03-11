package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {
    private Loja loja;
    private List<Jogo> jogos;
    private Usuario usuario;
    private Jogo jogo,jogo1,jogo2;

    @BeforeEach
    void setup(){
        jogo = new Jogo(1,"a");
        jogo1 = new Jogo(2,"b");
        jogo2= new Jogo(3,"c");
        jogos = new ArrayList<>();
        jogos.add(jogo);
        jogos.add(jogo1);
        jogos.add(jogo2);
        usuario = new Usuario("aa","arthur");
        loja = new Loja(usuario,(ArrayList<Jogo>) jogos);
    }

    @Test
    void constroi(){
        assertEquals(usuario,loja.getDono());
        assertEquals(0,loja.contarJogosAvaliadosPor(usuario));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        jogo.adicionarAvaliacao(usuario.getApelido(),5);
        assertEquals(1,loja.contarJogosAvaliadosPor(usuario));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        jogo.adicionarAvaliacao(usuario.getApelido(),5);
        jogo1.adicionarAvaliacao(usuario.getApelido(),3);
        assertEquals(2,loja.contarJogosAvaliadosPor(usuario));
    }

    @Test
    void doisUsuariosAvaliamUmJogo(){
        Usuario outro = new Usuario("bb","outro");
        jogo.adicionarAvaliacao(usuario.getApelido(),5);
        jogo.adicionarAvaliacao(outro.getApelido(),4);
        assertEquals(1,loja.contarJogosAvaliadosPor(usuario));
        assertEquals(1,loja.contarJogosAvaliadosPor(outro));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos(){
        Usuario outro = new Usuario("bb","outro");
        jogo.adicionarAvaliacao(usuario.getApelido(),5);
        jogo1.adicionarAvaliacao(outro.getApelido(),4);
        assertEquals(1,loja.contarJogosAvaliadosPor(usuario));
        assertEquals(1,loja.contarJogosAvaliadosPor(outro));
    }
}