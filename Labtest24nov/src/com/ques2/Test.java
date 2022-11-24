/*
 * wap to print  a test method
 * @author:abhishek raj
 * @date: 24 nov 2022
 */
package com.ques2;

//class started
public class Test {
//main started
	public static void main(String[] args) {
		// creating object of both class
		Parent P = new Parent();
		Children c = new Children();
		P.ShowDetails();
		// calling the method of objects
		c.ShowMethods();
		c.ShowDetails();
	}
	// end of main
}
//end of class