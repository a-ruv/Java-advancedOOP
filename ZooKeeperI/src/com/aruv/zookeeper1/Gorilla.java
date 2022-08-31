package com.aruv.zookeeper1;

public class Gorilla extends Mammel{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("Gorilla throws a banana.");
		this.energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("It looks like the gorilla is eating a banana.");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Woah!! Did you see the gorilla climb up the tree ?!");
		this.energyLevel -=10;
	}
}
