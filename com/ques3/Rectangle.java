/*Wap to print the Rectangle 
 * @Author: Abhishek Raj
 * @date: 22 dec 2022
 */
package com.ques3;

//class started
class Rectangle {
	// Overloaded function to
	// calculate the area of the rectangle
	// It takes two double parameters
	void Area(double l, double b) {
		System.out.println("Area of the rectangle: " + l * b);
	}

	// Overloaded function to
	// calculate the area of the rectangle.
	// It takes two float parameters
	void Area(int l, int b) {
		System.out.println("Area of the rectangle: " + l * b);
	}
}