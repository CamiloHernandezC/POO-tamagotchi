package com.misiontic.main;

public class Reptile extends Animal{

	private float temperature;
	
	public Reptile(float weight) {
		this(weight, 100);
	}
	
	public Reptile(float weight, int happiness) {
		super(weight, happiness);
		temperature = 35;
	}

	
	private void takeSun() {
		temperature+=2;
	}
	
	private void getCool() {
		temperature-=2;
	}


	@Override
	public void eat(Food food) {
		if(isAwake()) {
			super.eat(food);
			temperature--;
		}
	}


	@Override
	public void makeExercise() {
		if(isAwake()) {
			super.makeExercise();
			temperature++;
		}
	}


	@Override
	public void play() {
		if(isAwake()) {
			super.play();
			temperature++;
		}
	}


	@Override
	public void sleep() {
		super.sleep();
		temperature = 35;
	}
	
	
	
}
