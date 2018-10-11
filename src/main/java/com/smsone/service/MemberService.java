package com.smsone.service;

import com.smsone.model.Member;

public interface MemberService {
	public void saveMember(Member member);
	public void updateMember(Member member);
	public boolean checkContactNumber(Member member);
	public boolean checkAadharNumber(Member member);
	public boolean checkEmail(Member member);
	public boolean checkMember(Member member);
	public Member checkMemberLogin(Member member);
	public Member verifyMemberAccount(Member member);
	public Member sendNewLink(Member member);
	public Member getMember(Member member);

}
