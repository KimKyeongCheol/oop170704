package com.hanbit.oop.serviceImpl;

public class SecondService {
	public String excute(int second){
		int hour=second/3600;
		int minute=(second-hour*3600)/60;
		int second2=second-hour*3600-minute*60;
		
		String ment=hour+"시간 " + minute + "분 " + second2 + "초";
		return ment;
	}
}
