package com.nt.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nt.dao.ContactDao;
import com.nt.service.ContactServiceImpl;

public class MockTest {
	private static ContactServiceImpl tservice;
	@BeforeClass
	public static void setUp() {
		 tservice = new ContactServiceImpl() ;
	}
 @Test
	public void testGetContactByName() {
	
		//ContactServiceImpl tservice=new ContactServiceImpl() ;
	 ContactDao tdao=EasyMock.createMock(ContactDao.class);
		tservice.setDao(tdao);
		EasyMock.expect(tdao.findContact("john")).andReturn("789");
		//EasyMock.expect(tdao.findContactByName("john")).andReturn(null);
		EasyMock.replay(tdao);
	String msg=	tservice.getContact("john");
	//assertNotNull(msg);
	assertNotNull(msg);
	}
// @Test
// public void testGetAllContact() {
//	 List<Contact> contactList=new ArrayList<Contact>();
//	// contactList.add(new Contact(10,"pr",789l));
//	// contactList.add(new Contact(11,"avin",689l));
//	 ServiceDao dao=EasyMock.createMock(ServiceDao.class);
//	 tservice.setDao(dao);
//	 EasyMock.expect(dao.findAll()).andReturn(contactList);
//	 EasyMock.replay(dao);
//	  List<Contact> allContact = tservice.getAllContact();
//	  assertNotNull(allContact);  
// }
 public static void closeObj() {
	 tservice=null;
 }
}
