package com.crud.pagination.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.pagination.dao.Bookdaoimple;
import com.crud.pagination.model.Books;

@Service
public class Bookservice {
	
	@Autowired
	private Bookdaoimple bookimple;
	public String insert(Books obj) 
	{	
		this.bookimple.insert(obj);
		return "success";
	}
	public List<Books> showall()
	{
		
		List<Books> obj=this.bookimple.showall();
		return obj;
		
	}
	//delete service method
	public void delete(int id)
	{
		this.bookimple.delete(id);
	}
	//sgow by id
	public Books showbyid(int id) {
		return this.bookimple.showbyid(id);
	
	}
	
	public List<Books> getbooklimit(Integer pageno)
	{
		List<Books> list=this.bookimple.grtbooklimit(pageno);
		return list;
	}
	

}
