package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Administrator;
import com.masai.utility.DBUtil;

public class DeleteDaoImp implements DeleteDao{

	@Override
	public String DeleteDetails(Administrator administrator) {
		// TODO Auto-generated method stub
		
		String message="Not Inserted";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("delete from administrator where cname=?");
			
		
			ps.setString(1, administrator.getCname());

			int x=ps.executeUpdate();
			
			
			if(x>0) {
				message="Deleted Sucessfully!...";
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
		
	}

}
