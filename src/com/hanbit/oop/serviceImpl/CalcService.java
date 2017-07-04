package com.hanbit.oop.serviceImpl;

public class CalcService {
	private int n1,n2,result;
	private String opcode;
	private double tax;
	public void setN1(int n1){
		this.n1=n1;
	}
	public void setN2(int n2){
		this.n2=n2;
	}
	public void setOpcode(String opcode){
		this.opcode=opcode;
	}
	public void setResult(){
		switch(opcode){
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=(n1>n2)?n1-n2:n2-n1;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=(n1>n2)?n1/n2:n2/n1;
			break;
		}
	}
	public void setTax(int salary){
		this.tax=salary*0.097;
	}
	public int getN1(){
		return n1;
	}
	public int getN2(){
		return n2;
	}
	public int getResult(){
		return result;
	}
	public String getOpcode(){
		return opcode;
	}
	public double getTax(){
		return tax;
	}
	
}
