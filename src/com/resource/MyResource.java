package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class MyResource {
	
	@Path("/sayHello")
	@GET
	// @Produces("text/plain")
	public String sayHello(){
		return "Hello Web Services";
	}

}
