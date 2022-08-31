package com.aruv.zookeeper1;

public class Mammel {

protected int energyLevel;

public Mammel() {
	this.energyLevel = 100;
}

public int displayEnergy() {
	System.out.printf("Energy Level: %s", energyLevel);
	return energyLevel;
}



}
