package com.example.pokedex;

//This class inherit from the PokemonCharacter to add a pokemon description.

public class PokemonCharacterSQL extends PokemonCharacter {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Constructor
    PokemonCharacterSQL(int id, String Nom, int taille, int poids, String description)
    {
        super(id,Nom,taille,poids); setDescription(description);
    }

    //Default Constructor
    PokemonCharacterSQL() {
        //Initialize default object
        this.id=1;
        this.nom="bulbasaur";
        this.taille=7;
        this.poids=69;
        this.description="Il a une étrange graine plantée sur son dos. Elle grandit avec lui depuis la naissance.";
    }

}
