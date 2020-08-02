package tests;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import robo.AlphaRobot;
import robo.RobotFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTest {
	 
	private AlphaRobot robot;
 
	@BeforeEach
	void init() {
        robot = (AlphaRobot) RobotFactory.getRobot("Alpha", "BOB");
    }
	
	// name cannot be null
	@Test
	@Order(1)
    void testName() {
        robot.setName(null);
        assertNotEquals(null, robot.getName(),"Name test failed\nREASON: null name not allowed!");
    }

   // model cannot be null
	@Test
	@Order(2)
	void testModel() {
		robot.setModel(null);
		assertNotEquals(null, robot.getModel(),"Model test failed\nREASON: null model not allowed!");
	}
	
	/// COORDINATES

	// X cannot be outside 0..100
	@Test
	@Order(3)
	void testXnegative() {
		robot.setX(-100);
		assertNotEquals(-100, robot.getX() < 0 ,"X coord test failed\nREASON: Values less than 0 not allowed!");
	}
	     
	// X cannot be outside 0..100
	@Test
	@Order(4)
	void testXmoreThanHundred() {
		robot.setX(1000);
		assertNotEquals(1000, robot.getX() > 100,"X coord test failed\nREASON: Values more than 100 not allowed!");
	}
	
	// Y cannot be outside 0..100
	@Test
	@Order(5)
	void testYnegative() {
		robot.setY(-100);
		assertNotEquals(-100, robot.getY() < 0 ,"Y coord test failed\nREASON: Values less than 0 not allowed!");
	}    

	// Y cannot be outside 0..100
	@Test
	@Order(6)
	void testYmoreThanHundred() {
		robot.setY(1000);
		assertNotEquals(1000 , robot.getY() > 100 ,"Y coord test failed\nREASON: Values more than 100 not allowed!");
	}      

	/// MOVEMENT

	// Y cannot be outside 0..100
	@Test
	@Order(7)
	void YmoveUpTest() {
		robot.setY(0);
		assertNotEquals(robot.moveUp(),"Move test failed\nREASON: moveUp() out of bounds!");
	}

	// Y cannot be outside 0..100
    @Test
    @Order(8)
    void YmoveDownTest() {
    	robot.setY(100);
    	assertNotEquals(robot.moveDown(), "Move test failed\nREASON: moveDown() out of bounds!");
    }
    
    // X cannot be outside 0..100
    @Test
    @Order(9)
    void XmoveLeftTest() {
    	robot.setX(0);
    	assertNotEquals(robot.moveLeft(),"Move test failed\nREASON: moveleft() out of bounds!");
    }

	// X cannot be outside 0..100
    @Test
    @Order(10)
    void XmoveRightTest() {
    	robot.setX(100);
    	assertNotEquals(robot.moveRight(),"Move test failed\nREASON: moveRight() out of bounds!");
	}
	 
}
