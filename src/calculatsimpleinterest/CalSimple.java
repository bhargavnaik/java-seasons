package calculatsimpleinterest;

import java.util.Scanner;

public class CalSimple {

	public static void main(String[] args) {
	
		CalSimple.calsim1();
		CalSimple.calsim2(100);  
		System.out.println(CalSimple.calsim3());
		System.out.println(CalSimple.calsim4(10000));
	}
	//2) Methods no return-type and with arguments/parameters
	public static void calsim2(float f) {
		
		float p=100,t=5,r = 5;
		float SI2 = (p*t*r)/100;
		System.out.println("simple interest= " +SI2);
	
	}
	//4) Methods with return-type and arguments/parameters
	
	public static float calsim4(float f) {
		float p=10000,t=5,r = 5;
		float SI4 = (p*t*r)/100;
	return SI4;
		
		
	}
	//1) Methods  no return type and no arguments/parameters
	public static void calsim1()
   {
	   float p =10,t = 5,r = 5;
	   System.out.println("calculate simple interest");
	  Scanner input= new Scanner(System.in);
	  float f= input.nextFloat();
	  float SI1 = (p*t*r)/100;
	System.out.println("simple interest= " +SI1);
   }
	//3) Methods with return-type and no  arguments/parameters
	
	public static float calsim3() {
		 float p =1000,t = 5,r = 5;
		   System.out.println("calculate simple interest");
		  Scanner input= new Scanner(System.in);
		  float f= input.nextFloat();
		  float SI3 = (p*t*r)/100;
		return SI3;
		
	}
}