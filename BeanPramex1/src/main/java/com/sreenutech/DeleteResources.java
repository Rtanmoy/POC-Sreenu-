package com.sreenutech;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("/deleteResource")
public class DeleteResources {
	@DELETE
	public String doDelete(@QueryParam("id")Integer id) {
		return "Delete"+id;
	}

}
