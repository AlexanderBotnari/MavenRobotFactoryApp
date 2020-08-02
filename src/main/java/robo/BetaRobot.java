package robo;

import interfaces.HasBatteryInterface;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface{
        
	private byte charge;

	public BetaRobot() {}
	public BetaRobot(String name, String model) {
		super(name , model);
		setCharge(0);
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		if(charge >= 0 && charge <= 100) {
			this.charge = (byte)charge;
		}else {
			System.err.println("Values less than 0 and more 100 not allowed!");
		}
	}
	 @Override
	public boolean moveRight() {
       if(verifyCharge() && super.moveRight()) {
    	   setX(getX() + 1);
           charge--;
		 return true;
       }else {
    	   return false;
       }
    }
	@Override
	public boolean moveLeft() {
		if(verifyCharge() && super.moveLeft()) {
			setX(getX() - 1);
            charge--;
		 return true;
       }else {
    	   return false;
       }
	}
	@Override
	public boolean moveDown() {
		if(verifyCharge() && super.moveDown()) {
			setY(getY() + 1);
            charge--;
		 return true;
       }else {
    	   return false;
       }
	}
	@Override
	public boolean moveUp() {
		if(verifyCharge() && super.moveUp()) {
			setY(getY() -1);
            charge--;
		 return true;
       }else {
    	   return false;
       }
	}
	public boolean verifyCharge(){
        if(getCharge() >= 5 ) {
        	return true;
        }else {
        	return false;
        }
     }
	
}