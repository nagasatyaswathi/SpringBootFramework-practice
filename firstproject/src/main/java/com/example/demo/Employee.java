package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope; 
@Component

public class Employee {
	private int id;
	private String name;
	private String domain;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	public Employee() {
		super();
		System.out.println("object created..");
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void call()
	{
		System.out.println("in call");
		laptop.lap1();
	}
	
}
