package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.moveTo(15, 600);
		drawHouse();
		drawHouse();
		drawHouse();
		drawHouse();
		drawHouse();
	} 
		void drawHouse() {
			rob.penDown();
			rob.setSpeed(10);
			rob.move(150);
			rob.turn(45);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(45);
			rob.move(150);
			rob.turn(270);
			rob.move(40);
			rob.turn(270);
		}
	}

