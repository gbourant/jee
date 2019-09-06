package org.jee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("jee")
public class JeeResource {

    @GET
    public String getMessage() {
        return "Jee rocks!";
    }

}