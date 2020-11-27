package com.example.pokedex;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPResponse {

    //Getting an instance of the HTTPRequest
    private HTTPRequest myRequest;

    //To save the Response in a Json String
    private String jsonResponse;

    //Constructor that takes an argument the request built in the HTTPRequest Class
    HTTPResponse(HTTPRequest myRequest)
    {
        setRequest(myRequest);
    }

    public void setRequest(HTTPRequest myRequest) {
        this.myRequest = myRequest;
    }

    public String getJsonResponse() {
        return jsonResponse;
    }

    // Receive the response and put it in the jsonResponse String
    public void recieveResponse() {
        try{
        HttpResponse result = myRequest.getHttpClient().execute(myRequest.getRequest());
        this.jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
