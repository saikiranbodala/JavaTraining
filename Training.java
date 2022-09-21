package paTraining;

import java.util.Arrays;

public class Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String  [] names= {"lashman","ram","sam"};
//		int index=0;
//		for(int i=0;i<names.length;i++) {
//			if(names[i]=="lashman") {
//			index=i;}
//		}
//		System.out.println("index="+index);

		
//		int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println("Original Array : "+Arrays.toString(my_array)); 
//		int removeIndex =2;
//
//		   for(int i = removeIndex; i < my_array.length -3; i++){
//		        my_array[i] = my_array[i + 1];
//		      }
//	
//		    System.out.println("After removing the second element: "+Arrays.toString(my_array));
		
		
//		int[] my_array =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//		   int[] new_array = new int[13];     
//		 
//		   System.out.println("Source Array : "+Arrays.toString(my_array));     
//		   
//		   for(int i=0; i < my_array.length; i++) {
//		    new_array[i] = my_array[i];
//		}
//		   System.out.println("New Array: "+Arrays.toString(new_array));
		
		
		int[] my_array =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		int Index_position = 8;
		   int newValue    = 20;

		  System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		  for(int i=my_array.length-1; i > Index_position; i--){
		    my_array[i] = my_array[i-1];
		   }
		   my_array[Index_position] = newValue;
		   System.out.println("New Array: "+Arrays.toString(my_array));
	}

}
