package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop{
	private String brand;
	private double speed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", speed=" + speed + "]";
	}
	public void lap1() {
		System.out.println("lap 1 belongs to employee 1");
		
	}
	
	
}