package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 0;
    int birdY = 300;
    int birdYVelocity = -10;
    int gravity = 1;
    
    int pipeX = 500;
    int upperPipeHeight = 0;
   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
       
    }

    @Override
    public void draw() {
    	 background(0, 0, 0);
    	//birdy
    	fill(255, 255, 255);
    	stroke(255, 255, 255);
    	ellipse(birdX, birdY, 50, 50);
    	
    	// pipes
    
    	upperPipeHeight = (int) random(100,400);
    	fill(0, 255, 0);
    	rect(pipeX, 500, 50, 600);
    	rect(pipeX, 0, 50, upperPipeHeight);
    	pipeX-=5;
    	if(pipeX==-200) {
    		pipeX=500;
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    
    public void mousePressed(){
    	birdYVelocity =10;
    	
    }
}
