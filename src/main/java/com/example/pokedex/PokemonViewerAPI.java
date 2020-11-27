package com.example.pokedex;

//Printing the Informations

public class PokemonViewerAPI implements IPokemonViewer {
    public static void printPokemon(PokemonCharacter myCharacter)
    {
        String id = myCharacter.getId() + "";
        String nom = myCharacter.getNom();
        String taille = myCharacter.getTaille() + "";
        String poids = myCharacter.getPoids()+ "";

        System.out.println("====================");
        System.out.println("Pokemon # " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Taille :  # " + taille);
        System.out.println("Poids : " + poids);
        System.out.println("====================");
    }

}
