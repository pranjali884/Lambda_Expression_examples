package lambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		List <String> strList = Arrays.asList("abc","","bcd","","defg","jk");
		
		//it will count empty elements
		long count=strList.stream().filter(x->x.isEmpty()) .count();
		System.out.println("empty: "+count);
		
		//it will print elements whose length is greater than 3
		long cm=strList.stream().filter(x-> x.length() > 3) .count();
		System.out.println("length is greater than three: "+cm);
		
		//it will count blank elements
		long num=strList.stream().filter(x-> x.isBlank()) .count();
		System.out.println("blank : "+num);
		
		//it will count equal to three elements
		long num1=strList.stream().filter(x-> x.length() ==3) .count();
		System.out.println("elements are equal to three: "+num1);
		
		//it will count startswith a
		long st=strList.stream().filter(x-> x.startsWith("a")).count();
		System.out.println("elements start with a: "+st);
		
		List<String>list = Arrays.asList("usa", "japan","france","germany","Italy","canada");
		String s=list.stream() .map(x-> x.toUpperCase()) .collect(Collectors.joining(", "));
		System.out.println("uppercase: "+s);
		
		List<Integer>listofNumbers = Arrays.asList(1,2,3,4,5,6,12,18);
		Integer num2 = listofNumbers stream(). filter(i-> i% 2 == 0.filter(i -> i% 3 == 0) ) 
	}

}
