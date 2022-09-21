package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoHm {

	public static void main(String[] args) {
	
		HashMap<Integer,String> myhashmap= new HashMap<Integer,String>();
		
		
		myhashmap.put(1, "Yamaha R15");
		  
		myhashmap.put(2, "Kawasaki Ninja 300");
		  
		myhashmap.put(3, "Suzuki Gixxer SF");
		  
		myhashmap.put(4, "KTM RC 200");
		  
	
		  
		  
		  
		  for(Map.Entry x:myhashmap.entrySet()){ 
			  
			  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		
		
		
		
		

	}

}
