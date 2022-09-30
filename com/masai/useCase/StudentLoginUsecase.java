package com.masai.useCase;

import java.util.Scanner;
import com.masai.bean.Student;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.StudentException;

public class StudentLoginUsecase {

public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String name = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		AllMethodInterface dao =new MethodImp();
		
		
		
		try {
			Student student = dao.LoginStudent(name, password);
			 System.out.println("Welcome Student :"+student.getName());
			 
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
