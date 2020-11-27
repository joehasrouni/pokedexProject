package com.example.pokedex;


import java.net.http.HttpClient;

public class Pokedex {

    public static void main(String[] args) {
        System.out.println("It's working !");

        //If the user only enters one argument. We call the PokemonViewerAPI class that also calls the PokemonControllerAPI
        if (args.length == 1) {
            System.out.println("Vous avez fourni l'argument " + args[0]);
            PokemonViewerAPI.printPokemon(PokemonControllerAPI.getPokemon(Integer.parseInt(args[0])));
        }

        //If the user enters two arguments. We call the PokemonViewerSQL class that also calls the PokemonControllerSQL;
        if (args.length == 2) {
            System.out.println("Vous avez fourni les argument " + args[0] + " et " + args[1]);
            PokemonViewerSQL.printPokemon(PokemonControllerSQL.getPokemon(Integer.parseInt(args[0]),args[1]));
        }
    }

    //TestingExample
    public String getName() {
        return "Hello";
    }
}
