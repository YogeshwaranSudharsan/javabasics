package com.basic;

public class Date {
	int day;
	int month;
	int year;
	public Date() {
		
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public void setdisplaydate() {
		System.out.println(day + "/"+month+"/"+year);
		
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String[] args) {
		
		Date date1=new Date(31,5,18);
		
		date1.setdisplaydate();
		
		
		
	}

}
