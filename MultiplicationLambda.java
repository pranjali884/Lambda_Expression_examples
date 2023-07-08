package lambdaEx;

public class MultiplicationLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationInterface mul=(a,b)->(a*b);
		
		System.out.println(mul.mul(10, 8));
		

	}

}
