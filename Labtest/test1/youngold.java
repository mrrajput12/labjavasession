/*
Program: to find the sq cube and checkin no even or odd
@author: Abhishek Raj
@Date: 20 october 2022
*/
//importing package
import java.util.Scanner;

//declearing classs
class youngold
{
	//main started
	public static void main(String args[])
	{
		//declearing an object
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age:");
		
		
		//declearing variables
		int P1,P2,P3,max,min;
		
		//input value
		System.out.println("Enter the age of 1st person:");
		P1 = sc.nextInt();
		System.out.println("Enter the age of 2nd person:");
		P2 = sc.nextInt();
		System.out.println("Enter the age of 3rd person:");
		P3 = sc.nextInt();
	
	
	//ifelse started for oldest
	if(P1>P2&&P1>P3)
		System.out.println("the first person is oldest");
	else if(P2>P1&&P2>P3)
		System.out.println("the second person is oldest");
	else if(P3>P1&&P3>P2)
		System.out.println("the third person is oldest");
	else 
		System.out.println("All have the equal age");
	    System.exit(0);
		
		
		
		//ifelse started for youngest
	if(P1<P2&&P1<P3)
		System.out.println("the first person is younger");
	else if(P2<P1&&P2<P3)
		System.out.println("the second person is younger");
	else if(P3<P1&&P3<P2)
		System.out.println("the third person is younger");
	else 
		System.out.println("All have the equal age");
	System.exit(0);
		
	///end of ifelse
		
	}		
//end of main


		
}
//end of class