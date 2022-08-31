package com.aruv.zookeeper2;

public class Bat extends Mammel {

	public Bat() {
		// TODO Auto-generated constructor stub
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("SWOOOOSHHHH");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("AHHHHHHHHHHHHHHHHHHHH!!");
		this.energyLevel += 25;
	}
	
	public void  attackTown() {
		System.out.println("OH MY GOODNESS THE TOWN IS ON FIRE!!!");
		this.energyLevel -= 100;
	}

}
