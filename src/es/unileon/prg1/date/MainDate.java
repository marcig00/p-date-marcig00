package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		
		Date today;
		Date tomorrow;
	
		try {
			today = new Date(4,1 , 2018);
			tomorrow = new Date(6, 9, 2018);
			
		//TO STRING 
		
		System.out.println(tomorrow.toString());
		
		//CON IF
		
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		
		//SIN IF
		
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay1(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth1(tomorrow));
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear1(tomorrow));
		
		
		//CON SWITCH	
		
		System.out.println(today.isDayRight());
		System.out.println("El nombre del mes es: " + tomorrow.getMonthName());
		System.out.println("El mes se encuentra en la estacion: " + today.setSeasonName());
		
		//CON FOR
		
		System.out.println("Los meses que quedan son: " + tomorrow.getMonthsLeft());
		System.out.println("Los meses con el mismo numero de dias son: " + today.getMonthsSameDays());
		System.out.println("Las fechas restantes del mes son: " + tomorrow.getDaysLeftOfMonth());
		System.out.println("Los dias que han pasado desde el primer dia del anyo hasta la fecha actual son: " + today.daysPast());
		
		//CON WHILE
		
		//System.out.println("Se han necesitado " + tomorrow.numRandomTriesEqualDate1() + "intentos");
		//System.out.println("Se han necesitado "tomorrow.numRandomTriesEqualDate2() + "intentos");
		System.out.println("El dia de la semana es: " + today.daysOfWeek(2));
		
			/*
		
		Lunes = 1
		Martes = 2
		Miercoles = 3
		Jueves = 4
		Viernes = 5
		Sabado = 6
		Domingo = 7
		
		*/
		
		} catch (DateException e) {
			
			System.out.println(e.getMessage());
		}
	}
}