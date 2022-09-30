package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class EntrytotalSeatBatchDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
             Scanner sc=new Scanner(System.in);
		
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

	}

}
