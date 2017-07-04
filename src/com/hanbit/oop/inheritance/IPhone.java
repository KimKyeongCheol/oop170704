package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	public final static String KIND="스마트폰";
	public final static String BRAND="아이폰";
	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		return String.format(" %s이기 때문에 %s 상태로 %s에게 %s번호로 %s을 사용해서 %s 라고 문자를 전송했다",
				KIND,move,name,phoneNo,BRAND,data);
	}
}
