package view;

import controller.Basket;
import controller.Berrie;
import controller.Berrie2;
import controller.Flower;
import controller.RedHood;
import controller.Scenario;
import controller.Wolf;
import processing.core.PApplet;
import processing.core.PImage;



public class Main extends PApplet {

	int screen;
	PImage principalScreen;
	PImage Flower;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	String [] arrayStory;
	Scenario scen;
	RedHood red;
	Wolf wolf;
	Berrie berry;
	Berrie2 berry2;
	Basket bask;
	Flower flow;
	

	
	public void settings() {
		size (900,700);
	}
	
	public void setup () {
		arrayStory = loadStrings("../resources/CaperucitaRoja.txt");
		System.out.println(arrayStory[0]);
		principalScreen = loadImage ("./data/principalScreen.png");
		Flower = loadImage ("./data/Flower.png");
		scen = new Scenario(this); 
		red = new RedHood(150, 284, 0, this);
		wolf = new Wolf(550, 350, 0, this);
		berry = new Berrie (627,380,0,this);
		berry2 = new Berrie2 (402,370,0,this);
		bask = new Basket (409, 543, 0, this);
		flow = new Flower (326,387,0,this);
		
	}
	
	public void draw () {
		background (0);
		
		if(screen == 0) {
			image(principalScreen,0,0);
		}
		
		if(screen == 1) {
			
			scen.paint();
			red.paint();
			wolf.pintar();
			berry.paint();
			berry2.paint();
			bask.paint();
			flow.paint();
			image(Flower,8,497);
			image(Flower,646,497);
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
		
		saveStrings("nouns.txt", arrayStory);
	}
	
	public void mouseClicked() {
		switch (screen) {
		case 0:
			if (mouseX > 749 && mouseX < 841 && mouseY > 581 && mouseY < 652) {
				screen = 1;
				editStory();
			}
		
		break;
		
		}
		
	}

}
