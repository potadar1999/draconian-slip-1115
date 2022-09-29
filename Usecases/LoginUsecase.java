package com.masai.Usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.LoginStudentDao;
import com.masai.dao.LoginStudentDaoImp;
import com.masai.exception.StudentException;

public class LoginUsecase {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String name = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		LoginStudentDao dao=new LoginStudentDaoImp();
		
		try {
			Student student= dao.LoginStudent(name, password);
			 System.out.println("Welcome Student :"+student.getName());
			 
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
