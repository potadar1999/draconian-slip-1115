package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Adminlog;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.AdminException;


public class AdminLogin {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String name = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		AllMethodInterface dao =new MethodImp();
		
		
		
		try {
			Adminlog adminLogin=dao.AdminLogin(name, password);
//			
			 System.out.println("Welcome Admin :"+adminLogin.getEmail());
			 
		
		} catch (AdminException e) {
			// TODO Auto-generated catch block

			System.out.println(e.getMessage());
		}
		
		
		
	}

}
