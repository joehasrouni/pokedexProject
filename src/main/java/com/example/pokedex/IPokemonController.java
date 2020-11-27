package com.example.pokedex;

// This is an interface that controls all the functionalities needed.
// It will be later implemented by two class PokemonControllerAPI and PokemonControllerSQL.
// These 2 classes takes the responsibility of calling the HTTPRequest, HTTPResponse, JsonParser, SQLiteConnection, SQLGetData classes.

public interface IPokemonController{
    public static void getPokemon(int pokid) {};
}
