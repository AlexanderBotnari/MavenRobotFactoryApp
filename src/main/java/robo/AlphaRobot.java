package robo;

public class AlphaRobot extends AbstractRobot{
	
	private String name;
	private String model;
	private int x;
	private int y;
	
	public AlphaRobot() {}
	public AlphaRobot(String name, String model ) {
		setName(name);
		setModel(model);
		setX(0);
		setY(0);
	}
	public void setName(String name) {
		if(name == null) {
            System.err.println("Null name not allowed!");
		}else {
			this.name = name;
		}
	}
    
	public String getName() {
		return name;
	}
    
	public void setModel(String model) {
    	if( model == null ) {
            System.err.println("Null model not allowed!");
    	}else {
    		this.model = model;
    	}
	}
    
	public String getModel() {
		return model;
	}
  
	public void setX(int x) {
		if(x >= 0 && x <= 100) {
			this.x = x;
		}else {
			System.err.println("Values less than 0 and more 100 not allowed!");
		}
	}
    
	public int getX() {
		return x;
	}
    
	public void setY(int y) {
    	if(y >= 0 && y <= 100) {
			this.y = y;
		}else {
			System.err.println("Values less than 0 and more 100 not allowed!");
		}
	}
   
	public int getY() {
		return y;
	}
    
	public boolean moveRight() {
    	if (x < 100) {
    		setX(getX() + 1);
    		return true;
    	}else {
    		return false;
    	}
    }
    
	public boolean moveLeft() {
		if(x > 0) {
			setX(getX() - 1);
			return true;
		}else {
		    return false;	
		}
	}
    
	public boolean moveDown() {
		if(y < 100) {
			setY(getY() + 1);
			return true;
		}else {
		    return false;	
		}
	}
    
	public boolean moveUp() {
		if(y > 0) {
			setY(getY() - 1);
			return true;
		}else {
		    return false;	
		} 
	}
}


