package com.masai.useCase;

import java.util.List;

import com.masai.bean.Administrator;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.CourseException;

public class GetCourseDetailsUseCase {

	
public static void main(String[] args) {
		
	AllMethodInterface dao =new MethodImp();
	
	Administrator administrator=new Administrator();
		
		try {
			List<Administrator> administrators= dao.getCourseDetails();
			
			administrators.forEach(s ->{
				
				System.out.println("Course Id :"+s.getCid());
				System.out.println("Course Name: "+s.getCname());
				System.out.println("Course Fees: "+s.getFees());
				
				System.out.println("=======================");
			});
			
			
			
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
}
