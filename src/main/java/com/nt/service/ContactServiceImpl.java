package com.nt.service;



import com.nt.dao.ContactDao;


public class ContactServiceImpl implements ContactService{
      private  ContactDao dao;
      
	public void setDao(ContactDao dao) {
		this.dao = dao;
	}

	public String getContact(String name) {
		
		return dao.findContact(name);
	}

}
