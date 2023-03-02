package com.log4j.student;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j {

	static Date d=new Date();
	
	
	private static final Logger l = LogManager.getLogger(Student.class);

	public static void main(String[] args) throws InterruptedException {

		Student s = new Student();
		s.setRoll(10);
		s.setName("abc");

//		System.out.println(s);
		l.info("this is info level" + (" at date is "+d));
		
		l.info("Student  is : {}", s);
		
		System.out.println("end");
		
		
	}
}
