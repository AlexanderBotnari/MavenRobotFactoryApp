package robo;

public class RobotFactory {
	
	public static AbstractRobot getRobot(String model, String name) {
		       
		if (model.equals("Alpha")) 
			 return new AlphaRobot(name, model);
	            
	    if (model.equals("Beta")) 
	            return new BetaRobot(name, model);
	      
	    if (model.equals("Charlie")) 
	            return new CharlieRobot(name, model);
	        
	    return null;
    }
}

