package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 0;
    int birdY = 300;
    int birdYVelocity = 8;
    int gravity = 1;
    
    int pipeX = 800;
    int upperPipeHeight = 0;
    
    int lowerY;
    
    int pipeGap = 150;
    
    boolean intersectsPipes;
   
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
    	birdYVelocity+=gravity;
    	birdY+=birdYVelocity;
    	
    	if (mousePressed) {
    		birdYVelocity=-8;
    		birdY+=birdYVelocity;
    	}
    	// pipes
    
    	
    	fill(0, 255, 0);
    	
    	rect(pipeX, 0, 50, upperPipeHeight);
    	
    	lowerY = upperPipeHeight + pipeGap;
    	rect(pipeX, lowerY, 50, 600);
    	pipeX-=5;
    	if(pipeX==-200) {
    		pipeX=800;
    	upperPipeHeight = (int) random(100,400);
    	}
    	if(birdY==0) {
    		
    	}
    	intersectsPipes();
    	
    	}
    	
    	
    
    boolean intersectsPipes() { 
            if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+50)){
               return true; }
           else if (birdY>lowerY && birdX > pipeX && birdX < (pipeX+50)) {
               return true; }
           else { return false; }
    	}
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    
    public void mousePressed(){
    	birdYVelocity =10;
    	
    }
}
