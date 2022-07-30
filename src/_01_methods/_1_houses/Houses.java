package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public static void main(String[] args) {
	/*
	 * 1. Have a robot start on the left side of the window near the bottom. DONE

	2. Draw a flat-topped house of height 100 with grass after it (see picture). DONE

	3. Extract the piece of code that draws the house into a method. Draw 10 houses. DONE

	4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights DONE

	5. Make the method take a String instead of an int. NO

        “small”                 60 

        “medium”             120 

        “large”                 250 

	6. Make the method take a color as well as a height. The houses are drawn in that color. DONE

	[optional] Set the scene to night by setting the background to black 

	7. Give the houses peaked roofs DONE

	8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. DONE

	9. Make large houses have flat roofs DONE

	 */
		//String small = "60";
		//String medium = "120";
		//String large = "250";
		
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);	
		rob.moveTo(750, 500);
		rob.turn(270);
		
		Robot.setWindowColor(0,0,0);
		
		
			
		for(int i =0; i <10; i++) {
			Random ran = new Random();
			int height = ran.nextInt(190);
			height+=60;
				
			int red = ran.nextInt(255);
			int green = ran.nextInt(255);
			int blue = ran.nextInt(255);
			
			if(height%2==0) {
				flatRoof(rob, height, red, green, blue);
			}
		
			if(height%2==1)
			pointyRoof(rob, height,red, green, blue);
		}
		
		
		
		
	}
	public static void flatRoof(Robot rob, int height,int red, int green, int blue) {
		
	
		
		rob.setPenColor(0,100,0);
		rob.move(25);
		rob.setPenColor(red,green,blue);
		rob.turn(90);
		rob.move(height);
		rob.turn(270);
		rob.move(25);
		rob.turn(270);
		rob.move(height);
		rob.turn(90);
		
		// Check the recipe to find out what code to put here
		}
	public static void pointyRoof(Robot rob, int height,int red, int green, int blue) {
		
		rob.setPenColor(0,100,0);
		rob.move(25);
		rob.setPenColor(red,green,blue);
		rob.turn(90);
		rob.move(height);
		rob.turn(320);
		rob.move(35);
		rob.turn(270);
		rob.move(35);
		rob.turn(310);
		rob.move(height);
		rob.turn(90);
		
		
		
		}
	}
