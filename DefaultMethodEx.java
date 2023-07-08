package lambdaEx;

interface DemoInterface1{
	default void show()
	{
		System.out.println("This is default method using lambda");
	}
}

public class DefaultMethodEx implements DemoInterface1 {

	public static void main(String[] args) {
		
		DefaultMethodEx obj=new DefaultMethodEx();
		obj.show();
	       
	      
	}

}



