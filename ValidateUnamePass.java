package lambdaEx;

public class ValidateUnamePass {

	public static void main(String[] args) {
		
		validate val=(username,password) -> {
			if(username.equals("ABC")&&password.equals("DEF"))
			{
				return true;
			}
			return false;
		};
		System.out.println(val.isValid("ABC", "DEF"));
	}
	
	


}

