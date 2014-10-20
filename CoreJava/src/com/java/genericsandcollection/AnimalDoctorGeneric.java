package com.java.genericsandcollection;

import java.util.ArrayList;
import java.util.List;



public class AnimalDoctorGeneric {
	public  void checkAnimals(	List<AnimalCheckUp> ani) {
        for (AnimalCheckUp a : ani) {
			a.checkUp();
		}
	}
	
	public static void main(String[] args) {
		List<AnimalCheckUp> ani = new ArrayList<AnimalCheckUp>();
		ani.add(new DogAnimalCheckUp());
		ani.add(new DogAnimalCheckUp());
		ani.add(new CatAnimalCheckUp());
		ani.add(new CatAnimalCheckUp());
		
		AnimalDoctorGeneric adg = new AnimalDoctorGeneric();
		adg.checkAnimals(ani); 
		
	}

}



abstract class AnimalCheckUp {
	public abstract void checkUp();
}

class DogAnimalCheckUp extends AnimalCheckUp {
	public void checkUp() {
		System.out.println("Dog check up ");
	}
}

class CatAnimalCheckUp extends AnimalCheckUp {
	public void checkUp() {
		System.out.println("Cat Check up");
	}
}

class BirdAnimalCheckUp extends AnimalCheckUp {
	public void checkUp() {
		System.out.println("Bird checkup");
	}
}