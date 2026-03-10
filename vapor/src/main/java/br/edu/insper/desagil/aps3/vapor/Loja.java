package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;

public class Loja {
    private Usuario dono;
    private ArrayList<Jogo> jogos;

    public Loja(Usuario dono, ArrayList<Jogo> jogos) {
        this.dono = dono;
        this.jogos = jogos;
    }

    public Usuario getDono() {
        return dono;
    }

    public int contarJogosAvaliadosPor(Usuario usuario) {
        int quantidade = 0;

        for (Jogo jogo : jogos) {
            if (jogo.temAvaliacaoDe(usuario.getApelido())) {
                quantidade = quantidade + 1;
            }
        }

        return quantidade;
    }
}