package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.masai.bean.Administrator;
import com.masai.exception.CourseException;
import com.masai.utility.DBUtil;

public class getCourseDetailsDaoImp implements getCourseDetilsDao{

	@Override
	public List<Administrator> getCourseDetails() throws CourseException{
		// TODO Auto-generated method stub
		
		
		List<Administrator> administrators= new ArrayList<>();
		
		
		 try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from administrator");
			
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				
				int i=rs.getInt("cid");
				String n=rs.getString("cname");
				int f=rs.getInt("fees");
				
				
				Administrator administrator=new Administrator(i,n,f);
				
				administrators.add(administrator);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CourseException(e.getMessage());
		}
		 
		
		return administrators;
	}

	

}
