package com.masai.Usecases;

import java.util.List;

import com.masai.bean.Administrator;
import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImp;
import com.masai.dao.getCourseDetailsDaoImp;
import com.masai.dao.getCourseDetilsDao;
import com.masai.exception.CourseException;

public class GetCourseDetailsUseCase {

	public static void main(String[] args) {
		
		getCourseDetilsDao dao=new getCourseDetailsDaoImp();
		
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
