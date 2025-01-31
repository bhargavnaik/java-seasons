package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {

		Set hs= new HashSet();
		
		System.out.println(hs.size());
		
		hs.add(10);
		
		hs.add("BHARGAV");
		
		hs.add("NAIK");
 
		hs.add(9492989418.6);
		System.out.println(hs.add("b"));
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		for(int i=0;i<hs.size();i++) {
			
			System.out.println(hs.size());
		}
		for(Object temp:hs) {
			
			System.out.println(temp);
			
		}
	}

}
