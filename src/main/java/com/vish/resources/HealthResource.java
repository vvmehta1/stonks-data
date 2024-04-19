package com.vish.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/status")
public class HealthResource {

    @GET
    public Response get() {
        return Response.ok().entity("Service is Ok!").build();
    }
}
