package lambdaEx;

import java.util.*;

public class LambdaWithArrayList {

	public static void main(String[] args) {
		 
		ArrayList<String>names =new ArrayList<>();
		names.add("guddi");
		names.add("aabu");
		names.add("dada");
		System.out.println("names are: "+names);
		names.forEach(list -> System.out.println(list));
		
		//to join all elements together using |,-,/,,,
		List<String> li = Arrays.asList("Virat", "Ricky", "Peterson", "Watson", "Sachin");
		String nm = String.join(" / ", li);
		System.out.println(nm);
	}

}
