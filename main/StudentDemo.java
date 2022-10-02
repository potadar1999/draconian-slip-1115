package main;

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

public class StudentDemo {
	
public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		AllMethodInterface all =new MethodImp();
		
		boolean status=true;
		System.out.println("  222.Student login.\r\n");
		
		while (status) {
			
			System.out.println("\n \n Choose Option only press Number.. \n");
			System.out.println(
					"  21. Update Details.\r\n"
					+ "  22. Avilable Courses.\r\n"		
					);
			
			System.out.println("=================================================== \n");
			int num=sc.nextInt();
			
		
			 if(num==222) {
				System.out.println("Student Login");
				
				
				System.out.println("Enter Username:");
				String name = sc.next();
				
				System.out.println("Enter Password:");
				String password = sc.next();
				
				
				AllMethodInterface dao =new MethodImp();
				
				
				
				try {
					Student student = dao.LoginStudent(name, password);
					 System.out.println("Welcome Student :"+student.getName());
					 
				} catch (StudentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				
				

			
		}
			 
			 else if(num==21) {
					System.out.println("Upadate Details");
					
				
					System.out.println("Enter Student Roll");
					int roll = sc.nextInt();
					
					System.out.println("Upadate Email");
					String email =sc.next();
					
					System.out.println("Upadate Password");
					String password =sc.next();
					
					AllMethodInterface dao=new MethodImp();
					 
				Student student=new Student();

				student.setRoll(roll);
				student.setEmail(email);
				student.setPassword(password);
				

				String result = dao.UpadateDeatails(student);

				
				System.out.println(result);
				}
			 
			 
			 else if(num==22) {
					System.out.println("avilable Couse");
					
					AllMethodInterface dao =new MethodImp();
					
//					Administrator administrator=new Administrator();
					
					StudentDTO studentDTO = new StudentDTO();
						
						try {
							List<StudentDTO> studentDTOs= dao.getCourseDetailsAndBatch();
							
							studentDTOs.forEach(s ->{
								
								System.out.println("Course Name: "+s.getCname());
								System.out.println("Student total seat: " + s.getBatch());
								System.out.println("Student fees: " + s.getFees());
								
								System.out.println("=======================");
							});
							
							
							
						} catch (CourseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println(e.getMessage());
						}

			 }
			 
				else {
					System.out.println("Thank You.");
					status=false;
				}
				
			 
			 
			 
					

				
			}
			
			
	}

	}

