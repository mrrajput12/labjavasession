/*
Program: to find the dicount
@author: Abhishek Raj
@Date: 20 october 2022
*/
//importing package
import java.util.Scanner;

//declearing classs
class Discount
{
    public static void main(String args[])
    {
        double quantity,price,amount,discount;
 	Scanner sc= new Scanner(System.in);

	//price of an item
	System.out.println("Enter The Price Of The Product:");
	price=sc.nextDouble();


	// quantity price of item
        System.out.println("Enter The No Of Quantity:"); 
	     quantity=sc.nextDouble(); 


	// Amount of an item
	amount=quantity*price;  
	
	// Giving the discount
   {
		discount=amount*0.1;
		amount=amount-discount;

	}
	
	// total amount calculated

	System.out.println("The Total Amount is:"+amount);


   // ifelse started
	if(amount>2000)
		System.out.println("Congartulation!! you get an discout of 10%");
	else 
		System.out.println("Sorry !! you dont have any discount:");
	// ifelse end
	

   }	
//end of main


		
}
//end of class