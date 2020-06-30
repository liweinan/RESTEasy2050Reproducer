package io.weli.resteasy2505;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("/foo")
public class FooResource implements FooInterface {
    @GET
    @Path("/dummy")
    public String dummy() {
        throw new WebApplicationException("-=-=-=-dummy-=-=-=-");
    }

    @GET
    public String get() {
        return "Hello, foo!";
    }

    /*
     * $ http POST localhost:8080/foo/empty
     */
    @Deprecated
    public Response empty() {
        return Response.serverError().entity(null).build();
    }


    /*
     * $ http POST localhost:8080/foo/cool
     */
    public Response cool() {
        return Response.serverError().entity("COOL").build();
    }

    @Override
    /*
     * $ http POST localhost:8080/foo/v0id
     * Reproducer: Because the return type is `void`, so we can't get `v0id` encapsulated in `WebApplicationException`.
     */
    public void v0id() {
        // directly throw exception.
        throw new WebApplicationException("v0id");
    }

    @Override
    /*
     * $ http POST localhost:8080/foo/v0id2
     *
     */
    public Response v0id2() {
        // directly throw exception.
        throw new WebApplicationException("v0id2");
    }

}
