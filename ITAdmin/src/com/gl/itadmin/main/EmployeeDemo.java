package com.gl.itadmin.main;

import java.util.Scanner;

import com.gl.itadmin.beans.Employee;
import com.gl.itadmin.services.EmployeeServices;
import com.gl.itadmin.services.IEmployeeServices;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String company="ABC";
		
		IEmployeeServices service=new EmployeeServices();
		
		System.out.println("Please enter your First name");
		String firstName=sc.next();
		System.out.println("Please enter your Last name");
		String lastName=sc.next();
		Employee emp=new Employee(firstName,lastName);
		emp.setCompany(company);
		
		System.out.println("Please enter the department from the following - \n 1.Technical\n 2.Admin\n 3.Human Resource\n 4.Legal");
		int option=sc.nextInt();
		String dept = null;
		switch(option)
		{
		case 1:
			dept="technical";
			break;
		case 2:
			dept="admin";
			break;
		case 3:
			dept="human_resource";
			break;
		case 4:
			dept="legal";
			break;
		default:
			System.out.println("Please enter the correct option");
			break;
		}
		emp.setDepartment(dept);
		System.out.println("Dear "+firstName+" your credentials are as follows");
		emp.setEmail(service.generateEmail(emp));
		emp.setPassword(service.generatePassword());
		emp.showCredential();

	}

}
