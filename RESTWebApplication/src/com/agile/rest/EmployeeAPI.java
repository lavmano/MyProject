package com.agile.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.agile.EmployeeUtil;
@Path("/api/employee")
public class EmployeeAPI
{

	@Path("/save")
	@GET
	//@Consumes({MediaType.APPLICATION_XML})
	public void saveEmployee( @QueryParam("id") String id,@QueryParam("name") String ename ){
		EmployeeUtil.saveEmployee(id, ename);
		
	}
	
}
