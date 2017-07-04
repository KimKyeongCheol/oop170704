package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.RankingBean;

public class RankingService {
	public RankingService(){
		
	}
	public String getRanking(RankingBean ranking){
		int[] numbers=new int[3];
		numbers[0]=ranking.getN1();
		numbers[1]=ranking.getN2();
		numbers[2]=ranking.getN3();
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				numbers[i]=(numbers[i]>numbers[j])?numbers[i]:numbers[j];
			}
		}
		ranking.setFirst(numbers[0]);
		ranking.setSecond(numbers[1]);
		ranking.setThird(numbers[2]);
		return "1등 : "+ranking.getFirst()+"/ 2등: "+ranking.getSecond()+" /3등: "+ranking.getThird();
	}
}
