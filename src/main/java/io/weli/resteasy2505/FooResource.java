package io.weli.resteasy2505;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("/foo")
public class FooResource {
    @GET
    @Path("/dummy")
    public String dummy() {
        throw new WebApplicationException("-=-=-=-dummy-=-=-=-");
    }

    @GET
    public String get() {
        return "Hello, foo!";
    }

    @POST
    @Path("boom")
    public Response boom() {
        return Response.serverError().entity(null).build();
    }

    @POST
    @Path("cool")
    public Response cool() {
        return Response.serverError().entity("COOL").build();
    }



}
