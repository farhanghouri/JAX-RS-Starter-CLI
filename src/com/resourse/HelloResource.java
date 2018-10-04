package com.resourse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {


    @GET
	@Path("/hello/{msg}")
    @Produces("text/plain")
	public String sayHello(@PathParam(value="msg") String msg){
		return "Hello "+msg;
	}
    
    @GET
    @Produces("text/plain")
	public String sayIt(){
		return "Hello";
	}
}
