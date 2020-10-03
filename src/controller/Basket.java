package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class Basket extends Object{
	
	private int index;
	PImage basket;
	PImage basketfeed;

	public Basket(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		index = 1;
		this.basket = app.loadImage("./data/basket.png");
		this.basketfeed = app.loadImage("./data/basketfeed.png");
	}
	
	public void paint () {
		switch(index) {
		case 0:
			app.image(this.basket,posX,posY);
			
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
				app.image(this.basketfeed,posX,posY);
			}else {
				app.image(this.basket,posX,posY);
			}
		}
		
	}

}
