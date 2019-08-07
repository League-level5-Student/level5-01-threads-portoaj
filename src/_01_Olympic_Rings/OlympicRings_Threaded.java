package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot robo1 = new Robot(400,400);
		Robot robo2 = new Robot(800,400);
		Robot robo3 = new Robot(1200,400);
		Robot robo4 = new Robot(600, 600);
		Robot robo5 = new Robot(1000, 600);
	
		Thread r1 = new Thread(() -> olympic(robo1));
		Thread r2 = new Thread(() -> olympic(robo2));
		Thread r3 = new Thread(() -> olympic(robo3));
		Thread r4 = new Thread(() -> olympic(robo4));
		Thread r5 = new Thread(() -> olympic(robo5));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

	/*	r1 = new Thread(() -> robo1.turn(90));
		r2 = new Thread(() -> robo2.turn(90));
		r3 = new Thread(() -> robo3.turn(90));
		r4 = new Thread(() -> robo4.turn(90));
		r5 = new Thread(() -> robo5.turn(90));
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r1 = new Thread(() -> robo1.move(100));
		r2 = new Thread(() -> robo2.move(100));
		r3 = new Thread(() -> robo3.move(100));
		r4 = new Thread(() -> robo4.move(100));
		r5 = new Thread(() -> robo5.move(100));
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	*/	
		
		
	}
	private static void olympic(Robot robo)
	{
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
	}
	
}

