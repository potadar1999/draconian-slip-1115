package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Batch;
import com.masai.utility.DBUtil;


public class BatchDaoImp implements BatchDao {
	String message="Not Inserted";

	@Override
	public String BatchDetails(Batch batch) {
		// TODO Auto-generated method stub
		String message="Not Inserted";
		
		
			try(Connection conn= DBUtil.provideConnection()) {
				PreparedStatement ps=conn.prepareStatement("insert into batch values(?,?)");
				
				ps.setInt(1, batch.getBatch());
				ps.setInt(2, batch.getBid());
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message = " Batch was updated";
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				message=e.getMessage();
			
			}
			
		
		
		return message;
	 

	}

}
