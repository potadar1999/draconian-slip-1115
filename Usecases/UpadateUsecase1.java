package com.masai.Usecases;

import java.util.Scanner;
import com.masai.bean.Administrator;
import com.masai.dao.UpadateFeesDao;
import com.masai.dao.UpdateFeesImp;

public class UpadateUsecase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Couse Name");
		String cname =sc.next();
		
		System.out.println("Enter Couse Fees");
		int fees =sc.nextInt();
		
         UpadateFeesDao dao=new UpdateFeesImp();
		
         Administrator update = new  Administrator();
		update.setCname(cname);
		update.setFees(fees);
		
	
		String result = dao.UpadateFees(update);

		
		System.out.println(result);
		

	}

}
