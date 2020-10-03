package controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Scenario {
	
	private PApplet app;
	int posX;
	int posY;
	float parallax;
	PImage stage;
	
	public Scenario (float parallax, PApplet app) {
		this.app = app;
		this.stage = app.loadImage("./data/stage.png");
		
	}
	
	public void parallaxefect () {

	}
	
	
	
	
	
}
