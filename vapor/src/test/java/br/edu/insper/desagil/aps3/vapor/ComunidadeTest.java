package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private Comunidade comunidade;

    @Test
    void constroi(){
        ArrayList<Usuario> membros = new ArrayList<>();
        membros.add(new Usuario("guga","Gustavo"));
        comunidade = new Comunidade(membros);
        assertEquals(List.of("guga"),comunidade.getApelidos());
    }

    @Test
    void adicionaUmMembro(){
        ArrayList<Usuario> membros = new ArrayList<>();
        membros.add(new Usuario("guga","Gustavo"));
        comunidade = new Comunidade(membros);
        comunidade.adicionarMembro(new Usuario("aa","Arthur"));
        assertEquals(List.of("guga","aa"),comunidade.getApelidos());
    }

    @Test
    void adicionaDoisMembros(){
        ArrayList<Usuario> membros = new ArrayList<>();
        membros.add(new Usuario("guga","Gustavo"));
        comunidade = new Comunidade(membros);
        comunidade.adicionarMembro(new Usuario("aa","Arthur"));
        comunidade.adicionarMembro(new Usuario("bb","Bruno"));
        assertEquals(List.of("guga","aa","bb"),comunidade.getApelidos());
    }
}