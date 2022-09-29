package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Student;
import com.masai.exception.StudentException;
import com.masai.utility.DBUtil;

public class LoginStudentDaoImp implements LoginStudentDao{


	@Override
	public Student LoginStudent(String username, String password) throws StudentException {
		// TODO Auto-generated method stub
	
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from student where email = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				int m= rs.getInt("marks");
				String e= rs.getString("email");
				String p= rs.getString("password");
				
				
			student=new Student(r, n, m, e, p);	
				
				
			}else
				throw new StudentException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		return student;
	
		
	}

}
