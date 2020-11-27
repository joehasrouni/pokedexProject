package com.example.pokedex;

// Printing the informations
public class PokemonViewerSQL implements IPokemonViewer {
    public static String printPokemon(PokemonCharacterSQL myCharacter)
    {
        String id = myCharacter.getId() + "";
        String nom = myCharacter.getNom();
        String taille = myCharacter.getTaille() + "";
        String poids = myCharacter.getPoids()+ "";
        String description = myCharacter.getDescription() + "";

        String stringForTest = id + " " + nom + " " + taille + " " + poids;

        System.out.println("====================");
        System.out.println("Pokemon # " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Taille :  # " + taille);
        System.out.println("Poids : " + poids);
        System.out.println("Description : " + description);
        System.out.println("====================");

        return stringForTest;
    }
}
