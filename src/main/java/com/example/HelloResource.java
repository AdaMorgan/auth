package com.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.ws.rs.*;

@Path("/auth")
public class HelloResource extends HttpServlet {

    @POST
    @Consumes("text/json")
    public void value(String username, String password) {
        System.out.println("You entered your username: " + username + "and password: " + password);
    }
}