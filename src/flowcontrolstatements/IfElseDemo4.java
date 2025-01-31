package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo4 {

	private static final String Date = null;

	public static void main(String[] args) {
		
		System.out.println("Enter your birthdetails");
		
		System.out.println("Enter Date");
		Scanner input1=new Scanner(System.in);
		int Date=input1.nextInt();
		
		System.out.println("Enter Month");
		Scanner input2=new Scanner(System.in);
		int Month=input2.nextInt();
		
		System.out.println("Enter Year");
		Scanner input3=new Scanner(System.in);
		int Year=input3.nextInt();
		
		System.out.println(Date+"-"+Month+"-"+Year);

		String mon=null;
		
	    if(Month==1)
	    {
	    	mon="Jan";
         }
	    else  if(Month==2)
	    {
	    	mon="feb";
         }
	    else  if(Month==2)
	    {
	    	mon="feb";
         }
	    else  if(Month==3)
	    {
	    	mon="mar";
         }
	    else  if(Month==4)
	    {
	    	mon="apr";
         }
	    else  if(Month==5)
	    {
	    	mon="may";
         }
	    else  if(Month==6)
	    {
	    	mon="jun";
         } 
	    else  if(Month==7)
	    {
	    	mon="jul";
         }
	    else  if(Month==8)
	    {
	    	mon="aug";
         }
	    else  if(Month==9)
	    {
	    	mon="sep";
         }
	    else  if(Month==10)
	    {
	    	mon="oct";
         }
	    else  if(Month==11)
	    {
	    	mon="nov";
         }
	    else  if(Month==12)
	    {
	    	mon="dec";
         }
	    else
	    {
	    System.out.println("Invalid month");
	    }
	    System.out.println(Date+"-"+mon+"-"+Year);
}
}