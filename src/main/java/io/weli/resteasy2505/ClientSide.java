package io.weli.resteasy2505;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/*
 * Start server firstly:
 * $ mvn jetty:run
 */
public class ClientSide {
    public static void main(String[] args) {
        ResteasyClient client = (ResteasyClient) ClientBuilder.newClient();
        ResteasyWebTarget target = client.target("http://localhost:8080/foo");

        FooInterface foo = target.proxy(FooInterface.class);
        foo.empty();
        Response resp = foo.cool();
        System.out.println(resp.readEntity(String.class));

    }
}
