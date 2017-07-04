package com.hanbit.oop.serviceImpl;


import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{
	int count;
	MemberBean member;
	MemberBean[] members;
	MemberBean[] MemberCnt;
	
	
	public AdminServiceImpl(int sCount) {
		count=0;
		member=new MemberBean();
		members=new MemberBean[sCount];
	}
	@Override
	public void addMember(MemberBean member) {
		/*setCount();
		members[getCount()-1]=member;*/
		members[count]=member;
		for(int i=0;i<(count+1);i++){
			System.out.println(members[i].toString());
		}
		count++;
	}
	@Override
	public MemberBean[] getMembers() {
		return members;
	}
	@Override
	public int countMembers() {
		return members.length;
	}
	public void setCount(){
		count++;
	}
	public int getCount(){
		return count;
	}
	public String toString(){
		String memberList="";
		for(int i=0;i<count;i++){
			memberList+=members[i].getId()+"/ "+members[i].getName()+"/ "+members[i].getSsn()+"\n";
		}
		return memberList;
	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member=null;
		//member=new MemberBean();
		for(int j=0;j<members.length;j++){
		if(id.equals(members[j].getId())){
			member=members[j];
			
		}
	}
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		int cnt=0;
		for(int i=0;i<members.length;i++){
			if(name.equals(members[i].getName())){
				cnt++;
			}
		}
		MemberBean[] mem=new MemberBean[cnt];
		int num=0;
		for(int i=0;i<members.length;i++){
			if(name.equals(members[i].getName())){
				mem[num]=members[i];
				num++;
			}
			if(cnt==num){
				break;
			}
		}
		return mem;
	
	
	}
	@Override
	public void updatePass(MemberBean member) {
		MemberBean temp=new MemberBean();
		temp=findById(member.getId());
		temp.setPw(member.getPw());
		
		
	}
}
