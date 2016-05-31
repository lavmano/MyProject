package com.agile;



import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.googlecode.objectify.util.DAOBase;

public class EmployeeDAO<T> extends DAOBase  {
	
	static
	{
	 ObjectifyService.register(Employee.class);
	}
	
	protected Class<T> employee;
	
	public EmployeeDAO(Class<T>employee)
	{
	  this.employee=employee;
	}
	
	public Class<T> getemployee()
	{
		return employee;
	}
	
	public void put(T entity)
	{
		ofy().put(entity);
	}
	
	public T getByProperty(String propertyName, String propertyValue)
	{
		Query <T> q=ofy().query(employee);
		q.filter(propertyName, propertyValue);
		return q.get();
	}
}
