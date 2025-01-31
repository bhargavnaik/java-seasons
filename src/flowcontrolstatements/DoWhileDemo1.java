package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        String uname=null;
        String pwd=null;
        
        do
        {
        	System.out.println("enter name");
        	uname=input.next();
        	System.out.println("enter pwd");
        	pwd=input.next();
        	if(uname.equals("bhargav999") && pwd.equals("bhargav123"))
        	{
        		System.out.println("welcome bhargav darling");
        		break;
        	}
        
        	
        }while(uname.equals("bhargav999") && pwd.equals("bhargav123"));
        System.out.println("end of program");
	}
}


