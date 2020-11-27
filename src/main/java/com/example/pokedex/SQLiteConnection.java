package com.example.pokedex;

import org.sqlite.SQLiteConfig;

import java.sql.*;

public class SQLiteConnection {

    //Putting the established connection in a Connection instance so we can use it elsewhere in our code.
    private static Connection sqlConnection;
    public static Connection getSqlConnection() {
        return sqlConnection;
    }


    //Establishing a connection with the database.

    public static void connect(String dbName)
    {
        sqlConnection = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:"+dbName;
            SQLiteConfig config = new SQLiteConfig();
            config.setEncoding(SQLiteConfig.Encoding.UTF8);

            // create a connection to the database
            sqlConnection = DriverManager.getConnection(url,config.toProperties());
            System.out.println("Connection to SQLite has been established.");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
