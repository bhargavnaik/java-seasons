package aug31;

import java.util.Scanner;

public class MethodsDemo3 {
	
	public static void main(String[] args) {
		
		MethodsDemo3 obj2=new MethodsDemo3();
		System.out.println("1) Methods  no return type and no arguments/parameters");
		obj2.naturalsum();
		
		System.out.println("2) Methods no return-type and with arguments/parameters");
		obj2.naturalsum();
	}
  public void naturalsum()
  {
	  System.out.println("Enter a Natural Number");
	 Scanner input= new Scanner(System.in);
	 int n =input.nextInt();
	 int res=(n*(n+1))/2;
	 System.out.println(res);
  }
  public void naturasum(int n) 
  {
	  int res=(n*(n+1))/2;
		 System.out.println(res);
  }
  
}
