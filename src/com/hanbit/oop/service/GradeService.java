package com.hanbit.oop.service;

public interface GradeService {
	public void setKor(int kor);
	public void setEng(int eng);
	public void setMath(int math);
	public void setTotal();
	public void setAvg();
	public void setGrade();
	public void setName(String name);
	public void setMajor(String major);
	public int getKor();
	public int getEng();
	public int getMath();
	public int getTotal();
	public String getGrade();
	public String getName();
	public String getMajor();
	public String toString();
}
