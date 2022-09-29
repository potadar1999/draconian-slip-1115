package com.masai.Usecases;

import java.util.Scanner;
import com.masai.bean.Administrator;
import com.masai.dao.DeleteDao;
import com.masai.dao.DeleteDaoImp;

public class DeleteUsecase {
	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Couse Name");
			String cname =sc.next();
			

	         DeleteDao dao=new DeleteDaoImp();
			
			Administrator administrator=new Administrator();
			administrator.setCname(cname);
			
		
			String result = dao.DeleteDetails(administrator);

			
			System.out.println(result);

		
	}
 
}
