package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;

public class SeatUpadate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
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
		

	}

}
