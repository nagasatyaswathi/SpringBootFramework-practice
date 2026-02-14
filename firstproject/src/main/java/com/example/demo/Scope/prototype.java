package com.example.demo.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component
@Scope(value="prototype")
public class prototype {
	
	public prototype() {
		super();
		System.out.println("hai call me i am prototype object you can create many times based on your choice");
	}

	public void call() {
		System.out.println("created prototype");
	}
	

}
