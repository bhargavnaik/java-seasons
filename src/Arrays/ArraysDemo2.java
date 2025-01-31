package Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {

		int[] a= new int[5];
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		a[0]=10;
		a[1]=100;
		a[2]=200;
		a[3]=300;
		a[4]=40;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int temp:a) {
			System.out.println(temp);
		}
	}

}