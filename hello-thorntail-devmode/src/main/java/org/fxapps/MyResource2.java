package org.fxapps;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/2")
public class MyResource2 {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World Resource 2";
    }
}

