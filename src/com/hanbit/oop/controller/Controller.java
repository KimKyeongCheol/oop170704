package com.hanbit.oop.controller;
import java.util.Scanner;

import com.hanbit.oop.serviceImpl.BMIService;
import com.hanbit.oop.serviceImpl.CalcService;
import com.hanbit.oop.serviceImpl.GradeServiceImpl;
import com.hanbit.oop.serviceImpl.LeapYearService;
import com.hanbit.oop.serviceImpl.SecondService;

public class Controller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BMIService bs=new BMIService();
		CalcService cal=new CalcService();
		LeapYearService ls=new LeapYearService();
		GradeServiceImpl gs=new GradeServiceImpl();
		SecondService sce=new SecondService();
		
		while (true) {
			System.out.println("select menu...  0.stop 1.bmi 2.tax 3.Calculator 4.LeapYear 5.GradeReport 6.Login 7.SSN 8.Time");
			switch (s.next()) {
			case "0":
				System.out.println("program stop..");
				return;
			case "1":
				System.out.println("input your weight..");
				double weight=s.nextDouble();
				bs.setWeight(weight);
				System.out.println("input your height..");
				double height=s.nextDouble();
				bs.setHeight(height);
				bs.setBmi();
				bs.setResult();
				System.out.println(bs.getResult());
				break;
			case "2" : 
				System.out.println("Write Your Name..");
				String name=s.next();
				System.out.println("Write your Salary..");
				int salary=s.nextInt();
				cal.setTax(salary);
				System.out.println(String.format("%s님께서 납부하실 세금은 %d 원 입니다..", name,cal.getTax()));
				break;
			case "3":
				System.out.println("첫번째 수를 입력해주세요..");
				int n1=s.nextInt();
				cal.setN1(n1);
				System.out.println("두번째 수를 입력해주세요..");
				int n2=s.nextInt();
				cal.setN2(n2);
				System.out.println("opcode를 입력해주세요..");
				String opcode=s.next();
				cal.setOpcode(opcode);
				cal.setResult();
				System.out.println(String.format("결과값 : %d", cal.getResult()));
				break;
			case "4":
				System.out.println("년도를 입력해주세요..");
				int year=s.nextInt();
				ls.setYear(year);
				ls.setResult();
				System.out.println(ls.getResult());
				break;
			case "5":
				System.out.println("what's your name?");
				String name2=s.next();
				gs.setName(name2);
				System.out.println("what's your major?");
				String major=s.next();
				gs.setMajor(major);
				System.out.print("국어점수?\n");
				int kor=s.nextInt();
				gs.setKor(kor);
				System.out.print("영어점수?\n");
				int eng=s.nextInt();
				gs.setEng(eng);
				System.out.print("수학점수?\n");
				int math=s.nextInt();
				gs.setMath(math);
				gs.setGrade();
				System.out.println(gs.toString());
				break;
			case "6":
				System.out.println("ID를 입력해주세요..");
				String id=s.next();
				System.out.println("PW를 입력해주세요..");
				String pw=s.next();
		//		String loginResult=login.excute(id, pw);
		//		System.out.println(loginResult);
				break;
			case "7":
				System.out.println("이름을 입력해주세요..");
				String name3=s.next();
				System.out.println("주민등록번호를 입력해주세요..");
				String ssn=s.next();
			//	String result3=ss.excute(name3, ssn);
			//	System.out.println(result3);
				break;
			case "8":
				System.out.println("초를 입력해주세요..");
				int second=s.nextInt();
				String ment2=sce.excute(second);
				System.out.println(ment2);
				break;
			}
		}
	}
}
