/*
 * wap to print the student details using many to many relation
 * @author:Abhishek Raj
 * @date:19 Jan 2023
 */
package com.StudentDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Books;
import model.Student;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Student Stud1 = new Student();
		Stud1.setStud_id(101);
		Stud1.setStud_name("Abhishek");
		Stud1.setStud_rollno(1);
		Stud1.setStud_class(10);
		Stud1.setStud_addno("AF2020");

		Student Stud2 = new Student();
		Stud2.setStud_id(102);
		Stud2.setStud_name("Rahul");
		Stud2.setStud_rollno(2);
		Stud2.setStud_class(11);
		Stud2.setStud_addno("AF2021");
		s.save(Stud1);
		s.save(Stud2);

		Books B1 = new Books();
		B1.setBook_id(1001);
		B1.setBook_name("Java");
		B1.setBook_price((float) 129.09);

		Books B2 = new Books();
		B2.setBook_id(1002);
		B2.setBook_name(".Net");
		B2.setBook_price((float) 1234.09);
		s.save(B1);
		s.save(B2);
		tr.commit();
		s.close();
		System.out.println("Data saved sucessfully.");
	}
}
