package controller;

import processing.core.PApplet;
import processing.core.PImage;

public class RedHood extends Object{
	
	private int index;
	PImage redHood1;
	PImage redHoodbasket;
	PImage redHoodbasket1;
	PImage redHoodbasket2;
	PImage redHoodbasket3;
	PImage redHoodbasketfeed;
	
	public RedHood(float posX, float posY, int dirX, PApplet app) {
		super(posX, posY, dirX, app);
		
		this.redHood1 = app.loadImage("./data/redHood1.png");
		this.redHoodbasket = app.loadImage("./data/redHoodbasket.png");
		this.redHoodbasket1 = app.loadImage("./data/redHoodbasket1.png");
		this.redHoodbasket2 = app.loadImage("./data/redHoodbasket2.png");
		this.redHoodbasket3 = app.loadImage("./data/redHoodbasket3.png");
		this.redHoodbasketfeed = app.loadImage("./data/redHoodbasketfeed.png");
		index = 0;
	}
	
	public void paint() {
		
		switch(index) {
		case 0:
			app.image(this.redHood1,posX,posY);
			
		break;
		
		case 1:
			app.image(this.redHoodbasket,posX,posY);
			
		break;

		case 2:
			app.image(this.redHoodbasket1,posX,posY);
		break;
			
		case 3:
			app.image(this.redHoodbasket2,posX,posY);
			
		break;
		
		case 4:
			boolean over;
			if(app.mouseX > posX && app.mouseX < posX + 203
					&& app.mouseY > posY && app.mouseY < posY + 332) {
				over = true;
			} else {
				over = false;
			}
			
			if(over) {
				app.image(this.redHoodbasketfeed,posX,posY);
			}else {
				app.image(this.redHoodbasket3,posX,posY);
			}
			
		break;
		
		}
		
	} 
	
	public void move () {
		
	}

}
