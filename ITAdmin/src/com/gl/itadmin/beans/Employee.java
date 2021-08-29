package com.gl.itadmin.beans;

public class Employee {
	
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", department=" + department + "]";
	}

	private String firstName;
	private String lastName;
	private String email;
	private char[] password;
	private String department;
	private String company;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void showCredential()
	{
		System.out.println("Email --> "+this.email);
		System.out.println("Password --> "+this.password);
	}

}
