package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.MemberDAO;
import com.smsone.model.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO memberDAO;

	public void saveMember(Member member) {
		memberDAO.saveMember(member);
	}
	public Member checkMemberLogin(Member member) {

		return memberDAO.checkMemberLogin(member);
	}
	public void updateMember(Member member) {
		memberDAO.updateMember(member);
	}
	public boolean checkContactNumber(Member member) {
		return memberDAO.checkContactNumber(member);
	}
	public boolean checkAadharNumber(Member member) {
		return memberDAO.checkAadharNumber(member);
	}
	public boolean checkEmail(Member member) {
		return memberDAO.checkEmail(member);
	}
	public Member verifyMemberAccount(Member member) {
		return memberDAO.verifyMemberAccount(member);
	}
	public Member sendNewLink(Member member) {
		return memberDAO.sendNewLink(member);
	}
	public Member getMember(Member member) {
		return memberDAO.getMember(member);
	}
	public boolean checkMember(Member member) {
		
		return memberDAO.checkMember(member);
	}

}
