package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Flower extends Object{
	
	private int index;
	PImage Flower;
	PImage Flowerfeed;
	
	public Flower(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		index = 1;
		this.Flower = app.loadImage("./data/Flower.png");
		this.Flowerfeed = app.loadImage("./data/Flowerfeed.png");
		
	}
	
	public void paint() {
		switch(index) {
		case 0:
			app.image(this.Flower,posX,posY);
			
		break;

		case 1:
			boolean over;
			if(app.mouseX > posX && app.mouseX < posX + 50
					&& app.mouseY > posY && app.mouseY < posY + 50) {
				over = true;
			} else {
				over = false;
			}
			
			if(over) {
				app.image(this.Flowerfeed,posX,posY);
			}else {
				app.image(this.Flower,posX,posY);
			}
		}
	}


}
