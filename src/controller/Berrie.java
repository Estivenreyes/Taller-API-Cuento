package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Berrie extends Object{
	
	private int index;
	PImage berrie1;
	PImage berriefeed1;
	
	
	public Berrie(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		index = 1;
		this.berrie1 = app.loadImage("./data/berrie1.png");
		this.berriefeed1 = app.loadImage("./data/berriefeed1.png");
		
	}
	
	public void paint () {
		switch(index) {
		case 0:
			app.image(this.berrie1,posX,posY);
		
			
		break;

		case 1:
			boolean over;
			if(app.mouseX > posX && app.mouseX < posX + 70
					&& app.mouseY > posY && app.mouseY < posY + 68) {
				over = true;
			} else {
				over = false;
			}
			
			if(over) {
				app.image(this.berriefeed1,posX,posY);
			}else {
				app.image(this.berrie1,posX,posY);
			}
	}
	}


}
