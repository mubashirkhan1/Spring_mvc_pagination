package com.crud.pagination.dao;

import java.util.List;
import    javax.persistence.*;

import javax.transaction.Transactional;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.crud.pagination.model.Books;

@Repository
public class Bookdaoimple{
	@Autowired
	private HibernateTemplate templet;
	
	


	public HibernateTemplate getTemplet() {
		return templet;
	}


	public void setTemplet(HibernateTemplate templet) {
		this.templet = templet;
	}


	@Transactional
	public String insert(Books obj) {
		this.templet.saveOrUpdate(obj);
	
		return "Success insert";
	}


	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

    @Transactional
	public void delete(int id) {
    	Books book=this.templet.load(Books.class, id);
		this.templet.delete(book);
		
	}


	public List<Books> showall() {
		List<Books> obj=	this.templet.loadAll(Books.class);
		return obj;
	}


	public Books showbyid(int id) {
		Books book=this.templet.get(Books.class,id);
		return book;
	}
	
	public List<Books> grtbooklimit(Integer pageno)
	{
		Session s=this.templet.getSessionFactory().openSession();
	   Query<Books> Query=	s.createQuery("from Books");
	   
	   Integer page=(pageno-1)*4;
	   Query.setFirstResult(page);
	   Query.setMaxResults(4);
	    List<Books>  list=Query.list();
	    s.close();
		
	    return list;
	   
		
	}

	
}
