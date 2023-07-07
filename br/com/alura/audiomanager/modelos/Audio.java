package br.com.alura.audiomanager.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private int totalClassificacoes;

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void classificar(int classificacao){
        this.classificacao += classificacao;
        totalClassificacoes++;
    }

    public int pegarClassificacao(){
        return classificacao / totalClassificacoes;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalClassificacoes() {
        return totalClassificacoes;
    }

    public String toString() {
        return "Audio{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", totalReproducoes=" + totalReproducoes +
                ", curtidas=" + curtidas +
                ", classificacao=" + classificacao +
                ", totalClassificacoes=" + totalClassificacoes +
                '}';
    }
}
