package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface MemberService {
	public String getGender(MemberBean member);
	public String getAge(MemberBean member);
	public String join(MemberBean member);
	public String login(MemberBean member);
}
