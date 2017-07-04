package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member);
	public MemberBean[] getMembers();
	public int countMembers();
	public int getCount();
	public void setCount();
	public MemberBean findById(String id);
	public MemberBean[] findByName(String name);
	public void updatePass(MemberBean member);
}
