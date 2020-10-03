package controller;
import processing.core.PApplet;
	

public class Object {
	
	protected PApplet app;
	float posX;
	float posY;
	int dirX;
	int dirY;
	

	public Object (float posX, float posY, int dirX, PApplet app) {
		
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.dirX = dirX;
			
	}

}
 