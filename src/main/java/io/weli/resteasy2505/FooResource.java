package io.weli.resteasy2505;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/foo")
public class FooResource {
   @GET
   public String get() {
      return "Hello, foo!";
   }
}
