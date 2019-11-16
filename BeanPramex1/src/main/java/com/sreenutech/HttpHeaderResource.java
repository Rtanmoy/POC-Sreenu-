package com.sreenutech;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/http-headers")
public class HttpHeaderResource {
  /*  @Context
    private HttpHeaders httpHeaders;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllHttpHeaders(){
        return Response.ok(httpHeaders.getRequestHeaders()).build();
    }*/
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getAllHttpHeaders(final @Context HttpHeaders httpHeaders){
	        return Response.ok(httpHeaders.getRequestHeaders()).build();
	    }
}