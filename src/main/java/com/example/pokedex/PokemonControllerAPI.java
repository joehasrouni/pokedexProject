package com.example.pokedex;

//Controller of the API

public class PokemonControllerAPI implements IPokemonController{
    public static PokemonCharacter getPokemon(int pokid)
    {
        HTTPRequest myRequest= new HTTPRequest(pokid);                      //Calling the HTTPRequest class to build a URL from the pokemon id entered.
        HTTPResponse myResponse = new HTTPResponse(myRequest);
        myResponse.recieveResponse();                                       //Calling the HTTPResponse class and getting the Json file
        ParseJson myJson = new ParseJson(myResponse.getJsonResponse());
        myJson.parseJson();                                                 //Parsing the Json file and forming an instance of the PokemonCharacter class

        return myJson.getMyCharacter();                                     //Returning the pokemon object for the viewer class
    }
}
