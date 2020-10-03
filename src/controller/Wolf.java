package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Wolf extends Object {
	
	PImage wolf;
	PImage wolfeed;

	public Wolf(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
	}
	
	void pintar() {
		this.wolf = app.loadImage("./data/wolf.png");
	}


}
