/*
 * wap to print a test class
 * @author:abhishek raj
 * @date: 24 nov 2022
 */

package com.ques3;

//clas started
public class Test {
//declearing main
	public static void main(String[] args) {
		// Making object of Employee Class
		Employee e = new Employee();
		// giving the details
		e.name = "Abhishek Raj";
		e.age = 25;
		e.num = "775084327";
		e.adress = "Ranchi";
		e.salary = 50000;
		// Making object of Manager Class
		Manager m = new Manager();
		//// giving details
		m.name = "Rahul Kumar";
		m.age = 35;
		m.num = "786757489";
		m.adress = "Mumbai";
		m.salary = 100000;
		// Printing the details
		System.out.println("------------Employee Details--------------");
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.num);
		System.out.println("Adress: " + e.adress);
		System.out.println("Salary: " + e.salary);
		System.out.println("------------Manager Details--------------");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Phone Number: " + m.num);
		System.out.println("Adress: " + m.adress);
		System.out.println("Salary: " + m.salary);

	}
	// end of main
}
//end of class