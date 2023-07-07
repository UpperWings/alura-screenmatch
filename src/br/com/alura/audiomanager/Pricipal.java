package br.com.alura.audiomanager;

import br.com.alura.audiomanager.modelos.Audio;
import br.com.alura.audiomanager.modelos.Musica;

public class Pricipal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Divertimento no batelão");
        musica.setDuracao(120);
        musica.setAlbum("inverno 2023");
        musica.setGenero("batelonesca");
        musica.setAutor("3º patetas");

        //1º usuario
        musica.reproduzir();
        musica.curtir();
        musica.classificar(5);
        //2º usuario
        musica.reproduzir();
        musica.curtir();
        musica.classificar(1);
        //3º usuario
        musica.reproduzir();
        musica.curtir();
        musica.classificar(5);
        //4º usuario
        musica.reproduzir();
        musica.curtir();
        musica.classificar(2);


        System.out.println(musica.toString());
        System.out.println("Titulo: " + musica.getTitulo() );
        System.out.println("Duração: " + musica.getDuracao());
        System.out.println("Total reprodução: " + musica.getTotalReproducoes() );
        System.out.println("Total curtidas: " + musica.getCurtidas() );
        System.out.println("Classificação: " + musica.pegarClassificacao() );
        System.out.println("Total de classificações: " + musica.getTotalClassificacoes() );


    }
}
