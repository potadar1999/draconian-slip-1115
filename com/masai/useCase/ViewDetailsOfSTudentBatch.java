package com.masai.useCase;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.bean.StudentDTO;
import com.masai.dao.AllMethodInterface;
import com.masai.dao.MethodImp;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public class ViewDetailsOfSTudentBatch {
	
	public static void main(String[] args) throws CourseException {

		AllMethodInterface dao=new MethodImp();

		try {
			List<StudentDTO> students = dao.DetailsBAtchStudent();

			students.forEach(s -> {

				System.out.println("Student Roll :" + s.getRoll());
				System.out.println("Student Name: " + s.getName());
				System.out.println("Student Email :" + s.getEmail());
				System.out.println("Student Course Name :" + s.getCname());
				System.out.println("Student Course Fees " + s.getFees());
				System.out.println("Student Batch Id: " + s.getBatch());

				System.out.println("=======================");
			});

		} catch (StudentException se) {
			System.out.println(se.getMessage());
		}


	}

}
