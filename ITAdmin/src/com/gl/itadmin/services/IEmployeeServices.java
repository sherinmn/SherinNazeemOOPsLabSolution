package com.gl.itadmin.services;

import com.gl.itadmin.beans.Employee;

public interface IEmployeeServices {
	
	public String generateEmail(Employee employee);
	public char[] generatePassword();
	//public Employee showCredentials(Employee emp);

}
