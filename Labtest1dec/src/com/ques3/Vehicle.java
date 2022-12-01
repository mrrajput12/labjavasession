/*wap to print the Vehicles Information
 * @author:Abhishek raj
 * @date :1st dec 2022
 */
package com.ques3;

//declaring a class
public class Vehicle extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		Thread D = new Thread();
		Thread E = new Thread();
		A.start();
		try {
			A.sleep(100);
			System.out.println("Vehicle A");
			System.out.println("Start the journey");
			A.sleep(200);
			System.out.println("Arrived at toll");
			A.sleep(300);
			System.out.println("Entered the toll booth");
			A.sleep(400);
			System.out.println("Exited the toll booth");
			A.sleep(450);
			System.out.println("Start the Bridge");
			A.sleep(500);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
		try {
			B.sleep(560);
			System.out.println("Vehicle B");
			System.out.println("Start the journey");
			B.sleep(580);
			System.out.println("Arrived at toll");
			B.sleep(590);
			System.out.println("Entered the toll booth");
			B.sleep(650);
			System.out.println("Exited the toll booth");
			B.sleep(700);
			System.out.println("Start the Bridge");
			B.sleep(1000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		C.start();
		try {
			C.sleep(1100);
			System.out.println("Vehicle C");
			System.out.println("Start the journey");
			C.sleep(1130);
			System.out.println("Arrived at toll");
			C.sleep(1140);
			System.out.println("Entered the toll booth");
			C.sleep(1150);
			System.out.println("Exited the toll booth");
			C.sleep(1200);
			System.out.println("Start the Bridge");
			C.sleep(1600);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		D.start();
		try {
			D.sleep(1660);
			System.out.println("Vehicle D");
			System.out.println("Start the journey");
			D.sleep(1680);
			System.out.println("Arrived at toll");
			D.sleep(1690);
			System.out.println("Entered the toll booth");
			D.sleep(1750);
			System.out.println("Exited the toll booth");
			D.sleep(1900);
			System.out.println("Start the Bridge");
			D.sleep(2200);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		E.start();
		try {
			E.sleep(2210);
			System.out.println("Vehicle E");
			System.out.println("Start the journey");
			E.sleep(2230);
			System.out.println("Arrived at toll");
			E.sleep(2240);
			System.out.println("Entered the toll booth");
			E.sleep(2250);
			System.out.println("Exited the toll booth");
			E.sleep(2300);
			System.out.println("Start the Bridge");
			E.sleep(2750);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// end of class

	}
	// end of main

}
