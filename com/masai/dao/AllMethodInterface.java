package com.masai.dao;

import java.util.List;

import com.masai.bean.Administrator;
import com.masai.bean.Adminlog;
import com.masai.bean.Batch;
import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exception.AdminException;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public interface AllMethodInterface {

	
	public Adminlog AdminLogin(String username, String password) throws AdminException;
	
	public String DetailsCourse(Administrator administrator);
	
	public String UpadateFees(Administrator administrator);
	
	public String DeleteDetails(Administrator administrator);
	
	public List<Administrator> GetDetailsCourse() throws CourseException;
	
	
	
	public String AllocateStudent(StudentDTO studentDTO) throws StudentException, CourseException;

//	========================================================================
	
	

	public Student LoginStudent(String username,String password)throws StudentException;
	
	public String DetailsStudent(Student student);
	
	public String UpadateDeatails(Student student);
	
	public List<StudentDTO>getCourseDetailsAndBatch() throws CourseException;
	
//	//==================================================================
	
	public String BatchDetails (Batch batch);
	
	public String UpadateSeats(Batch batch);

	
	
//	==================================================================
	
	
	
//	===================================================================
	
	
	
	
	
//	============================================================
	


	

}
