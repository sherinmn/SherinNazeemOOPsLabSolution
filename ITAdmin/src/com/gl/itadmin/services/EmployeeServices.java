package com.gl.itadmin.services;

import java.util.Random;

import com.gl.itadmin.beans.Employee;

public class EmployeeServices implements IEmployeeServices {
	
	public String generateEmail(Employee employee)
	{
		String email=employee.getFirstName()+employee.getLastName()+'.'+employee.getDepartment()+'@'+employee.getCompany()+".com";
		return email;
	}

	@Override
	public char[] generatePassword() {
		// TODO Auto-generated method stub
		
		int length = 10;
        String symbol = "-/.^&*_!@%=+>)"; 
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String small_letter = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 


        String finalString = cap_letter + small_letter + 
                numbers + symbol; 

        Random random = new Random(); 

        char[] password = new char[length]; 

        for (int i = 0; i < length; i++) 
        { 
            password[i] = 
                    finalString.charAt(random.nextInt(finalString.length())); 

        } 
		return password;
	}


}
