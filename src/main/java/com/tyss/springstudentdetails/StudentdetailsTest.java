package com.tyss.springstudentdetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springtest.Student;

public class StudentdetailsTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student stud = (Student) context.getBean("student");
		System.out.println(stud.getId());
		System.out.println(stud.getName());
		System.out.println(stud.getBranch().getBranch_id());
		System.out.println(stud.getBranch().getBranch_name());
		((AbstractApplicationContext)context).close();
	}

}
