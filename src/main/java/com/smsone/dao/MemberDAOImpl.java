package com.smsone.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.Member;
import com.smsone.model.Owner;
import com.smsone.model.User;

@Repository

public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SessionFactory sessionFactory;

	//save member
	public void saveMember(Member member) {
		Session session=sessionFactory.openSession();
		session.save(member);
		session.close();
		
	}

	public Member checkMemberLogin(Member member) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("email",member.getEmail());
		Criterion c2=Restrictions.eq("password",member.getPassword());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			member=(Member)list.get(0);
		return member;
		}		
	
	}

	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		
	}

	public boolean checkContactNumber(Member member) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("contactNumber",member.getContactNumber());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		} 
		else
		{
		return true;
		}
	}

	public boolean checkAadharNumber(Member member) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("aadharNumber",member.getAadharNumber());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
		return true;
		}
	}

	public boolean checkEmail(Member member) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("email",member.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
		return true;
		}
	}

	public Member verifyMemberAccount(Member member) {
		Date date=new Date(); 
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("email",member.getEmail());
		Criterion c2=Restrictions.eq("memberHashcode",member.getMemberHashcode());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			member=(Member)list.get(0);
			Date memberDate=member.getMemberCreation_date();
			long duration=date.getTime()-memberDate.getTime();
			Transaction tx=session.beginTransaction();
			String status=member.getMemberStatus();
			if(status==null)
			{
				if(duration>60000)
			   {
					member.setMemberStatus("Expired");
			   }
			   else
			   {
				   member.setMemberStatus("Activated");
			   }
			}
			else if(status.equals("Activated"))
			{	
			}
			else
			{
				member.setMemberStatus("Expired");
			}
			session.save(member);
			tx.commit();
			session.close();
			return member;
		}
	}

	public Member sendNewLink(Member member) {
		Date date=new Date();
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("email",member.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			Member member1=(Member)list.get(0);
			Transaction tx=session.beginTransaction();
			if(member.getEmailResendTime()!=null)
			{
				member.setMemberHashcode(member.getMemberHashcode());
				member1.setEmailResendTime(member.getEmailResendTime());
			}
			else
			{
				Date emailResendDate=member1.getEmailResendTime();
				long duration=date.getTime()-emailResendDate.getTime();

				if(duration>60000)
				{
					member1.setMemberStatus("Expired");
				}
				else
				{
					member1.setMemberStatus("Activated");
				}
			}	
			session.save(member1);
			tx.commit();
			session.close();
			return member1;
		}
	}

	public Member getMember(Member member) {
		Session session=sessionFactory.openSession();
		Member member1=(Member)session.load(Member.class,member.getmId());
		return member1;
	}

	public boolean checkMember(Member member) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Member.class);
		Criterion c1=Restrictions.eq("mId",member.getmId());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Member> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
		return true;
		}
	}
}
