package _02_Advanced_Robot_Race;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[2];
		Thread[] threads = new Thread[2];

		for(int i = 0; i < robots.length; i++)
		{
			robots[i] = new Robot(100 * i + 50, 900);
			robots[i].setSpeed(3);
			Robot robo = robots[i];
			threads[i] = new Thread(() -> moveRobotsSelfContained(robo));
		}
		for(Thread thread: threads)
		{
			thread.start();
		}
	}
	static void moveRobotsSelfContained(Robot robo)
	{		
		Random rand = new Random();
		
		robo.move(rand.nextInt(50));
		robo.setSpeed(rand.nextInt(4) + 2);
		if(robo.getY()< 0)
		{
			robo.turn(90);
			robo.moveTo(robo.getX(), 0);
		}
		if(robo.getX()> 1200)
		{
			robo.turn(90);
			robo.moveTo(1200, robo.getY());
		}
		if(robo.getY() > 910)
		{
			robo.turn(90);
			robo.moveTo(robo.getX(), 910);
		}
		
		if(robo.getX() > 0)
		{
			moveRobotsSelfContained(robo);
		}
		else
		{
			System.out.println("Yay we have a a winner");
		}
	}

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
    //   a random amount less than 50.
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.
	
    //9. make the robots race around a circular track.
	
}