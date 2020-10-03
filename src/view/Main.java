package view;

import controller.RedHood;
import controller.Scenario;
import processing.core.PApplet;
import processing.core.PImage;



public class Main extends PApplet {

	int screen;
	PImage principalScreen;
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	String [] arrayStory;
	Scenario scen;
	RedHood red;
	

	
	public void settings() {
		size (900,700);
	}
	
	public void setup () {
		arrayStory = loadStrings("../resources/CaperucitaRoja.txt");
		System.out.println(arrayStory[0]);
		principalScreen = loadImage ("./data/principalScreen.png");
		scen = new Scenario(this); 
		//red = new RedHood(this);
		
	}
	
	public void draw () {
		background (0);
		
		if(screen == 0) {
			image(principalScreen,0,0);
			editStory();
		}
		
		if(screen == 1) {
			scen.paint();
			//red.paint();
			
		}
		
		
	}
	
	public void editStory () {
		for (int i = 0; i < arrayStory .length; i++) {
			while(arrayStory[i].contains("Caperucita")) {
				arrayStory[i] = arrayStory[i].replace("Caperucita", "CAPERUCITA");
			}
			
			while(arrayStory[i].contains("lobo")) {
				arrayStory[i] = arrayStory[i].replace("lobo", "WOLF");
			}
			
			while(arrayStory[i].contains("cesta")) {
				arrayStory[i] = arrayStory[i].replace("cesta", "CANASTA");
			}
			
			while(arrayStory[i].contains("flores")) {
				arrayStory[i] = arrayStory[i].replace("flores", "FLOWERS");
			}
			
			while(arrayStory[i].contains("avellanas")) {
				arrayStory[i] = arrayStory[i].replace("avellanas", "BERRIES");
			}
	
		}
	}
	
	public void mouseClicked() {
		switch (screen) {
		case 0:
			if (mouseX > 749 && mouseX < 841 && mouseY > 581 && mouseY < 652) {
				screen = 1;
			}
		
		break;
		
		}
		
	}

}
