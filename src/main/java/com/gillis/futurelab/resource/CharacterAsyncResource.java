package com.gillis.futurelab.resource;

import com.gillis.futurelab.model.CharacterReport;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

@Path("/async/character")
@Produces(MediaType.APPLICATION_JSON)
public class CharacterAsyncResource {

    @GET
    @Path("/report/{name}")
    public void getReportForNameAsync(@PathParam("name") String name, @Suspended AsyncResponse asyncResponse) {
        asyncResponse.resume(CharacterReport.builder().name(name).build());
    }

}
