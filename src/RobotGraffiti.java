import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
    	
    	
		Robot Lexikirus = new Robot();
		
		// Default Settings //
		int WinX = 1000;
    	int WinY = 1000;		
		
		Lexikirus.penDown();
		Lexikirus.setSpeed(10);
		Lexikirus.setWindowSize(WinX, WinY);
    	Lexikirus.moveTo(WinX/2, WinY/2);
    	Lexikirus.setRandomPenColor();
    	Lexikirus.setPenWidth(20);
    	Lexikirus.miniaturize();
 
		// Instructions //
		
		
		// 1
		Lexikirus.move(80);
		
		Lexikirus.setRandomPenColor();
		Lexikirus.move(150);
		
		// 2
		Lexikirus.setAngle(90);
		Lexikirus.setPenWidth(10);
		Lexikirus.setRandomPenColor();
		
		// 3
		
		for (int i=2;i<180;i++) {
			
			
			Lexikirus.move(2);
			Lexikirus.setAngle(90+i);
			
			if (i == 60) {
				Lexikirus.setRandomPenColor();
				Lexikirus.setPenWidth(25);
			}
		}
		
		// 4
		
		Lexikirus.move(1);
		Lexikirus.penUp();
		
		// 4
		Lexikirus.turn(-90);
		Lexikirus.move(50);
		Lexikirus.turn(180);
	}
}
