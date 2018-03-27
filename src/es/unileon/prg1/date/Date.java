package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	
	}
	
	public newDate(){
		
		this.day = 01;
		this.month = 01;
		this.year = 2018;
	
	}
	
	public anotherDate(Date){
		
		this.Day = day;
		this.month = month;
		this.year = year;
	
	}
	
	//getters
	
	public getDay(){
			
		return this.day;
	}
	
	public getMonth(){
		
		return this.month:
	}
	
	public int getYear(){
		
		return this.year;
	}
	
	//setters
	
	public setDay(int day){
		
		this.day = day;
		
	}
	
	public setMonth(int month){
		
		this.month = month;
	}
	
	public setYear(int year){
		
		this.year = year;
		
	}

	//isSame...
	
	boolean isSameDay(Date anotherDate){
		
		if ( this.day == anotherDate.getDay() ){
			
			return true;
			
		}
		
		return false;
	}
	
	boolean isSameMonth(Date anotherDate){
		
		if ( this.month == anotherDate.getMonth() ){
			
			return true;
			
		}
		
		return false;
	}
	
	boolean isSameYear(Date anotherDate){
		
		if ( this.year == anotherDate.getYear() ){
			
			return true;
			
		}
		
		return false;
	}
	
	boolean isSameDay1(Date anotherDate){
		
		return (this.day == date.getDay);
	
	}
	
	boolean isSameYear(Date another){
		
		return (this.year == date.getYear);
	
	}
	
	boolean isSameYear(Date another){
		
		return (this.year == date.getYear);
	
	}
	
	public String toString(){
		
		return this.day + "/" + this.month + "/" + this.year;
	
	}
	

	private String getMonthName(){
		
	}
	
	public String monthsLeft(){
		
		StringBuilder months = new StringBuilder();
		
		for( int i = this.month + 1 ; i <= 12 ; i++){
			
			months.append(this.getMonthName());
		}
			return months.toString;
			
		public int daysYearUntilNow(){
			
		}
		
		public int daysOfWeek(int dayJanuaryFirst){
			
			int day, today, daysTotal;
			daysTotal = this.daysYearUntilNow()-1;
			return daysTotal % 7 + dayJanuaryFirst;
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
