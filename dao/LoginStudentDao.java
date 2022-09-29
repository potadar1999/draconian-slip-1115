package com.masai.dao;


import com.masai.bean.Student;
import com.masai.exception.StudentException;

public interface LoginStudentDao {
	
	public Student LoginStudent(String username,String password)throws StudentException;

}
