package com.masai.Usecases;

import java.util.Scanner;
import com.masai.bean.Batch;
import com.masai.dao.BatchDao;
import com.masai.dao.BatchDaoImp;

public class BatchDetailsUsecase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
             Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Batch");
		int batch=sc.nextInt();
		
		System.out.println("Enter Couse Id");
		int bid=sc.nextInt();
		
		
		
		BatchDao dao=new BatchDaoImp();
		
		
		Batch batch1 =new Batch();
		batch1.setBatch(batch);
		batch1.setBid(bid);
		
		
		String result = dao.BatchDetails(batch1);
		
		System.out.println(result);

	}

}
