package main;

import java.util.Scanner;


import com.masai.bean.Administrator;
import com.masai.bean.Student;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class AdminUses {
	
	public static void administarRun() {
		
		
		
		
		Scanner sc= new Scanner(System.in);
		AllMethodInterface all =new MethodImp();
		
		boolean status=true;
		
		
		while (status) {
			
			System.out.println("\n \n Choose Option only press Number.. \n");
			System.out.println("  1. Add a new Courses\r\n"
					+ "  2. Update Fees of course.\r\n"
					+ "  3. Delete  a course from any Training session.\r\n"
					+ "  4. Search information about a course.\r\n"
					+ "  5. Create Batch under a course.\r\n"
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
			
			else if(num==4) {
				System.out.println("Details of course");
				
				System.out.print("Enter course name or id : ");
				String name=sc.next();

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
			

			
			
			
			
			else {
				System.out.println("Thank You.");
				status=false;
			}
			
			
			
			
		}
		
	}

}
