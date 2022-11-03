/*
 * wap to print the hoteltest deatils 
 * @author:Abhishek Raj
 * @date:3 Nov 2022
 */
package com.ques2;

//declaring a class
public class HotelRoomTest {
	// main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tight coupling
		HotelRoom HR1 = new HotelRoom(101, "Normal", 2000f, 2D);
		HotelRoom HR2 = new HotelRoom(102, "Premium", 3000f, 3D);
		HotelRoom HR3 = new HotelRoom(103, "Delux", 5000f, 4D);
		HotelRoom HR4 = new HotelRoom(104, "Double Delux", 8000f);
//printing the values
		System.out.println(HR1.toString());
		System.out.println(HR2);
		System.out.println(HR3);
		System.out.println(HR4);

	}
//end of main
}
//end of class
