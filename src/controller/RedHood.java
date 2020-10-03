package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class RedHood extends Object{
	
	private PApplet app;
	PImage redHood1;
	PImage redHoodbasket;
	PImage redHoodbasket1;
	PImage redHoodbasket2;
	PImage redHoodbasket3;
	PImage redhoodbasketfeed;
	
	public RedHood(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		this.redHood1 = app.loadImage("./data/redHood1.png");
	
	}
	
	public void paint() {
		app.image(this.redHood1,174,299);
	} 
	
	public void move () {
		
	}

}
