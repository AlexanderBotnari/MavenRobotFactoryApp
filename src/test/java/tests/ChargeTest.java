package tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import robo.BetaRobot;
import robo.RobotFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChargeTest {
	     
		private BetaRobot robot;
		 
		@BeforeEach
		void init() {
	        robot = (BetaRobot) RobotFactory.getRobot("Beta", "Jordan");
	    }
		  
		@Test
		@Order(1)
		void testNegativeCharge() {
			robot.setCharge(-100);
			assertNotEquals(-100, robot.getCharge() < 0,"Charge test failed\nREASON: Values less than 0 not allowed!" );
		}
		
		@Test
		@Order(2)
		void testChargeMoreThanHundred() {
			robot.setCharge(1000);
			assertNotEquals(1000,robot.getCharge() > 100,"Charge test failed\nREASON: Values more than 100 not allowed!");
		}
		@Test
		@Order(3)
		void testDischargingInMovement() {
			robot.setCharge(50);
	        while(robot.moveRight());
	        assertNotEquals(robot.getCharge() != 5 || robot.getX() != 90,"Charge test failed!");
	        
		}
	}
