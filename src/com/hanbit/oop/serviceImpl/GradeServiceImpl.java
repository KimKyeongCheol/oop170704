package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService {
	int kor,eng,math,total,avg;
	String grade,name,major;
	@Override
	public void setKor(int kor) {
		this.kor=kor;
	}
	@Override
	public void setEng(int eng) {
		this.eng=eng;
	}
	@Override
	public void setMath(int math) {
		this.math=math;
	}
	@Override
	public void setTotal() {
		this.total=kor+eng+math;
	}
	@Override
	public void setAvg() {
		this.avg=total/3;
	}
	@Override
	public void setGrade() {
		switch(avg/10){
			case 9 :
			case 10 :
				grade=" A학점입니다. 장학금 대상입니다 !"; 
				break;
			case 8 :
				grade="B학점입니다. 3학점이수 성공!";
				break;
			case 7 :
				grade="C학점입니다. 2학점 이수 성공!"; 
				break;
			case 6 :
				grade="D학점입니다. 1학점 이수 성공!";
				break;
			case 5 :
				grade="E학점입니다. ";
			default :
				grade="학사경고 !"; 
				break;
		}
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void setMajor(String major) {
		this.major=major;
	}
	@Override
	public int getKor() {
		return kor;
	}
	@Override
	public int getEng() {
		return eng;
	}
	@Override
	public int getMath() {
		return math;
	}
	@Override
	public int getTotal() {
		return total;
	}
	@Override
	public String getGrade() {
		return grade;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getMajor() {
		return major;
	}
}
