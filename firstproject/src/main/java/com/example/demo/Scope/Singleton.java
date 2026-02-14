package com.example.demo.Scope;
import org.springframework.stereotype.Component;

@Component

public class Singleton {
	
	public Singleton() {
		super();
		System.out.println("hai call me i get created only once even you created me twice");
	}

	public void call() {
		System.out.println(" singleton created");
	}
}
