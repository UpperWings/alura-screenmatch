package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Divertimento no batelão", 2023);
        filme1.setDuracaoMinutos(150);
        filme1.avalia(5);

        Serie serie1 = new Serie("Divertimento no batelão 3", 2023);
        serie1.setDuracaoMinutos(150);
        serie1.avalia(5);


        filme1.exibeFichaTecnica();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Filme filme2 = new Filme("Divertimento no batelão 2", 2023);
        filme2.setDuracaoMinutos(150);
        filme2.avalia(5);

        Filme filme3 = new Filme("Divertimento no batelão 3", 2023);
        filme3.setDuracaoMinutos(150);
        filme3.avalia(5);

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        System.out.println("Quantidade de filmes " + filmes.size());
        System.out.println("Primeiro filme da lista " + filmes.get(0).getNome());
        System.out.println(filmes);
        System.out.println("to string " + filmes.get(0).toString());

    }
}