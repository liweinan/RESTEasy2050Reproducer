package io.weli.resteasy2505;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public interface FooInterface {
    /*
     * $ http POST localhost:8080/foo/boom
     */
    @POST
    @Path("empty")
    Response empty();


    /*
     * $ http POST localhost:8080/foo/cool
     */
    @POST
    @Path("cool")
    Response cool();

}
