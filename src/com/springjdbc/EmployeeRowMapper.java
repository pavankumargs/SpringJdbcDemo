package com.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet res, int rowNumber) throws SQLException {
		Employee emp = new Employee();
		emp.setId(res.getInt(1));
		emp.setName(res.getString(2));
		emp.setSalary(res.getDouble(3));
		return emp;
	}

}
