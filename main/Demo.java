package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.bean.Adminlog;
import com.masai.bean.Batch;
import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.AdminException;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.utility.DBUtil;

public class Demo {
	public static void main(String[] args) throws CourseException {

		
		Scanner sc= new Scanner(System.in);
		AllMethodInterface all =new MethodImp();
		
		boolean status=true;
		System.out.println("\n \n =========:::: Automated Student Registration System :::======== \n");
		 System.out.println("111. Admin login\r\n"	);
		while (status) {
			
			
			System.out.println("\n \n Choose Option only press Number.. \n");
			System.out.println(
			           " 11. Add a new Courses\r\n"
					+ "  12. Add a student.\r\n"
							+ "  13. Update Fees of course.\r\n"
							+ "  14. Delete  a course from any Training session.\r\n"
							+ "  15. Search information about a course.\r\n"
							+ "  16. Create Batch under a course.\r\n"
							+ "  17. Allocate students in a Batch under a course.\r\n"
							+ "  18. Update total seats of a batch.\r\n"
							+ "  19. View the students of every batch.\r\n"
							
							);
			
		
			
			System.out.println("=================================================== \n");
			int num=sc.nextInt();
			
		
			if(num==111) {
				System.out.println("Admin Login. \n");
				
				System.out.println("Enter Username:");
				String name = sc.next();
				
				System.out.println("Enter Password:");
				String password = sc.next();
				
				
				AllMethodInterface dao =new MethodImp();
				
				
				
				try {
					Adminlog adminLogin=dao.AdminLogin(name, password);
//					
					 System.out.println("Welcome Admin :"+adminLogin.getEmail());
					 
				
				} catch (AdminException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				
				

			System.out.println("===========================================");
			}
			
			else if(num==11) {
				System.out.println("Add a new Courses. \n");
				
				System.out.println("Enter Couse ID");
				int cid=sc.nextInt();
				
				System.out.println("Enter Couse Name");
				String cname=sc.next();
				
				System.out.println("Enter Couse Fees");
				int fees =sc.nextInt();
			
		
				
				
				Administrator administrator=new Administrator();
				administrator.setCid(cid);
				administrator.setCname(cname);
				administrator.setFees(fees);
				
				String result = all.DetailsCourse(administrator);
				
				System.out.println(result);

			System.out.println("===========================================");
			}
			
			
			
			else if(num==12) {
				System.out.println("Add Student. \n");
				
				
				
			
				System.out.println("Enter Student Name:");
				String sname= sc.next();
				
				System.out.println("Enter Student marks:");
				int marks= sc.nextInt();
				
				System.out.println("Enter Student Email:");
				String email= sc.next();
				
				System.out.println("Enter Student password:");
				String password= sc.next();
				
				
				
				AllMethodInterface dao=new MethodImp();
				
				
				Student student= new Student();
				student.setName(sname);
				student.setMarks(marks);
				student.setEmail(email);
				student.setPassword(password);
				
				
				
				String result=dao.DetailsStudent(student);
				
				System.out.println(result);

				
				
			
						System.out.println("===========================================");
			}
		
			
			
			
			
			else if(num==13) {
				System.out.println("update fee course.");
				
				 
					System.out.println("Enter Couse Name");
					String cname =sc.next();
					
					System.out.println("Enter Couse Fees");
					int fees =sc.nextInt();
					
			       
					
			         Administrator update = new  Administrator();
					update.setCname(cname);
					update.setFees(fees);
					
				
					String result = all.UpadateFees(update);

					
					System.out.println(result);
				
				System.out.println("===========================================");
			}
			
			else if(num==14) {
				System.out.println("Delete  a course from any Training session");
				
				
					
					System.out.println("Enter Couse Name");
					String cname =sc.next();
					

					
					Administrator administrator=new Administrator();
					administrator.setCname(cname);
					
				
					String result = all.DeleteDetails(administrator);

					
					System.out.println(result);

				System.out.println("===========================================");
			}
			
			else if(num==15) {
				System.out.println("Search information about a course");
				
				AllMethodInterface dao=new MethodImp();

//				AllMethodInterface dao=new MethodImp();

				try {
					List<Administrator> administrators = dao.GetDetailsCourse();

					administrators.forEach(s -> {

		
						System.out.println("Course Name: " + s.getCname());
						System.out.println("Course Id :" + s.getCid());
						System.out.println("Course fees :" + s.getFees());
						
						

						System.out.println("==================================");
					});

				} catch (Exception se) {
					System.out.println(se.getMessage());
				}



				
				

				}
				
			
				
			else if(num==16) {
				System.out.println("Create Batch");
				
				System.out.println("Enter Batch");
				int batch=sc.nextInt();
				
				System.out.println("Enter SeatAvailbale");
				int totalSet=sc.nextInt();
				
				System.out.println("Enter Couse Id");
				int bid=sc.nextInt();
				
				
				AllMethodInterface dao=new MethodImp();
				
				
				Batch batch1 =new Batch();
				batch1.setBatch(batch);
				batch1.setTotalSeat(totalSet);
				
				
				batch1.setBid(bid);
				
			
				String result = dao.BatchDetails(batch1);
				
				System.out.println(result);

				System.out.println("===========================================");
			}
			
			
			else if(num==17) {
				System.out.println("Allocate students in a Batch under a course");
				

				System.out.println("Enter the cid");
				int cid = sc.nextInt();

				System.out.println("Enter the roll");
				int roll = sc.nextInt();

				AllMethodInterface dao=new MethodImp();

				StudentDTO studentDTO  =new StudentDTO();
				studentDTO.setCid(cid);
				studentDTO.setRoll(roll);
				
				
					
				
				
				String result;
				try {
					result = dao.AllocateStudent(studentDTO);
					System.out.println(result);
				} catch (StudentException | CourseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			

				System.out.println("===========================================");
			}

			else if(num==18) {
				System.out.println("Update total seats of a batch.");
				

				System.out.println("Enter Couse Id");
				int bid =sc.nextInt();
				
				System.out.println("Modify the seat");
				int seat =sc.nextInt();
				
				AllMethodInterface dao =new MethodImp();
				
		        Batch update = new  Batch();
				update.setBid(bid);;
				update.setTotalSeat(seat);;
				
			
				String result = dao.UpadateSeats(update);

				
				System.out.println(result);
				
			

				System.out.println("===========================================");
			}
			
			else if(num==19) {
				System.out.println("View the students of every batch.");
				
				

				AllMethodInterface dao=new MethodImp();

//				AllMethodInterface dao=new MethodImp();

				try {
					List<StudentDTO> students = dao.getCourseDetailsAndBatch();

					students.forEach(s -> {

		
						System.out.println("Student Name: " + s.getName());
						System.out.println("Student Email :" + s.getEmail());
						System.out.println("Student Course Name :" + s.getCname());
						
						

						System.out.println("==================================");
					});

				} catch (Exception se) {
					System.out.println(se.getMessage());
				}



			}
			
			
		 

				else {
					System.out.println("Thank You.");
					status=false;
				}
				
			 
			 
			 
					

				
			}
			
			
	}

	}
