package com.sreenutech;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/postResource")
public class PostResource {
	
	@POST
    public void post(String userData) {
        System.out.println("POST: " + userData);
    }
	
	@POST
	@Path("{id}")
	public Response get(@PathParam("id") int id) {
		return Response.status(200).entity("Id: " + id).build();
	}
	
	@POST
	@Path("usingMatrixParam")
	public Response usingMatrixParam(
			@DefaultValue("0") @MatrixParam("id") String id,
			@DefaultValue("No Name") @MatrixParam("name") String name) {
		System.out.println("");
		return Response.status(200).entity("Id: " + id + ", Name: " + name)
				.build();
	}
/*
	@GET
	@Path("/subResources")
	public Response get(@PathParam("id")Integer id,@QueryParam("name")String name,
			@MatrixParam("age")Integer age,@HeaderParam("user-agent")String userAgent,
			@CookieParam("sessionid")int sessionid) {
		String str="Id==> "+id+" ==Name==> "+name+" ==Age==> "+age+" ==UserAgent==> "+userAgent+" ==SeessionId==>"+sessionid;
		return Response.status(200).entity(str).build();
		
	} */
	
	@GET
	@Path("/subResource")
	public Response usingQueryParam(
			@DefaultValue("0") @QueryParam("id") String id,
			@DefaultValue("No Name") @QueryParam("name") String name,
			@DefaultValue("0") @QueryParam("age") String age,
			@HeaderParam("user-agent") String userAgent) {
		return Response
				.status(200)
				.entity("Id: " + id + ", Name: " + name + ", Age: " + age
						+ ", User-Agent: " + userAgent).build();
	}
	
	@GET
	@Path("/getSessionId")
	public String getSessionId(@CookieParam("sessionid") int sessionId) {
		System.out.println("Session Id: " + sessionId);
		return 
				"Session Id: " + sessionId ;
	}
	
	@GET
	@Path("/getUserList")
	@Produces({ "application/xml" })
	public User[] getList() {
		User[] list = new User[3];
		list[0] = new User("sreenu");
		list[1] = new User("tech");
		list[2] = new User("java");

		return list;
	}


}
