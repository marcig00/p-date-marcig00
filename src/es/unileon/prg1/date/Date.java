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
	
	
	public Date(){
		int day = 1;
		int month = 1;
		int year = 2018;
		
		this.day = day;
		this.month = month;
		this.year = year;
	
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
	
	void setDay(int day){
		
		this.day = day;
		
	}
	
	void setMonth(int month){
		
		this.month = month;
	}
	
	void setYear(int year){
		
		this.year = year;
		
	}

	//isSame...
	
	boolean isSameDay(Date date){
		
		if ( this.day == date.getDay() ){
			
			return true;
			
		}
		
		return false;
	}
	
	boolean isSameMonth(Date date){
		
		if ( this.month == date.getMonth() ){
			
			return true;
			
		}
		
		return false;
	}
	
	boolean isSameYear(Date another){
		
		if ( this.year == another.getYear() ){
			
			return true;
			
		}
		
		return false;
	}
	
	/*boolean isSameDay1(Date notherDate){
		
		return (this.day == date.getDay);
	
	}
	
	boolean isSameMonth1(Date anotherDate){
		
		return (this.month == date.getMonth);
	
	}
	
	boolean isSameYear1(Date anotherDate){
		
		return (this.year == date.getYear);
	
	}
	*/
	
	//Switch
	
	private String getMonthName(){
		
		String month;
		
		Switch (this.month){
			
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
				break;		
	}
		return month;
		
	}	
	
	public boolean isDayRight(){
		
		boolean rightDay = false;
		Switch(this.day){
			
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
			case 4:
			case 6:
			case 9:
			case 11:	
				if (this.day >=1 && this.day <= 30){
					rightDay = true;
				}	
				break;
			
		}
		 return rightDay;
	}		
				
	public String setSeasonName(){

		String season;
		Switch (this.month){
			
			case 1:
			case 2:
				season = "Invierno";
				break;
			case 3:
				if (this.day >= 1 && this.day <= 20){
					season = "Invierno";
				} else season = "Primavera";
				break;
			case 4:
			case 5:
				season = "Primavera":
				break;
			case 6:
				if (this.day >= 1 && this.day <= 21){
					season = "Primavera";
				} else season = "Verano";
				break;
			case 7:
			case 8:
				season = "Verano";
				break;
			case 9:
				if (this.day >= 1 && this.day <= 20){
					season = "Verano";
				} else season = "Otoño";
				break;
			case 10:
			case 11:
				season = "Otoño";
				break;
			case 12:
				if (this.day >= 1 && this.day <= 21){
					season = "Otoño";
				} else season = "Invierno";
			default:
			
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
		
		int day;
		int month;
		int year;
		int i;
		
		return this.day + "/" + this.month + "/" + this.year;
	
	}
		/*public int daysYearUntilNow(){
			
		}
		
		public int daysOfWeek(int dayJanuaryFirst){
			
			int day, today, daysTotal;
			daysTotal = this.daysYearUntilNow()-1;
			return daysTotal % 7 + dayJanuaryFirst;
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			*/
			
			
			
			
			
			
			
			
			

}
