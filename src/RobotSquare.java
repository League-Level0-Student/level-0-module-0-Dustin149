/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
    	int WinX = 1000;
    	int WinY = 1000;
    	
      	// 1. Make a new Robot
    	Robot Lexikirus = new Robot();
    	Lexikirus.miniaturize();
    	Lexikirus.setWindowSize(WinX, WinY);
    	Lexikirus.moveTo(WinX/2, WinY/2);
        // 3. Put the robot's pen down
    	Lexikirus.penDown();

        // 6. Make the robot move as fast as possible
    	Lexikirus.setSpeed(10);

        // 5. Do everything below here 4 times
 
    	for (int i=0;i<4;i++) {
    				Lexikirus.setRandomPenColor();
    				
    	

        //         2. Move your robot 200 pixels
    				Lexikirus.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
    				Lexikirus.turn(90);
    				
    				
    	}					
    }
}
