package com.example.demo.Scope;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.FirstprojectApplication;
@SpringBootApplication

public class ScopeUnderstand {
	public static void main(String args[]) {
		ConfigurableApplicationContext c=SpringApplication.run(FirstprojectApplication.class, args);
		Singleton s=c.getBean(Singleton.class);
		s.call();
		Singleton s2=c.getBean(Singleton.class);
		s2.call();
		System.out.println("............break...........");

		prototype p=c.getBean(prototype.class);
		prototype p2=c.getBean(prototype.class);
		p.call();
		p2.call();
		
	}

}
