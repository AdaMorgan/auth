package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/test")
public class TestConnect {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Connection established!";
    }
}
