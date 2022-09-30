package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class AddDetailsStudent {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String sname= sc.next();
		
		System.out.println("Enter Student marks:");
		int marks= sc.nextInt();
		
		System.out.println("Enter Student Email:");
		String email= sc.next();
		
		System.out.println("Enter Student password:");
		String password= sc.next();
		
		
		
		AllMethodInterface dao=new MethodImp();
		
		
		Student student= new Student();
		student.setName(sname);
		student.setMarks(marks);
		student.setEmail(email);
		student.setPassword(password);
		
		
		
		String result=dao.DetailsStudent(student);
		
		System.out.println(result);

   }

}
