package com.example.pokedex;

public class PokemonControllerSQL implements IPokemonController{
    public static PokemonCharacterSQL getPokemon(int pokid, String dbName)
    {
        SQLGetData sqlData = new SQLGetData();
        sqlData.getDataFromSQL(pokid,dbName);     //Getting Data from SQL and forming a Pokemon instance.

        return sqlData.getMySQLCharacter();       //Returning the Character to the viewer class.

    }
}
