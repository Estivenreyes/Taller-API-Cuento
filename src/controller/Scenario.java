package controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Scenario {
	
	private PApplet app;
	int posX;
	int posY;
	float parallax;
	PImage stage;
	PImage scenario1;
	
	public Scenario (PApplet app) {
		this.app = app;
		this.stage = app.loadImage("./data/stage.png");
		this.scenario1 = app.loadImage("./data/scenario1.png");
		
	}
	
	public void paint () {
		app.image (stage,-1999,posY);

	}
	
	
	
	
	
}
