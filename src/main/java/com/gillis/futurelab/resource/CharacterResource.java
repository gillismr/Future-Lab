package com.gillis.futurelab.resource;

import com.gillis.futurelab.model.CharacterReport;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/character")
@Produces(MediaType.APPLICATION_JSON)
public class CharacterResource {

    @GET
    @Path("/report/{name}")
    public CharacterReport getReportForName(@PathParam("name") String name) {
        return CharacterReport.builder().name(name).build();
    }

}
