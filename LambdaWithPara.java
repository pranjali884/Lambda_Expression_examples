package lambdaEx;

public class LambdaWithPara {

	public static void main(String[] args) {
		
		LambdaWithParaInterface msg = (name) ->
		{
			return "Hello "+name;
		};
		System.out.println(msg.say("pranju"));
	}

}
