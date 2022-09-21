package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class PracticeH2 {

	public static void main(String[] args) {
		
		HashSet<String> myh_set = new HashSet<String>();
		
		 myh_set.add("Swift");
		 
		 myh_set.add("Verna");
		 
		 myh_set.add("Creta");
		 
		 myh_set.add("Brezza");
		 
		 myh_set.add("Fortuner");
		 
		 myh_set.add("Nexon");
		 
		 myh_set.add("Seltos");
		 
		 
		
		    Iterator<String> s = myh_set.iterator();
		  
		   while (s.hasNext()) {
		   System.out.println(s.next());
		
		
		
		   }

	}

}
