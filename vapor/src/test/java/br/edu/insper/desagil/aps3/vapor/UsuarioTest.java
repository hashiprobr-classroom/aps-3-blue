package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario usuario;
    @Test
    void constroi(){
        usuario = new Usuario("Guga","Gustavo");
        assertEquals("Guga",usuario.getApelido());
        assertEquals("Gustavo",usuario.getNome());
    }
    @Test
    void mudaNome(){
        usuario = new Usuario("Guga","Gustavo");
        usuario.setNome("Gustavoo");
        assertEquals("Gustavoo",usuario.getNome());
    }
}
