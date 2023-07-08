package lambdaEx;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestInFunction {

	public static void main(String[] args) {
		
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
		 
		 
	     //print
        System.out.println("Numbers in an Arrays : "
                + Arrays.toString(numbers));
 
        //execution start-time
        LocalTime start=LocalTime.now();
        
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        //execution end time
        LocalTime endTime=LocalTime.now();
System.out.println("\nSecond largest number in an Arrays is - "
                + secondLargestNumber);
	}

}
