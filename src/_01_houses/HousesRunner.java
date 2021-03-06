package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		Robot rob = new Robot();
		rob.penDown();
		rob.moveTo(50, 600);
		rob.setSpeed(10);
		rob.move(150);
		rob.turn(45);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(45);
		rob.move(150);
		rob.turn(270);
		rob.move(100);

	}

}
