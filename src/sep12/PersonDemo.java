package sep12;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	   System.out.println(p1.phone);
	   
	   p1.name= "Bhargav";
	   p1.age=26;
	   p1.phone=286342829;
	   p1.greet();
	   
	   System.out.println(p1.name);
		System.out.println(p1.age);
	   System.out.println(p1.phone);
	   
	}

}
