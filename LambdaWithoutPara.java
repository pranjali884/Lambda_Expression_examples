package lambdaEx;



public class LambdaWithoutPara {

	public static void main(String[] args) {
		LambdaWithoutParaInterface msg=()->
		{
		return "hello lambda";
		};
		System.out.println(msg.sayHello());
		
	}

}
