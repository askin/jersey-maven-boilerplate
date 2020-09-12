/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.askin.jersey.maven.boilerplate.ws.resource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author askin
 */

@Path("/functions/{functionName}")
public class FunctionsResource {
    @Context
    private UriInfo context;

    /** Creates a new instance of FunctionsResource */
    public FunctionsResource() {
    }

    /**
     * Retrieves representation of an instance of hermes.ws.email.FunctionsResource
     * @param functionName
     * @return an instance of javax.ws.rs.core.Response
     */
    @GET
    @Produces("application/json")
    public Response handleGet(@PathParam("functionName") String functionName)  {

        JSONObject rtObject = new JSONObject()
                .put("type", "test")
                .put("function_name", functionName);
        
        return Response.status(Response.Status.OK).entity(rtObject.toString()).build();
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response handlePost(@PathParam("functionName") String functionName, MultivaluedMap<String, String> formParams) {
        
        JSONObject rtObject = new JSONObject()
                .put("type", "test")
                .put("function_name", functionName);

        return Response.status(Response.Status.OK).entity(rtObject.toString()).build();
    }
}
