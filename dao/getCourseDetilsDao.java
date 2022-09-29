package com.masai.dao;

import java.util.List;

import com.masai.bean.Administrator;
import com.masai.exception.CourseException;

public interface getCourseDetilsDao {
	
	public List<Administrator> getCourseDetails() throws CourseException;

}
