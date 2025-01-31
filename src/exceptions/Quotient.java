package exceptions;

import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		
		System.out.println("enter divident");
		Scanner input=new Scanner(System.in);
         int x=input.nextInt();
         
         System.out.println("enter divisor");
         int y=input.nextInt();
         
         try
         {
        	 int z=x/y;
             System.out.println("print the quotient" +z);
         }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        	System.out.println("Please enter non-zero value for y..Try again..");
        }
         System.out.println("End of Program..");
	}

}
