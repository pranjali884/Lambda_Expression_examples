package lambdaEx;


	public class Source {
	    public static void main(String[] args) {
	        String username = "ABC";
	        String password = "DEF";
	        
	        Source source = new Source();
	        boolean isAuthenticated = source.validate(username, password);
	        System.out.println("Authentication: " + isAuthenticated);
	    }

	    public boolean validate(String username, String password) {
	        // Lambda expression for authentication
	    	validate authenticator = (u, p) -> u.equals("ABC") && p.equals("DEF");

	        return authenticator.isValid(username, password);
	    }

	}



