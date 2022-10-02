package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.bean.StudentDTO;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public class AllotamentStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

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
		
	


	}

}
