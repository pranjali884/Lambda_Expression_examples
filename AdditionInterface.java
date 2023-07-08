package lambdaEx;

public class AdditionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionLambdaInterface  ad= (a,b)  -> (a + b);
		
		System.out.println(ad.add(5,6));
	}

}


