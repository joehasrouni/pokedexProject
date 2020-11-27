package com.example.pokedex;

import junit.framework.TestCase;
import org.junit.Assert;

public class PokemonViewerSQLTest extends TestCase {
    public void testPrintPokemon() {
        //Testing if the print function print the correct information of the default character.
        PokemonCharacterSQL myCharacterTest = new PokemonCharacterSQL();
        Assert.assertEquals("1 bulbasaur 7 69",PokemonViewerSQL.printPokemon(myCharacterTest));
    }
}