package com.hanbit.oop.serviceImpl;

public class LeapYearService {
	private int year;
	private String result;
	
	public void setYear(int year){
		this.year=year;
	}
	public void setResult(){
		if(year%4==0 && year%100==0){
			result = "평년";
		}else if(year%4==0){
			result = "윤년";
		}else if(year%100==0 && year%400==0){
			result = "윤년";
		}else{
			result="평년";
		}
	}
	
	public int getYear(){
		return year;
	}
	public String getResult(){
		return result;
	}
	/*
			String result = "";
		
		if(year%4==0 && year%100==0){
			result = "평년";
		}else if(year%4==0){
			result = "윤년";
		}else if(year%100==0 && year%400==0){
			result = "윤년";
		}else{
			result="평년";
		}
			return result;
			
			
	 */
}
