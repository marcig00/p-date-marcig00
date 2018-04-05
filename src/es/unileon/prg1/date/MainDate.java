package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		
		Date today;
		Date tomorrow;
		
		today = new Date(3, 5, 1999);
		tomorrow = new Date(17, 2, 1999);
		
		//IF
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		
		//NO IF
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay1(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth1(tomorrow));
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear1(tomorrow));
		
		
		//SWITCH	
		
		System.out.println(today.isDayRight());
		System.out.println(tomorrow.getMonthName());
		System.out.println(today.setSeasonName());
		
		//FOR
		
		System.out.println(tomorrow.getMonthsLeft());
		System.out.println(today.getMonthsSameDays());
		System.out.println(tomorrow.getDaysLeftOfMonth());
		
		
		
	}

}
