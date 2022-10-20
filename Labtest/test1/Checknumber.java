/* 
Program: to find the sq cube and checkin no even or odd
@author: Abhishek Raj
@Date: 20 october 2022
*/
//importing package
import java.util.Scanner;

//declearing classs
class Checknumber
{
	//method to square the number
	static void squ(float n1);//dummy/formal argument
	{
		float result= n1*n1;
		System.out.println("the result is :"+result);
	}
	//end of method
	
	
	//method to cube the number
	static void cu(float n1);//dummy/formal argument
	{
		float result= n1*n1*n1;
		System.out.println("the result is :"+result);
	}
	//end of method
	
	//ifelse started
	if((n1%2)==0)
		System.out.println("The number "+num+" is even");
	else
		System.out.println("The number "+num+" is odd");
	///end of ifelse
		
	//main started
	public static void main(String args[])
	{
		//declearing an object
		Scanner sc =new Scanner(System.in);
		
		
		//declearing variables
		float num1;
		int choice;
		
		//input number
		System.out.println("Enter the number:");
		num1 = sc.nextFloat();
		
		//menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even Odd");
		System.out.println("3. Exit");
		
		choice =sc.nextInt();
		//switch case
		switch(choice)
		{
			case 1:square(num1);
		           break;
			case 2:cube(num1);
		           break;	   
		    case 3:Even Odd():
		       break;
		    case 4:System.exit(0);
		           break;
		     default: System.out.prinln("Wrong input");
		}
		
		//end of switch case
	}		
//end of main


		
}
//end of class