package com.example.pokedex;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class HTTPRequest {

    //Building the HTTP request with the id provided in arguments

    private CloseableHttpClient httpClient;
    private HttpGet request;

    HTTPRequest(int pokId){
            this.httpClient = HttpClientBuilder.create().build();
            this.request = new HttpGet("https://pokeapi.co/api/v2/pokemon/"+pokId);
            request.addHeader("content-type", "application/json");
    }

    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }

    public HttpGet getRequest() {
        return request;
    }
}
