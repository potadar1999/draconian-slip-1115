package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Administrator;
import com.masai.bean.Batch;
import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.utility.DBUtil;

public class MethodImp implements AllMethodInterface {

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

	

//====================================================================
	@Override
	public String UpadateFees(Administrator administrator) {
		// TODO Auto-generated method stub
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
//			e.printStackTrace();
			message=e.getMessage();
		}
		
	return message;
}
//	==================================================================
			

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
//					e.printStackTrace();
					message=e.getMessage();
				}
				return message;
			}
			
			
		
			//================================================
				@Override
				public List<Administrator> getCourseDetails() throws CourseException {
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

	//===========================================================
				

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



//				=============================================================
			
			
	
			
//	========================================================================
			
			

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
//					e.printStackTrace();
					message=e.getMessage();
				}
				
			return message;
				
			}
			
//==============================================================
			
			@Override
			public String BatchDetails(Batch batch) {
				// TODO Auto-generated method stub
				String message="Not Inserted";
				
				
					try(Connection conn= DBUtil.provideConnection()) {
						PreparedStatement ps=conn.prepareStatement("insert into batch values(?,?,?)");
						
						ps.setInt(1, batch.getBatch());
						ps.setInt(2, batch.getTotalSeat());
						ps.setInt(3, batch.getBid());
			
						
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

//''''''================================================================================================

			@Override
			public String UpadateSeats(Batch batch) {
				
				String message="Not Inserted";
				// TODO Auto-generated method stub
				
				try(Connection conn= DBUtil.provideConnection()) {
					PreparedStatement ps=conn.prepareStatement("update batch set totalSeat=? where bid=?");
					
					
					
					ps.setInt(1,batch.getTotalSeat() );
					ps.setInt(2, batch.getBid());

					int x=ps.executeUpdate();
					
					
					if(x>0) {
						message="upadated Seat Sucessfully!...";
					}
				
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					message=e.getMessage();
				}
				
			return message;
			}



			@Override
			public String DetailsStudent(Student student) {
				
					// TODO Auto-generated method stub
					String message = "Not Inserted..";
					
					
					try (Connection conn=DBUtil.provideConnection()){
						PreparedStatement ps=conn.prepareStatement("insert into student(name,marks,email,password) values(?,?,?,?)");
					
						

						ps.setString(1, student.getName());
						ps.setInt(2, student.getMarks());
						ps.setString(3, student.getEmail());
						ps.setString(4, student.getPassword());
				
						
						int x= ps.executeUpdate();
						
						
						if(x > 0)
							message = "Student Registered Sucessfully !";
						
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
						message = e.getMessage();
					}
						
						return message;
					}



//================================================================
			
				

			@Override
			public String AllocateStudent(StudentDTO studentDTO) throws StudentException, CourseException {
				// TODO Auto-generated method stub
				String message = "Not Inserted..";
				
				
				try (Connection conn=DBUtil.provideConnection()){
					PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
				
					ps.setInt(1, studentDTO.getRoll());
					ResultSet rs=ps.executeQuery();
					
					
					if(rs.next()) {
						PreparedStatement ps1=conn.prepareStatement("select * from administrator where cid ?");	
					
						
						ps1.setInt(1,studentDTO.getCid());
						ResultSet rs1=ps.executeQuery();
						
					

						if(rs1.next()) {
							PreparedStatement ps3=conn.prepareStatement("insert into studentDTO values(?,?)");	
							ps3.setInt(1,studentDTO.getCid());
							ps3.setInt(2,studentDTO.getRoll());
							
							int x=ps3.executeUpdate();
							if(x>0) {
								message="Student Registered inside the Course Sucessfully..";
								
							}
							else {
								throw new StudentException("Technical Error..");
							}
							 
						
						 
					}
					else {
						throw new CourseException("Invalid Course...");
					}
					
					
				}
				else {
					throw new StudentException("Invalid Student..");
				}
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					message = e.getMessage();
				}
					
					return message;
									
			
			}

//=========================================

			@Override
			public List<StudentDTO> DetailsBAtchStudent() throws StudentException, CourseException {
				// TODO Auto-generated method stub
				
				List<StudentDTO> studentDTOs= new ArrayList<>();
				String message = "Not Inserted..";
				
				
				try (Connection conn=DBUtil.provideConnection()){
					PreparedStatement ps=conn.prepareStatement("select s.roll,s.name,s.email,a.cname,a.fees,a.cid,b.bid from student s INNER JOIN administrator a INNER JOIN batch b INNER JOIN studentDTO sd ON s.roll=sd.csroll AND\r\n"
							+ "a.cid=b.bid ;");
				
					
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						
					
						int k=rs.getInt("roll");
						String l=rs.getString("name");
						String m=rs.getString("email");
						
						String o=rs.getString("cid");
						String n=rs.getString("cname");
						int j=rs.getInt("fees");
						int i=rs.getInt("bid");
					
					
						StudentDTO studentDTO=new StudentDTO(k,l,m,o,n,j,i);
						
						studentDTOs.add(studentDTO);
						
                         
						}
					
				      }catch (SQLException e) {
						// TODO Auto-generated catch block
						throw new CourseException(e.getMessage());
					}
					 
						
					return studentDTOs;
					
				
			
			}


//			@Override
//			public String DetailsBAtchStudent(StudentDTO studentDTO) {
//				
//				

//				================

	
}		

		
	

