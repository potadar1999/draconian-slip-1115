package com.masai.Usecases;

import java.awt.Choice;
import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImp;

public class Hrm {

	public static void selectOption() {
		// TODO Auto-generated method stub   
		
		System.out.println("\n Administrst");
		System.out.println("\n1. Add a new Courses.\n2. Update Fees of course.");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("Add Course");
			AdministratorDao Ad=new AdministratorDaoImp();
			Administrator administrator=new Administrator();
			System.out.println("Enter Couse ID");
			int cid=sc.nextInt();
			
			System.out.println("Enter Couse Name");
			String cname=sc.next();
			
			System.out.println("Enter Couse Fees");
			int fees =sc.nextInt();
			
			System.out.println("\nAdministrator Deatils: "+administrator.toString());
		
			break;
			
			
		
		}
		
			
			
		}
		
		
	}
	
	
	

}
