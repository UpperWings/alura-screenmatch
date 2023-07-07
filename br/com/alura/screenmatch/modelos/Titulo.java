package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvalialicacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoLancamento);
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalAvalialicacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacao / totalAvalialicacoes;
    }

}
