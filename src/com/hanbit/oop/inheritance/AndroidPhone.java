package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	public final static String BRAND="갤럭시노트";
	private String size,appl;
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	@Override
	public String toString(){
		return String.format(" %s이기 때문에 %s 상태로 %s에게 %s번호로 %s을 사용해서 %s 라고 %s을 전송했다",
				KIND,move,name,phoneNo,BRAND,data,appl);
	}
}
