package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Administrator;
import com.masai.utility.DBUtil;
import com.mysql.cj.protocol.Message;

public class AdministratorDaoImp implements AdministratorDao{

	@Override
	public String DetailsCourse(Administrator administrator) {
		// TODO Auto-generated method stub

			String message="Not Inserted";
			
			try(Connection conn= DBUtil.provideConnection()) {
				PreparedStatement ps=conn.prepareStatement("insert into administrator values(?,?,?)");
				
				ps.setInt(1, administrator.getCid());
				ps.setString(2, administrator.getCname());
				ps.setInt(3, administrator.getFees());
			
				
				int x=ps.executeUpdate();
				
				
				if(x>0) {
					message="Details are upadated Sucessfully!...";
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				message=e.getMessage();
			}
			return message;
		


	
	}

	
}
