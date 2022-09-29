package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Student;
import com.masai.utility.DBUtil;

public class StudentDetailsUpadateImp implements StudentDetailsUpadateDao{

	

	@Override
	public String UpadateDeatails(Student student) {
		// TODO Auto-generated method stub
		String message="Not Inserted";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update student set email=?,password=? where roll=?");
			
		
			ps.setString(1, student.getEmail());
			ps.setString(2, student.getPassword());
			ps.setInt(3, student.getRoll());

			int x=ps.executeUpdate();
			
			
			if(x>0) {
				message="upadated Sucessfully!...";
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			message=e.getMessage();
		}
		
	return message;
		
	}

	
	}


