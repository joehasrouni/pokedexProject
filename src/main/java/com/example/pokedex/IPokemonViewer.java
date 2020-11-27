package com.example.pokedex;

//This in an interface class for displaying the results
//It will be later implemented by two classes PokemonViewerSQL and PokemonViewerAPI.
//Those 2 classes will print the results depending on the user's choice of getting the information (ie API or Local DataBase)

public interface IPokemonViewer {
    public static void printPokemon(PokemonCharacter myPokemon){};
}
