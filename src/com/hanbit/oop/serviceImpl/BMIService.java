package com.hanbit.oop.serviceImpl;

public class BMIService {
	private double weight,height,bmi;
	private String result;
	public void setWeight(double weight){
		this.weight=weight;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public void setBmi(){
		bmi=weight/height/height*10000;
	}
	public void setResult(){
		if(bmi<18.5){
			result="저체중";
		}else if(bmi>=18.5&&bmi<23){
			result="보통";
		}else{
			result="과체중";
		}
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	public double getBmi(){
		return bmi;
	}
	public String getResult(){
		return result;
	}
	
}

