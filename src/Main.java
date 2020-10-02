import processing.core.PApplet;
import processing.core.PImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends PApplet{
	
	PImage principalScreen;
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	String [] arrayStory;
	int screen;
	

	
	public void settings() {
		size (900,700);
	}
	
	public void setup () {
		arrayStory = loadStrings("../resources/CaperucitaRoja.txt");
		System.out.println(arrayStory.length);
	}
	
	public void draw () {
		
		
	}

}
