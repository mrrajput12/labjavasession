package com.ques2.StudentM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
//		Student Stu1 = new Student();//create new row
//		Stu1.setStu_id(1);
//		Stu1.setStu_name("Abhishek");
//		Stu1.setStu_course("java");
//		Stu1.setStu_Admission(2020);
//
//		Student Stu2 = new Student();
//	    Stu2.setStu_id(2);
//   	Stu2.setStu_name("Rahul");
//	    Stu2.setStu_course(".net");
//	    Stu2.setStu_Admission(2021);
//
//		s.save(Stu1);//save a row
//	    s.save(Stu2);
//		tr.commit();
//		System.out.println("object saved");
//		System.out.println(s.get(Student.class, 1));//read the row
//		System.out.println(s.get(Student.class, 2));
		Student Stu = s.get(Student.class, 1);// delete the rows
		s.delete(Stu);
		tr.commit();

	}
}
