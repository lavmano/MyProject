package com.agile;

/**
 * 
 * @author agile28
 *
 */
public class EmployeeUtil {
	
	public static EmployeeDAO<Employee> dao=new EmployeeDAO<Employee>(Employee.class);
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public static boolean saveEmployee(String id, String name){
		
		Employee employee=new Employee();
		employee.setEmployee_id(id);
		employee.setEmployee_name(name);
		
		
		dao.put(employee);
		
		
		return true;
	}
}
