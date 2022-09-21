
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		
		{
			
			int i=8;
			int j=0;
			int s=i/j;
			System.out.println("output is"  + s);
			System.out.println("Hello Global logic");
			
		}   
		
		catch(ArithmeticException e)
		{
			
			System.out.println("Hello world");
			
		}
		
		
		
		
		
	}

}
