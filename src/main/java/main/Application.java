package main;

import robo.AbstractRobot;
import robo.RobotFactory;

public class Application {
        public static void main(String[] args) {
		
     	AbstractRobot robo = RobotFactory.getRobot("Alpha","Bob");
        AbstractRobot robo1 = RobotFactory.getRobot("Beta","Jack");
	    AbstractRobot robo2 = RobotFactory.getRobot("Charlie","Optimus");
		
	    System.out.println(robo);
	    System.out.println(robo1);
	    System.out.println(robo2);
	}
        
}
