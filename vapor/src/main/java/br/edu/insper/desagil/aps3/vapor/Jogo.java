import java.util.HashMap;

public class Jogo {
    private int identificador;
    private String nome;
    private HashMap<String, Integer> avaliacoes;

    public Jogo(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
        this.avaliacoes = new HashMap<String, Integer>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAvaliacao(String apelido, int avaliacao) {
        avaliacoes.put(apelido, avaliacao);
    }

    public boolean temAvaliacaoDe(String apelido) {
        return avaliacoes.containsKey(apelido);
    }

    public double getMediaAvaliacoes() {
        if (avaliacoes.size() == 0) {
            return 0;
        }

        int soma = 0;

        for (int avaliacao : avaliacoes.values()) {
            soma = soma + avaliacao;
        }

        return (double) soma / avaliacoes.size();
    }
}