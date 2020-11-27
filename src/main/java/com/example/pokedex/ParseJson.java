package com.example.pokedex;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//This is a class that parse the Json file and fills an instance of the PokemonCharacter with the correct data

public class ParseJson {

    //Setting the Json string
    private String jsonResponse;
    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }

    //Instance of the class PokemonCharacter
    private PokemonCharacter myCharacter;
    public PokemonCharacter getMyCharacter() {
        return myCharacter;
    }

    //Constructor
    ParseJson(String jsonResponse)
    {
        myCharacter = new PokemonCharacterSQL();
        setJsonResponse(jsonResponse);
    }



    //Parsing the string after verifying that it is a json.
    public void parseJson() {
        try {
            JSONParser parser = new JSONParser();
            Object resultObject = parser.parse(this.jsonResponse);
            if (resultObject instanceof JSONObject) {
                JSONObject obj = (JSONObject) resultObject;

                myCharacter.setId(Math.toIntExact((Long)obj.get("id")));
                myCharacter.setNom(obj.get("name").toString());
                myCharacter.setPoids(Math.toIntExact((Long)obj.get("weight")));
                myCharacter.setTaille(Math.toIntExact((Long)obj.get("height")));

            } else {
                System.err.println("Error, we expected a JSON Object from the API");
            }


        } catch (ParseException e) {
            System.err.println("Could not parse the response given by the API as JSON");
            System.err.println("Response body is :");
            System.err.println(jsonResponse);
            e.printStackTrace();
        }
    }
}
