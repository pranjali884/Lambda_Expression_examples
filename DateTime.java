package lambdaEx;

import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		
		//it will print current date
		LocalDate currentDat = LocalDate.now();
		System.out.println("CurrentDate is:" + currentDat);
		
		
		//it will print current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("CurrentTime is:" + currentTime);
		
		//it will print current date and time in year,month and day format and time is in hrs,min and nanoseconds
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("CurrentDateTime is:" + currentDateTime);
		
		//it will print zone of system
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone is:" + currentZone);
		
		//it will return boolean value if year is leap then true otherwise false
		System.out.println("CurrentDate is leap  year or not:" + currentDat.isLeapYear());
		
		//it will print tomorrows date
		System.out.println("Plus Days is:" + currentDat.plusDays(1));
		
		System.out.println("Plus Month is:" + currentDat.plusMonths(1));
		System.out.println("Plus Week is:" + currentDat.plusWeeks(1));
		System.out.println("Plus Year is:" + currentDat.plusYears(1));
		
		System.out.println("Minus Days is:" + currentDat.minusDays(1));
		System.out.println("Minus Month is:" + currentDat.minusMonths(1));
		System.out.println("Minus Week is:" + currentDat.minusWeeks(0));
		System.out.println("Minus Year is:" + currentDat.minusYears(1));
		System.out.println("Month value:"+currentDat.getMonthValue());

		
	}
}
