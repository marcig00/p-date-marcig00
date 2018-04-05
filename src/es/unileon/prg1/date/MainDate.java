package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		
		Date today;
		Date tomorrow;
		
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		
		today.isSameYear();
		
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today.monthsLeft());
		System.out.println(today.daysOfWeek());
		
		
		
		
		
		System.out.println(today.getMonthName);
		System.out.println(today.isDayRight);
		
	}

}
