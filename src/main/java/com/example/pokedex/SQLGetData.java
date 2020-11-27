package com.example.pokedex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class SQLGetData {
    private PokemonCharacterSQL mySQLCharacter;
    private static SQLiteConnection sqlConnection;

    public PokemonCharacterSQL getMySQLCharacter() {
        return mySQLCharacter;
    }

    SQLGetData()
    {
        mySQLCharacter = new PokemonCharacterSQL();
        sqlConnection = new SQLiteConnection(); //Getting a connection to the desired database by calling the SQLLiteConnection class.

    }

    public void getDataFromSQL(int pokId, String dbName)
    {
        try {
        sqlConnection.connect(dbName);
        PreparedStatement stmt  = sqlConnection.getSqlConnection().prepareStatement("SELECT * FROM pokemons WHERE id = ?");  // Forming the query
        stmt.setInt(1, pokId);
        ResultSet rs    = stmt.executeQuery();                                                                                  //Executing the query
        rs.next();                                                                                                              //Putting data in a result set
        mySQLCharacter.setId(pokId);
        mySQLCharacter.setNom(rs.getString("name"));
        mySQLCharacter.setTaille(Integer.parseInt(rs.getString("height")));
        mySQLCharacter.setPoids(Integer.parseInt(rs.getString("weight")));
        mySQLCharacter.setDescription(rs.getString("description"));                                                 //Forming the character

    } catch (
    SQLException e) {
        System.out.println(e.getMessage());
    }
    }

}
