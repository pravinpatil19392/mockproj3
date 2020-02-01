package com.nt.domain;

public class Contact {
private int id;
private String name;
private Long mno;
public Contact(int id, String name, Long mno) {
	
	this.id = id;
	this.name = name;
	this.mno = mno;
}
@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", mno=" + mno + "]";
}

}
