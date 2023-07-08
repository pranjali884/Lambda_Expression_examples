package lambdaEx;

interface DefaultMethod {
	//normal method
	void display();
	
	//default method
	default void msg()
	{
		System.out.println("default method called");
	}
	//static method
	static void msg1()
	{
		System.out.println("static method called");
	}
}

public class DefaulAndStaticMethod implements DefaultMethod{

	public static void main(String[] args) {
		DefaultMethod.msg1();
		
		DefaulAndStaticMethod d1=new DefaulAndStaticMethod();
		d1.display();
		d1.msg();
		
		
		
		
		
	}
	@Override
	public void display() {
		  System.out.println("normal method called");
	}

	

}
