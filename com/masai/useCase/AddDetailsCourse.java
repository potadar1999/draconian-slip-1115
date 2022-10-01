package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class AddDetailsCourse {

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Couse ID");
		int cid=sc.nextInt();
		
		System.out.println("Enter Couse Name");
		String cname=sc.next();
		
		System.out.println("Enter Couse Fees");
		int fees =sc.nextInt();
	
		
		AllMethodInterface dao =new MethodImp();
		
		Administrator administrator=new Administrator();
		administrator.setCid(cid);
		administrator.setCname(cname);
		administrator.setFees(fees);
		
		
		
		String result = dao.DetailsCourse(administrator);
		
		System.out.println(result);
		
	}	
		
}
