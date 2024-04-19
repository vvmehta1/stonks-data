package com.vish.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.net.http.HttpRequest;
import java.net.URI;

@Path("/companies")
public class CompaniesResource {

    @GET
    public Response getCompanies() {

        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://postman-echo.com/get"))
                    .GET()
                    .build();
        } catch (Exception e) {
            // log the error
        }


        return Response.ok().entity("AZON, MSFT").build();
    }
}
