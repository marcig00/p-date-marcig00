package es.unileon.prg1.date;
import java.util.Random;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		
		if ((day < 0 || day > 31) || (month < 1 || month > 31)){
			
			throw new DateException("Dia " + day + " y mes " + month + " no se encuentran entre los valores posibles. Dia: entre 1 y 31, Mes: entre 1 y 12");
		} else {
			this.month = month;
			this.day = day;
		}
		
		if (month < 1 || month > 12) {
			
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			
			this.month = month;
			
		}
		
		if (day < 0 || day > 31){
			
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
		} else {
			
			this.day = day;
		
		}
		
		
	}
	
	
	public Date(){
		 day = 1;
		 month = 1;
		 year = 2018;
		 
	}
	
	public Date(Date fecha){
		
		this.day = fecha.getDay();
		this.month = fecha.getMonth();
		this.year = fecha.getYear();
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
	
	public String getMonthName(){
		
		String month = " ";
		
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
				month = "No corresponde a un mes del anyo";		
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
		
		String season = " ";
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
				} else season = "Otonyo";
				break;
			case 10:
			case 11:
				season = "Otoño";
				break;
			case 12:
				if (this.day <= 21){
					season = "Otonyo";
				} else season = "Invierno";
	
				
		}
		return season;
	}
		

	
	public String getMonthsLeft(){
		
		StringBuilder months = new StringBuilder();
		int j = this.month;
		Date fecha = new Date();
		
		for( int i = this.month ; i < 12 ; i++){
			
			setMonth(fecha.getMonth() + j++);
			months.append(this.getMonthName() + " " );
		}
			return months.toString();
	}

	public String toString(){
		
		String fecha = " ";
		
		fecha =  this.day + "/" + this.month + "/" + this.year;
	
		return fecha;
		
	}
	
	public String getDaysLeftOfMonth(){
		
		StringBuilder daysLeftOfMonth = new StringBuilder();
		
		Date fecha = new Date(this);
		int j = 0;
		
		for( int i = this.day ; i <= fecha.getMonthsDays() ; i++){
			
			setDay(fecha.getDay() + j++ );
			
			daysLeftOfMonth.append(this.day + "-" + this.month + "-" + this.year + " ");
			
		}
			return daysLeftOfMonth.toString();	
	}	
	
	public String getMonthsSameDays(){
		
		StringBuilder monthsSameDays = new StringBuilder();
		
		int days = getMonthsDays();
		int i;
		
		Date fecha = new Date (this);
		
		for(i = 1 ; i <= 12 ; i++){
			
			fecha.setMonth(i);
			
			if( days == fecha.getMonthsDays()){
				
				monthsSameDays.append(fecha.getMonthName() + " ");
				
			}
			
		}	
			return monthsSameDays.toString();
		
	}
		
	
	public int getMonthsDays(){
		
		int days = 0;
		
		if ((this.month == 1 )|| (this.month == 3) || (this.month == 5 )|| (this.month == 7 )|| (this.month == 8 )|| (this.month == 10) || (this.month == 12)){
			
			days = 31;
			
		}if ((this.month == 4) || (this.month == 6) || (this.month == 9 )|| (this. month == 11 )){
			
			days = 30;
		}if (this.month == 2){
			
			days = 28;
		}

		return days;
	}
		
	public int daysPast(){
		
		int i;
		int daysTotal = 0;
		
		try{
			
		Date fecha1 = new Date ( 1, 1, this.year);
	
		for( i = 1; i < this.month; i++){
			
			daysTotal = fecha1.getMonthsDays();
			
			fecha1.setMonth( i + 1 );
		}
		
		}catch (DateException e){
			System.out.println(e.getMessage());
		}
		
		return daysTotal +  this.day - 1;
	}
			
		
	public int numRandomTriesEqualDate1(){
	
		int randomDay;
		int randomMonth;
		int year;
		int intentos = 0;
		boolean acierto = false;
		
		while (!acierto){
			
			randomDay = ( int ) (Math.random() * 31 + 1);
			randomMonth = ( int ) (Math.random() * 12 + 1);
			year = this.year;
			if (randomDay == this.day && randomMonth == this.month){
				
					acierto = true;
					System.out.println("Se ha obtenido la misma fecha");
			}
			else {
					acierto = false;
					System.out.println("prueba otra vez");
			}
			intentos++;
		}
		return intentos;
	}
	
	public int numRandomTriesEqualDate2(){
		
		int randomDay;
		int randomMonth;
		int year;
		int intentos = 0;
		boolean acierto = false;
		
		do{
			
			randomDay = ( int ) (Math.random() * 31 + 1);
			randomMonth = ( int ) (Math.random() * 12 + 1);
			year = this.year;
			
			if (randomDay == this.day && randomMonth == this.month){
				
					acierto = true;
					System.out.println("Se ha obtenido la misma fecha");
			}
			else {
					acierto = false;
					System.out.println("prueba otra vez");
			}
			intentos++;
		}
		while (!acierto);
		
		return intentos;
	}
		
	public int daysOfWeek(int dayJanuaryFirst){
		
		/*
		
		Lunes = 1
		Martes = 2
		Miercoles = 3
		Jueves = 4
		Viernes = 5
		Sabado = 6
		Domingo = 7
		
		*/
		
		int daysTotal = 0;
		int numDay = 0; 
		
		daysTotal = daysPast() - 1;
		numDay = (daysTotal % 7) + (dayJanuaryFirst % 7) + 1;
		
		return numDay;
		
		}
	
			
			

}
