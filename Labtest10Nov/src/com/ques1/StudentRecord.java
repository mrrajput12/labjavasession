/*
 * WAP to create a record of students using array in java.
 * @author :Abhishek Raj
 * @Date :10 Nov 2022
 */
//importing package
package com.ques1;

//declearing class
public class StudentRecord {

	private static int standards[];

//main method started
	public static void main(String[] args) {
//value inserted
		String names[] = { "Abhishek", "Vikash", "suresh", "Kamlesh" };
		int marks[] = { 59, 78, 83, 77 };
		char sections[] = { 'A', 'B', 'c', 'd' };
		setStandards(new int[] { 9, 9, 9, 9 });
//for loop started
		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i] + " in section " + sections[i] + " got " + marks[i] + " marks.");

		}
		// for loop end

	}

	// end of main
//get and set started
	public static int[] getStandards() {
		return standards;
	}

	public static void setStandards(int standards[]) {
		StudentRecord.standards = standards;
	}
	// get and set ends

}
//end of class
