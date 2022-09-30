package com.masai.useCase;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.CourseException;

public class DeleteUsecase {
	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Couse Name");
			String cname =sc.next();
			

			AllMethodInterface dao =new MethodImp();
	         
			
			Administrator administrator=new Administrator();
			administrator.setCname(cname);
			
		
			String result = dao.DeleteDetails(administrator);

			
			System.out.println(result);

		
	}

}
