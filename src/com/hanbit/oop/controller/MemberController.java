package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.domain.RankingBean;
import com.hanbit.oop.serviceImpl.CalendarService;
import com.hanbit.oop.serviceImpl.MemberServiceImpl;
import com.hanbit.oop.serviceImpl.RankingService;

public class MemberController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberServiceImpl ms=new MemberServiceImpl();
		CalendarService cs=new CalendarService();
		MemberBean member=new MemberBean();
		RankingBean ranking=new RankingBean();
		RankingService rs=new RankingService();
		while(true){
			System.out.println("0.end 1.join 2.login 3.Ranking");
			switch (s.next()) {
			case "0" :
				System.out.println("System 종료...");
				return;
			case "1":
				System.out.println("Input Name..");
				String name=s.next();
				System.out.println("Input ID..");
				String id=s.next();
				System.out.println("Input PW..");
				String pw=s.next();
				System.out.println("Input SSN..");
				String ssn=s.next();
				member.setName(name);
				member.setId(id);
				member.setPw(pw);
				member.setSsn(ssn);
				System.out.println(ms.join(member));
				break;
			case "2":
				MemberBean tempMember=new MemberBean();
				System.out.println("Input ID...");
				String InputId=s.next();
				System.out.println("Input PW...");
				String InputPw=s.next();
				
				tempMember.setId(InputId);
				tempMember.setPw(InputPw);
				
				System.out.println(ms.login(tempMember));
				break;
			case "3":
				System.out.println("Input first number");
				int n1=s.nextInt();
				System.out.println("Input second number");
				int n2=s.nextInt();	
				System.out.println("Input third number");
				int n3=s.nextInt();
				ranking.setN1(n1);
				ranking.setN2(n2);
				ranking.setN3(n3);
				System.out.println(rs.getRanking(ranking));
				break;
			}
		}
	}
}
