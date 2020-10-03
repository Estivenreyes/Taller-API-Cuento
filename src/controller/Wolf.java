package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Wolf extends Object {
	
	private int index;
	PImage wolf;
	PImage wolfeed;

	public Wolf(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		index = 0;
		this.wolf = app.loadImage("./data/wolf.png");
		this.wolfeed = app.loadImage("./data/wolfeed.png");

	}
	
	public void pintar() {
		switch(index) {
		case 0:
			app.image(this.wolf,posX,posY);
			
		break;

		case 1:
			boolean over;
			if(app.mouseX > posX && app.mouseX < posX + 203
					&& app.mouseY > posY && app.mouseY < posY + 332) {
				over = true;
			} else {
				over = false;
			}
			
			if(over) {
				app.image(this.wolfeed,posX,posY);
			}else {
				app.image(this.wolf,posX,posY);
			}
	}


	}
	
}
