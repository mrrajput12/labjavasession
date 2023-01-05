package com.ques2.StudentM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	private int Stu_id;
	private String Stu_name;
	private String Stu_course;
	private int Stu_Admission;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stu_id, String stu_name, String stu_course, int stu_Admission) {
		super();
		Stu_id = stu_id;
		Stu_name = stu_name;
		Stu_course = stu_course;
		Stu_Admission = stu_Admission;
	}

	public int getStu_id() {
		return Stu_id;
	}

	public void setStu_id(int stu_id) {
		Stu_id = stu_id;
	}

	public String getStu_name() {
		return Stu_name;
	}

	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}

	public String getStu_course() {
		return Stu_course;
	}

	public void setStu_course(String stu_course) {
		Stu_course = stu_course;
	}

	public int getStu_Admission() {
		return Stu_Admission;
	}

	public void setStu_Admission(int stu_Admission) {
		Stu_Admission = stu_Admission;
	}

	@Override
	public String toString() {
		return "Student [Stu_id=" + Stu_id + ", Stu_name=" + Stu_name + ", Stu_course=" + Stu_course
				+ ", Stu_Admission=" + Stu_Admission + "]";
	}

}