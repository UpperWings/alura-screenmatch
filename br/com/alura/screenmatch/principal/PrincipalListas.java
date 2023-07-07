package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Divertimento no batelão", 2023);
        Filme filme2 = new Filme("Divertimento no batelão 2", 2023);
        Filme filme3 = new Filme("Divertimento no batelão 3", 2023);
        Serie serie1 = new Serie("Divertimento no batelão: Anos dourados", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (lista:
             ) {
            
        }
    }


}
