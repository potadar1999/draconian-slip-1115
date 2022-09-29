package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Administrator;

import com.masai.utility.DBUtil;

public class UpdateFeesImp implements UpadateFeesDao{

	@Override
	public String UpadateFees(Administrator administrator) {
		
		String message="Not Inserted";
		
	
			try(Connection conn= DBUtil.provideConnection()) {
				PreparedStatement ps=conn.prepareStatement("update administrator set fees=? where cname=?");
				
			
				ps.setInt(1, administrator.getFees());
				ps.setString(2, administrator.getCname());

				int x=ps.executeUpdate();
				
				
				if(x>0) {
					message="upadated Sucessfully!...";
				}
			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				message=e.getMessage();
			}
			
		return message;
	}

}
