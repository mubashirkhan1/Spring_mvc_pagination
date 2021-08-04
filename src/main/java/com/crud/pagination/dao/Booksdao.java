package com.crud.pagination.dao;

import java.util.List;

import com.crud.pagination.model.Books;



public interface Booksdao 
{

	public String insert(Books obj);
	public void update(int id);
	public void delete(int id);
	public  List<Books> showall();
	public Books showbyid(int id);
	
	
}
