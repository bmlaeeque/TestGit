package com.smsone.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Owner;
import com.smsone.model.Room;
import com.smsone.model.User;
@Repository
@Transactional
public class HouseDAOImpl implements HouseDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save house
	/*public void saveHouse(House house,Long oId) {
		Session session=sessionFactory.openSession();
		session.save(house);
	session.close();
	}*/
	//getting house
	@SuppressWarnings("unchecked")
	@Transactional
	public List<House> list(Integer offset, Integer maxResults) {
		return sessionFactory.openSession()
				.createCriteria(House.class)
				.setFirstResult(offset!=null?offset:0)
				.setMaxResults(maxResults!=null?maxResults:10)
				.list();
	}
	
	public House getHouse(House house) {
		Session session=sessionFactory.openSession();
		House loadHouse=(House)session.load(House.class,house.gethId());
		return loadHouse;
	}
	public List<House> listHouse(House house, Integer offset, Integer maxResults) {
		Session session=sessionFactory.openSession();
		Criteria criteria = session.createCriteria(House.class);
		criteria.setFirstResult(offset!=null?offset:0);
		criteria.setMaxResults(maxResults!=null?maxResults:10);
		criteria.add(Restrictions.like("city","%"+house.getAddress()+"%"));
		@SuppressWarnings("unchecked")
		List<House> house1 = criteria.list();
		
		return house1;
	}
	public boolean checkAadharNumber(House house) {
			Session session=sessionFactory.openSession();
			Criteria crit=session.createCriteria(House.class);
			//Criterion c1=Restrictions.eq("aadharNumber",house.getAadharNumber());
			//crit.add(c1);
			@SuppressWarnings("unchecked")
			List<User> list=crit.list();
			if(list.isEmpty())
			{
				return false;
			}
			else
			{
			return true;
			}
		}
	
	//counting house
		public Long count(){
			return (Long)sessionFactory.openSession()
					.createCriteria(House.class)
					.setProjection(Projections.rowCount())
					.uniqueResult();
		}
		public Long countByFilter(House house) {
			Session session=sessionFactory.openSession();
			Query query = session.createQuery(
			        "select count(*) from House h where h.address=:address");
			query.setString("address",house.getAddress());
			Long count = (Long)query.uniqueResult();
			return count;
		}
		public Long countAllFilter(House house) {
			Session session=sessionFactory.openSession();
			Query query = session.createQuery(
			        "select count(*) from House h where h.locationArea=:locationArea and h.foodPreference=:foodPreference and h.rent>1000=:rent");
			query.setString("address",house.getLocationArea());
			//query.setString("accomodation",house.getAccomodation());
			query.setString("foodPreference",house.getFoodPreference());
			if(house.getRent()==1000)
			{
				query.setDouble("rent",(double)1000);
			}
			else if(house.getRent()==1500)
			{
				query.setDouble("rent",(double)1000);
			}
			else if(house.getRent()==2500)
			{
				query.setDouble("rent",(double)1000);
				
			}
			else if(house.getRent()==3000)
			{
				query.setDouble("rent",(double)1000);
			}
			else if(house.getRent()==100)
			{
				query.setDouble("rent",(double)1000);
			}
			Long count = (Long)query.uniqueResult();
			return count;
		}
		public List<House> listHouseByFilters(House house, Integer offset, Integer maxResults) {
			Session session=sessionFactory.openSession();
			Criteria criteria = session.createCriteria(House.class);
			criteria.setFirstResult(offset!=null?offset:0);
			criteria.setMaxResults(maxResults!=null?maxResults:10);
			criteria.add(Restrictions.like("foodPreference","%"+house.getFoodPreference()+"%"));
			@SuppressWarnings("unchecked")
			List<House> house1 = criteria.list();
			
			return house1;
		}
		public List<House> listHouseByadvancedFilter(String[] facilities) {
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Job where id not in (select hId from Room where )");
			return null;
		}
		//save house with owner
		public void saveHouse(House house,Long oId) {
			Session session=sessionFactory.openSession();
			Owner owner=(Owner)session.load(Owner.class,oId);
			house.setOwner(owner);
			session.save(house);
			session.close();
		}
		public List<House> listHouseByFilter(House house, Integer offset, Integer maxResults) {
			Criterion c3=null;
			Session session=sessionFactory.openSession();
			Criteria criteria = session.createCriteria(House.class);
			criteria.setFirstResult(offset!=null?offset:0);
			criteria.setMaxResults(maxResults!=null?maxResults:10);
			Criterion c1=Restrictions.eq("locationArea",house.getLocationArea());
			//Criterion c2=Restrictions.eq("accomodation",house.getAccomodation());
			if(house.getRent()==1000)
			{
			 c3=Restrictions.le("rent",(double)1000);
			}
			else if(house.getRent()==1500)
			{
				Criterion c8=Restrictions.ge("rent",(double)1000);
				Criterion c9=Restrictions.le("rent",(double)2000);
				 c3=Restrictions.and(c8,c9);
			}
			else if(house.getRent()==2500)
			{
				Criterion c8=Restrictions.ge("rent",(double)2000);
				Criterion c9=Restrictions.le("rent",(double)3000);
				 c3=Restrictions.and(c8,c9);
			}
			else if(house.getRent()==3000)
			{
			 c3=Restrictions.ge("rent",(double)3000);
			}
			else if(house.getRent()==100)
			{
				c3=Restrictions.ge("rent",(double)100);
			}
			Criterion c4=Restrictions.eq("foodPreference",house.getFoodPreference());
			Criterion c5=Restrictions.and(c1,c4,c3);
			criteria.add(c5);
			@SuppressWarnings("unchecked")
			List<House> house1 = criteria.list();
			return house1;
		}		
		public List<House> listHouseByadvancedFilter(House house, User user, Integer offset, Integer maxResults,
				String[] facilities) {
			Session session=sessionFactory.openSession();
			Criteria criteria = session.createCriteria(House.class);
			criteria.setFirstResult(offset!=null?offset:0);
			criteria.setMaxResults(maxResults!=null?maxResults:10);
			Criterion c1=Restrictions.eq("locationArea",house.getLocationArea());			
			return null;
		}
		public void saveBed(Beds beds,Long rid) {
			Session session=sessionFactory.openSession();
			Room room=(Room)session.load(Room.class,rid);
			beds.setRoom(room);
			session.save(beds);
			session.close();	
		}
		public void updateHouse(House house) 
		{			
			Session session=sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(house);
			tx.commit();
		    session.close();		 	
		}
		public void deleteHouse(House house) {
			Session session=sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			House house1=(House)session.load(House.class,house.gethId());
			session.delete(house1);
			tx.commit();
			session.close();		 
		}
		public List<House> remainingOwnerHouse(Long oId) {
			Session session=sessionFactory.openSession();
			@SuppressWarnings("unchecked")
			Owner owner=(Owner)session.load(Owner.class,oId);
			List<House> house1=owner.getHouse();
			return house1;
		}

		public List<Room> getRooms(House house) {
			Session session=sessionFactory.openSession();
			House house1=(House)session.load(House.class,house.gethId());
			List<Room> room=house1.getRooms();
			return room;
		}

		public List<House> applySorting(House house,User user) {
			
			return null;
		}
}
