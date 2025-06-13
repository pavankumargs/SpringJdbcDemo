package com.springjdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

//		Inserting New Employee
//		int update = jdbcTemplate.update("INSERT INTO EMPLOYEE(ID,NAME,SALARY)VALUES(3,'pavan',27000)");
//		System.out.println(update+ " row updated");

//		updating existing employee
//		int number = jdbcTemplate.update("update employee set name='Raju' where id = 2");
//		System.out.println(number+" record updated");

//		delete record 
//		int number = jdbcTemplate.update("delete from employee where id = 3");
//		System.out.println(number+" records deleted");

//		Getting Employee By ID
//		Employee employee = jdbcTemplate.queryForObject("select * from employee where id = 2", new EmployeeRowMapper());
//		System.out.println(employee.toString());

//		Fetching All The Employees
//		List<Employee> employees = jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
//		System.out.println(employees.toString());

//		for(Employee emp : employees) {
//			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
//		}

//		Insert A New Record By Using Prepared Statement
//		Object[] inputData = {4,"Mahesh",55000};
//		int nos = jdbcTemplate.update("insert into employee values(?,?,?)", inputData);
//		System.out.println(nos+" records saved successfully");

//		Updating An Existing Employee By Using PreparedStatement
//		int id = 4;
//		int nos = jdbcTemplate.update("update employee set salary = 56000 where id = ?", id);
//		System.out.println(nos+" rows updated");

//		Delete A Employee By Using Prepared Statement
//		int id = 3;
//		int nos = jdbcTemplate.update("delete from employee where id = ?", id);
//		System.out.println(nos+" records updated");

//		Getting An Employee By ID
		int id = 4;
		Employee emp = jdbcTemplate.queryForObject("select * from employee where id = ?", new EmployeeRowMapper(),id);
		System.out.println(emp);

	}
}
