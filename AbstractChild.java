package Absrtact;

public class AbstractChild extends AbstractParent {

	
	void info1() {
		
		System.out.println("Welcome to global logic");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		AbstractChild a = new AbstractChild();
	
		a.info1();
		a.info2();
		
	}

	
	}


