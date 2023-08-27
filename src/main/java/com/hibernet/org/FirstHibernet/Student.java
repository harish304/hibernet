package com.hibernet.org.FirstHibernet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private int Id;
	private FullName Name;
	private String Address;
	public void setId(int Id) {
		this.Id =Id;
	}
	public int getId() {
		return Id;
	}
	

	public FullName getName() {
		return Name;
	}
	public void setName(FullName name) {
		Name = name;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress( ) {
		return Address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	

	
	}
