package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Flower extends Object{
	
	private int index;
	PImage Flower;
	PImage Flowers;
	
	public Flower(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		this.Flower = app.loadImage("./data/Flower.png");
		this.Flowers = app.loadImage("./data/Flowers.png");
		
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
				app.image(this.Flowers,posX,posY);
			}else {
				app.image(this.Flower,posX,posY);
			}
		}
	}


}
