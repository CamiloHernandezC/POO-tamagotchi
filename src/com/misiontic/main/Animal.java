package com.misiontic.main;

public class Animal extends LivingBeings{
	
	private float 	weight;
	private int 	happiness;	//va de 0 a 100, 0 es triste; 100 es feliz.
	private int 	health;		//va de 0 a 100, 0 muerto, 100 muy saludable.
	private int 	hungry;		//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	private int 	sleep; 		//va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	private boolean awake;
	
	
	//GETTERS
	public float getWeight()	{	return weight;		}
	public int getHappiness() 	{	return happiness;	}
	public int getHealth() 		{	return health;		}
	public int getHungry() 		{	return hungry;		}
	public int getSleep() 		{	return sleep;		}
	public boolean isAwake() 	{	return awake;		}
	
	//SETTERS
	public void setWeight(float weight) 	{	this.weight = weight;		}
	public void setHappiness(int happiness) {	this.happiness = happiness;	}
	public void setHealth(int health) 		{	this.health = health;		}
	public void setHungry(int hungry) 		{	this.hungry = hungry;		}
	public void setSleep(int sleep) 		{	this.sleep = sleep;			}
	
	public Animal(float weight) {
		this.weight 	= weight;
		this.happiness 	= 100;
		this.health 	= 100;
		this.hungry 	= 0;
		this.sleep 		= 0;
		this.awake 		= true;
	}
	
	public Animal(float weight, int happiness) {
		this.weight 	= weight;
		this.happiness 	= happiness;
		this.health 	= 100;
		this.hungry 	= 0;
		this.sleep 		= 0;
		this.awake 		= true;
	}
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	public void eat(Food food) {
		if(awake) {
			weight = weight + 2;
			if(hungry <= food.getCalories()) {
				hungry = 0;
				System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
				health = health -2;			
			}else {
				hungry = hungry - food.getCalories();
			}
		}
	}

	public void makeExercise() {
		if(awake) {
			happiness = happiness + 1;
			hungry = hungry + 10;
			health = health + 3;
			weight = weight - 1;
			sleep = sleep + 5;
		}
		
	}
	public void play() {
		if(awake) {
			sleep = sleep + 5;
			happiness = happiness + 5;
			hungry = hungry + 5;
		}
	}
	
	public void sleep() {
		awake = false;
		sleep = 0;
	}
	
	public void wakeUp() {
		awake = true;
	}

}
