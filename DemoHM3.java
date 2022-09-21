package JavaCollections;

import java.util.HashMap;

public class DemoHM3 {

	public static void main(String[] args) {
		
		HashMap <Integer,String> myhashmap1 = new HashMap <Integer,String> ();
		
		
		  HashMap <Integer,String> myhashmap2 = new HashMap <Integer,String> ();
		
		  
		  myhashmap1.put(1, "Yamaha R15");
		  
			myhashmap1.put(2, "Kawasaki Ninja 300");
			
			System.out.println("\nValues in first map: " + myhashmap1);
		
			myhashmap2.put(3, "Suzuki Gixxer SF");
			  
			myhashmap2.put(4, "KTM RC 200");
		
			System.out.println("\nValues in first map: " + myhashmap2);
			
			
			 myhashmap2.putAll(myhashmap1);
			  System.out.println("\nNow values in second map: " + myhashmap2);
	}

}
