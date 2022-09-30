package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class StudentDetailsUpadate {
	
	public static void main(String[] args) {
		
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll");
		int roll = sc.nextInt();
		
		System.out.println("Upadate Email");
		String email =sc.next();
		
		System.out.println("Upadate Password");
		String password =sc.next();
		
		AllMethodInterface dao=new MethodImp();
		 
	Student student=new Student();

	student.setRoll(roll);
	student.setEmail(email);
	student.setPassword(password);
	

	String result = dao.UpadateDeatails(student);

	
	System.out.println(result);
	}
}
