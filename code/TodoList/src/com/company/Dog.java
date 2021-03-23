package com.company;

public class Dog {

	//ter duas variaveis privadas sound e breed
	private String sound;
	private String breed;
	
	//getter e setter para sound e breed
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//construtor padrao
	public Dog()
	{
		
	}
	
	//construtor para receber sound e breed
	public Dog(String s, String br)
	{
		this.sound = s;
		this.breed = br;
	}

}
