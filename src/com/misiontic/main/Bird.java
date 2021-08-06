package com.misiontic.main;

public class Bird extends Animal {

	public Bird(float weight) {
		super(weight);
	}
	
	public Bird(float weight, int happiness) {
		super(weight, happiness);
	}

	public void fly() {
		setSleep(getSleep()+2);
		setHungry(getHungry()+4);
		setWeight(getWeight()-0.5F);
	}
	
	

}
