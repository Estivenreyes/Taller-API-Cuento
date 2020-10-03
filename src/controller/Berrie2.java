package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Berrie2 extends Object{
	
	private int index;
	PImage berrie2;
	PImage berriefeed2;
	
	
	public Berrie2(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		index = 1;
		this.berrie2 = app.loadImage("./data/berrie2.png");
		this.berriefeed2 = app.loadImage("./data/berrie2.png");


		
		
	}
	
	public void paint () {
		switch(index) {
		case 0:
			app.image(this.berrie2,posX,posY);
			
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
				app.image(this.berriefeed2,posX,posY);
			}else {
				app.image(this.berrie2,posX,posY);
			}
	}
	}


}
