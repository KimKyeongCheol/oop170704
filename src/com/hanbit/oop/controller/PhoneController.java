package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone=new Phone();
		CellPhone nokia=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone galaxy=new AndroidPhone();
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.전화걸기 2.핸드폰 3.아이폰 4.갤럭시")){
			case "0":
				return;
			case "1":
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				phone.setBrand(JOptionPane.showInputDialog("브랜드?"));
				phone.setCall(JOptionPane.showInputDialog("뭐라고 통화?"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("이름?"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				nokia.setBrand(JOptionPane.showInputDialog("브랜드?"));
				nokia.setCall(JOptionPane.showInputDialog("뭐라고 통화?"));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null,nokia.toString());
				break;
			case "3":
				iphone.setName(JOptionPane.showInputDialog("이름?"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				iphone.setData(JOptionPane.showInputDialog("뭐라고 문자?"));
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			case "4":
				galaxy.setName(JOptionPane.showInputDialog("이름?"));
				galaxy.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				galaxy.setData(JOptionPane.showInputDialog("뭐라고 문자?"));
				galaxy.setAppl(JOptionPane.showInputDialog("어플이름은?"));
				JOptionPane.showMessageDialog(null,galaxy.toString());
				break;
			}
		}
	}
}
