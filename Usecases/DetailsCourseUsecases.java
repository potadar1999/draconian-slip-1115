package com.masai.Usecases;

import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.dao.AdministratorDaoImp;
import com.masai.dao.AdministratorDao;

public class DetailsCourseUsecases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Couse ID");
		int cid=sc.nextInt();
		
		System.out.println("Enter Couse Name");
		String cname=sc.next();
		
		System.out.println("Enter Couse Fees");
		int fees =sc.nextInt();
	
		
		AdministratorDao dao=new AdministratorDaoImp();
		
		
		Administrator administrator=new Administrator();
		administrator.setCid(cid);
		administrator.setCname(cname);
		administrator.setFees(fees);
		
		
		
		String result = dao.DetailsCourse(administrator);
		
		System.out.println(result);
		
		
		
		

	}

}
