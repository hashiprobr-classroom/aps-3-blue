package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;

public class ComunidadeDeJogo extends Comunidade {
    private Jogo jogo;

    public ComunidadeDeJogo(ArrayList<Usuario> membros, Jogo jogo) {
        super(membros);
        this.jogo = jogo;
    }

    @Override
    public void adicionarMembro(Usuario usuario) {
        if (jogo.temAvaliacaoDe(usuario.getApelido())) {
            membros.add(usuario);
        }
    }
}