/*wap to print the Sample light
 * @author:Abhishek raj
 * @date :1st dec 2022
 */
package com.ques2;

//declearing a class
public class SampleLight {
	// main started
	public static void main(String[] args) {
		final String C1 = "Red";
		final String C2 = "Green";
		final String C3 = "Yellow";
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// System.out.println("Thread1_LockC1");
				System.out.println("RED");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}

				// System.out.println("Thread2_LockC2");
				System.out.println("RED");

			}

		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				// System.out.println("Thread2_LockC2");
				System.out.println("GREEN");
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}

				// System.out.println("Thread3_LockC3");
				System.out.println("GREEN");
			}

		};
		Thread t3 = new Thread() {
			@Override
			public void run() {

				// System.out.println("Thread3_LockC3");
				System.out.println("YELLOW");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}

				// System.out.println("Thread1_LockC1");
				System.out.println("YELLOW");

			}

		};
		t1.start();
		t2.start();
		t3.start();

	}
	// end of main
}
//end of class
