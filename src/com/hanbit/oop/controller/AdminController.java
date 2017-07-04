package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		AdminService service=new AdminServiceImpl(Integer.parseInt(sCount));
		MemberBean member=null;
		
		
		while(true){
		 
			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기 4.조회(ID) 5.조회(이름) 6.수정")){
			case "0":
				return;
			case "1":
				member=new MemberBean();
				String[] arr=JOptionPane.showInputDialog("NAME/ID/Pass/Ssn").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null,"회원가입성공 !");
				break;
			case "2":
				JOptionPane.showConfirmDialog(null,service.countMembers()+"명");
				break;
			case "3":
				JOptionPane.showConfirmDialog(null, service.toString());
				break;
			case "4":
				JOptionPane.showConfirmDialog(null, service.findById(JOptionPane.showInputDialog("조회하려는 아이디를 입력해주세요.")).toString());
 				break;
			case "5":
				String name=JOptionPane.showInputDialog("이름");
				MemberBean[] mb=service.findByName(name);
				String result="";
				if(mb.length==0){
					result="조회한 이름이 없습니다.";
				}else {
					for(int i=0;i<mb.length;i++)
					{
						result+=mb[i].toString()+"\n";
					}
				}
				
				JOptionPane.showConfirmDialog(null, result);
				break;
			case "6":
				MemberBean temp=new MemberBean();
				String name1=JOptionPane.showInputDialog("ID입력");
				String pass=JOptionPane.showInputDialog("비밀번호를 입력");
				temp.setId(name1);
				temp.setPw(pass);
				service.updatePass(temp);
				
				JOptionPane.showMessageDialog(null,"변경성공 !");
			break;
			}
		}
	}
}
