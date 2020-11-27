package com.example.pokedex;

//PokemonCharacter form a pokemon character

public class PokemonCharacter {

    protected int id;
    protected String nom;
    protected int taille;
    protected int poids;

    //Default Constructor
    PokemonCharacter() {
        //Initialize default object
        this.id=1;
        this.nom="bulbasaur";
        this.taille=7;
        this.poids=69;

    }

    //Constructor with input arguments
    PokemonCharacter(int id, String nom, int taille, int poids){
        setId(id); setNom(nom); setPoids(poids); setTaille(taille);
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) { this.nom = nom; }

    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
