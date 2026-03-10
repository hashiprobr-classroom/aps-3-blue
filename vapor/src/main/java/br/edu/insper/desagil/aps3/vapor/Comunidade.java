package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;

public class Comunidade {
    protected ArrayList<Usuario> membros;

    public Comunidade(ArrayList<Usuario> membros) {
        this.membros = membros;
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    public ArrayList<String> getApelidos() {
        ArrayList<String> apelidos = new ArrayList<String>();

        for (Usuario usuario : membros) {
            apelidos.add(usuario.getApelido());
        }

        return apelidos;
    }
}