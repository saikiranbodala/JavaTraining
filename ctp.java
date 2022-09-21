package Polymorphism;

public class ctp {
	
	
	
	public void area(String name)
	{
		System.out.println("name");
	}
	
	public void area(String name , String name2)
	{
		System.out.println("name and name2");
	}
	
	public void area(String name , String name2 , String name3)
	{
		System.out.println("name and name2 and name3");
	}
    public static void main(String[] args) {
    	
    	ctp sk = new ctp();
    	
    	sk.area("name");
    	sk.area("name","name2");
    	sk.area("name","name2","name3");
    }
    
}
