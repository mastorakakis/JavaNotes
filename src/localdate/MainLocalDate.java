package localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainLocalDate {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate date = LocalDate.parse("2019-02-22");
		System.out.println(date);
        date = LocalDate.parse("07/09/2004", formatter);
        System.out.println(date);
        System.out.println(date.format(formatter));

		date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birthday = LocalDate.of(1983, 01, 16); 
		System.out.println(birthday);

		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		System.out.println(day + " " + month + " " + year);
		
		DayOfWeek theDay = date.getDayOfWeek();
		int theDay2 = date.getDayOfWeek().getValue();
		System.out.println(theDay + "=" + theDay2);
		
		date = date.plusDays(12);
		date = date.minusDays(12);
		
		System.out.println(date.compareTo(birthday));
		System.out.println(birthday.compareTo(date));
		System.out.println(date.isAfter(birthday));
		
		DayOfWeek christmasEve = LocalDate.of(2020, 12, 31).getDayOfWeek();
		System.out.println(christmasEve);
		System.out.println(LocalDate.now().minusMonths(1).format(formatter));
	
		date = LocalDate.of(2020, 01, 01);
		int count = 0;
		while (date.isBefore(LocalDate.of(2020, 12, 31))) {
			if (!date.getDayOfWeek().equals(DayOfWeek.SATURDAY) 
					&& !date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				count++;
			}
		date = date.plusDays(1);
		}
		System.out.println(count + " weekdays");
	}
}
