package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService{
		MemberBean session;
		public MemberServiceImpl(){
			session=new MemberBean();
		}

	@Override
	public String getGender(MemberBean member) {
		String gender="";
		char ch = member.getSsn().charAt(7);
		switch(ch){
		case '1' : case '3' :
			gender = "남자"; 
			break;
		case '2' : case '4' :
			gender = "여자";
			break;
		case '5' : case '6' :
			gender = "외국인";
			break;
		default :
			gender = "기타";
			break;
		}
		return gender;
	}

	@Override
	public String getAge(MemberBean member) {
		int age=0;
		String birth = member.getSsn().substring(0,2);
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
		return String.valueOf(age);
	}

	@Override
	public String login(MemberBean member) {
		String login="";
		System.out.println("세션에 저장된 아이디 비번" + session.getId() + "/" + session.getPw());
		System.out.println("입력한 아이디 비번"+ member.getId() + "/" + member.getPw());
		if(session.getId().equals(member.getId())&&session.getPw().equals(member.getPw())){
			login="welcome "+session.getName()+"("+getAge(session)+")"+getGender(session);
		}else{
			login="로그인실패";
		}
		return login;
	}

	@Override
	public String join(MemberBean member) {
		String result="환영합니다..";
		System.out.println("회원가입시 사용한 아이디는 "+member.getId());
		System.out.println("회원가입시 사용한 비번은 "+member.getPw());
		System.out.println("회원가입시 사용한 이름은 "+member.getName());
		System.out.println("회원가입시 사용한 SSN은 "+member.getSsn());
		session=member;
		return result;
	}
}
