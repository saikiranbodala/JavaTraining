package Inheritance;

public class ChildClass extends  ParentClass {

	public void example() {
		System.out.println("hello world");
	}
	
	
	
	public static void main(String[] args) {
		
		ChildClass sk = new ChildClass();
		
		sk.example();
		
		sk.company();
		sk.location();
		sk.state();
		sk.country();
		
		

	}

}
