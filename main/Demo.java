package main;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.bean.Batch;
import com.masai.bean.StudentDTO;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public class Demo {
	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		AllMethodInterface all =new MethodImp();
		
		boolean status=true;
		
		
		while (status) {
			
			System.out.println("\n \n Choose Option only press Number.. \n");
			System.out.println("  1. Add a new Courses\r\n"
					+ "  2. Update Fees of course.\r\n"
					+ "  3. Delete  a course from any Training session.\r\n"
					+ "  4. Details of course.\r\n"
					+ "  5. Create Batch under a course.\r\n"
					+ "  6. Allocate students in a Batch under a course.\r\n"
					+ "  7. Update total seats of a batch.\r\n"
					+ "  8. View the students of every batch.\r\n"
					
					);
			System.out.println("=================================================== \n");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.println("Details of course. \n");
				
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
			
			
			else if(num==2) {
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
			
			else if(num==3) {
				System.out.println("Delete  a course from any Training session");
				
				
					
					System.out.println("Enter Couse Name");
					String cname =sc.next();
					

					
					Administrator administrator=new Administrator();
					administrator.setCname(cname);
					
				
					String result = all.DeleteDetails(administrator);

					
					System.out.println(result);

				System.out.println("===========================================");
			}
			
//			else if(num==4) {
//				System.out.println("Details of course");
//				Administrator administrator=new Administrator();
//				
//				try {
////					List<Administrator> administrators= dao.getCourseDetails();
//					Administrator administrator1=new Administrator();
//					
//					administrators.forEach(s ->{
//						
//						System.out.println("Course Id :"+s.getCid());
//						System.out.println("Course Name: "+s.getCname());
//						System.out.println("Course Fees: "+s.getFees());
//						
//						System.out.println("=========================");
//					});
//					
//					
//					
//				} catch (CourseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					System.out.println(e.getMessage());
//				}
//				System.out.println("===========================================");
//			}
			
			else if(num==5) {
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
			
			
			else if(num==6) {
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

			else if(num==7) {
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
			
//			else if(num==8) {
//				System.out.println("Update total seats of a batch.");
//				
//					StudentDTO.forEach(s -> {
//
//						System.out.println("Student Roll :" + s.getRoll());
//						System.out.println("Student Name: " + s.getName());
//						System.out.println("Student Email :" + s.getEmail());
//						System.out.println("Student Course Name :" + s.getCname());
//						System.out.println("Student Course Fees " + s.getFees());
//						System.out.println("Student Batch Id: " + s.getBatch());
//
//						System.out.println("=======================");
//					});
//
//
//			
//			}
			
			
			else {
				System.out.println("Thank You.");
				status=false;
			}
			
			
			
	}

	}}
