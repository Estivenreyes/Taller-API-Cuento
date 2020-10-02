package view;
import processing.core.PApplet;
import processing.core.PImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends PApplet {

	int screen;
	PImage principalScreen;
	
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	String [] arrayStory;
	
	

	
	public void settings() {
		size (900,700);
	}
	
	public void setup () {
		arrayStory = loadStrings("../resources/CaperucitaRoja.txt");
		System.out.println(arrayStory.length);
		
		principalScreen = loadImage ("./data/principalScreen.png");
		
	}
	
	public void draw () {
		background (0);
		
		if(screen == 0) {
			image(principalScreen,0,0);
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
