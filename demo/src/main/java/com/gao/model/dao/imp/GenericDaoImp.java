package com.gao.model.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.gao.model.dao.IGenericDao;

public class GenericDaoImp<T,ID> implements IGenericDao<T, ID>{

	private SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    private Session session = sessionFactory.openSession();
    
	public void create(T object) {
		getSession().beginTransaction();
		getSession().save(object);
		getSession().getTransaction().commit();
		
	}

	public void update(T object) {
		getSession().beginTransaction();
		getSession().update(object);
		getSession().getTransaction().commit();
	}

	public void delete(T object) {
		getSession().beginTransaction();
		getSession().delete(object);
		getSession().getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(Class<T> type) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(type);
		return criteria.list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return session;
	}

}
