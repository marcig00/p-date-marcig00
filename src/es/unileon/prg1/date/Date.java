package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		
		if(correctDate() == false){
			
			return false;
			
		}else {
			
			this.day = day;
			this.month = month;
			this.year = year;
			
		}
	}
	
	public Date(){
		 day = 1;
		 month = 1;
		 year = 2018;
		
	}
	
	public Date (Date) {
		
		this.day = getDay();
		this.month = getMonth();
		this.year = getYear();
		
	}
	
	//getters
	
	public int getDay(){
			
		return this.day;
	}
	
	public int getMonth(){
		
		return this.month;
	}
	
	public int getYear(){
		
		return this.year;
	}
	
	//setters
	
	public void setDay(int day){
		
		this.day = day;
		
	}
	
	public void setMonth(int month){
		
		this.month = month;
	}
	
	public void setYear(int year){
		
		this.year = year;
		
	}

	
	public boolean correctDate(){
		boolean correctDay = false;
		boolean correctMonth = false;
		boolean correctYear = false;
		
		correctYear = (this.year > 0);
		correctMonth = (this.month >= 1 && this.month <= 12);
		correctDay = this.isDayRight();
		
	}		
	
	//isSame...
	
	boolean isSameDay(Date another){
		
		if ( this.day == another.getDay() ){
			
			return true;
			
		}else {
		
		return false;
		
		}
	}
	
	boolean isSameMonth(Date another){
		
		if ( this.month == another.getMonth() ){
			
			return true;
			
		}else{
		
		return false;
		
		}
	}
	
	boolean isSameYear(Date another){
		
		if ( this.year == another.getYear() ){
			
			return true;
			
		}else{
		
		return false;
		
		}
	}
	
	boolean isSameDay1(Date date){
		boolean sameDay = false;
		
		sameDay = (this.day == date.getDay());
		
		return sameDay;
		
	
	}
	
	boolean isSameMonth1(Date date){
		boolean sameMonth = false;
		
		sameMonth = (this.month == date.getMonth());
		
		return sameMonth;
		
	
	}
	
	boolean isSameYear1(Date date){
		boolean sameYear = false;
		
		sameYear = (this.year == date.getYear());
	
		return sameYear;
		
		
	}
	
	
	//Switch
	
	private String getMonthName(){
		
		String month;
		
		switch (this.month){
			
			case 1: 
				month = "Enero";
				break;
			case 2:
				month = "Febrero";
				break;
			case 3:
				month = "Marzo";
				break;
			case 4:
				month = "Abril";
				break;
			case 5:
				month = "Mayo";
				break;
			case 6:
				month = "Junio";
				break;
			case 7:
				month = "Julio";
				break;
			case 8:
				month = "Agosto";
				break;
			case 9:
				month = "Septiembre";
				break;
			case 10:
				month = "Octubre";
				break;
			case 11:
				month = "Noviembre";
				break;
			case 12:
				month = "Diciembre";
				break;
			default:
				month = "No corresponde a un mes del año";		
	}
		return month;
		
	}	
	
	public boolean isDayRight (){
	
		boolean rightDay = false;
		switch(this.month){
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (this.day >= 1 && this.day <=31){
					rightDay = true;
				}
				break;
			case 2:
				if (this.day >=1 && this.day <=28){
					rightDay = true;
				}
				break;				
			default:	
				if (this.day >=1 && this.day <= 30){
					rightDay = true;
				}	
	
			
		}
		 return rightDay ;
	} 
		 
	public String setSeasonName(){
		
		/* 
		Hemisferio norte:
			Primavera: 21 marzo hasta 20 junio.
			Verano: 21 junio hasta 20 septiembre.
			Otoño: 21 septiembre hasta 20 diciembre.
			Invierno: 21 diciembre hasta 20 marzo.	
		*/	
		
		String season;
		switch (this.month){
			
			case 1:
			case 2:
				season = "Invierno";
				break;
			case 3:
				if (this.day <= 20){
					season = "Invierno";
				} else season = "Primavera";
				break;
			case 4:
			case 5:
				season = "Primavera";
				break;
			case 6:
				if (this.day <= 20){
					season = "Primavera";
				} else season = "Verano";
				break;
			case 7:
			case 8:
				season = "Verano";
				break;
			case 9:
				if (this.day <= 20){
					season = "Verano";
				} else season = "Otoño";
				break;
			case 10:
			case 11:
				season = "Otoño";
				break;
			case 12:
				if (this.day <= 21){
					season = "Otoño";
				} else season = "Invierno";
	
				
		}
		return season;
	}
		
				
	//for
	
	public String monthsLeft(){
		
		StringBuilder months = new StringBuilder();
		
		for( int i = this.month + 1 ; i <= 12 ; i++){
			
			months.append(this.getMonthName());
		}
			return months.toString;
	}

	public String toString(){
	
		String fecha = " ";
		
		fecha = return this.day + "/" + this.month + "/" + this.year;
	
		return fecha;
		
	}
	
	public String getMonthsSameDays(){
		
		StringBuilder monthsSameDays = new StringBuilder();
		
		
		
		
		
		
		
	}
	
	//public String getDaysLeftOfMonth(){
		
		
		
		
		
		
		/*public int daysYearUntilNow(){
			
		}
		
		public int daysOfWeek(int dayJanuaryFirst){
			
			int day, today, daysTotal;
			daysTotal = this.daysYearUntilNow()-1;
			return daysTotal % 7 + dayJanuaryFirst;
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			*/
			
			
			
			
			
			
			
			
			

}
