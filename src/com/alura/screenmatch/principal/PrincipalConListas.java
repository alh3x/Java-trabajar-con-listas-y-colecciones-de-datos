package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El seños de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        /* Al utiliza List para definir la lista nos permite trabajar de manera mas abstracta
           y poder utilizar otras clases que implementen List*/
        List<Titulo> lista = new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println(pelicula.getClasificacion());
            }

        }
        ArrayList<String> listaDeActores = new ArrayList<>();
        listaDeActores.add("Penelope Cruz");
        listaDeActores.add("Antonio Banderas");
        listaDeActores.add("Ricardo Darin");

        System.out.println(listaDeActores);

        Collections.sort(listaDeActores);
        System.out.println("Lista de actores Ordenada " + listaDeActores);

        Collections.sort(lista);
        System.out.println(lista);

        //funcion sort(Comparator) lambda
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("++++++++++");
        System.out.println("Lista ordenada por fecha de lanzamiento: "+ lista);


    }
}
