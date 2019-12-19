package com.a3.learnings.services;

import java.io.File;
import java.io.IOException;

import com.a3.learnings.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON_To_POJO {

	public static void main(String[] args) {
		
		
		ObjectMapper objMapper = new ObjectMapper();
		//read the JSOn file from the driver
		Student myStudent;
		try {
			
			try {
				
				myStudent = objMapper.readValue(new File("/Users/asinha/GIT/anubhawsinha13/Books/Get Comfortable With Spring/Chapter01-JSON_POJO/src/main/java/com/a3/learnings/model/Student.json"), Student.class);
				System.out.println(" Student object defined -->"+myStudent.getFirstName());
				System.out.println(" Address-- "+myStudent.getAddress().getStreet());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}catch(Exception e) {
		
	}

}
}
