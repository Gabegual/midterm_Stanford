import stanford.karel.SuperKarel;

/*This program tells karol to move and make an inside layer of beepers 
 * based on the total size of the moveable area.
 * Created by Robert Johns
 */

public class problem1 extends SuperKarel {

	public void run() {
		turnLeft();
		int width = 0;
		int height = 0;
		 
		while(frontIsClear()) {
			move();
			width++;
		}
		
		turnRight();
		
		while(frontIsClear()) {
			move();
			height++;
		}
		
		setPosition();
		
		for(int x = 0; x < width - 2; x++) {
			putBeeper();
			move();
		}
		
		for(int y = 0; y < height - 2; y++) {
			putBeeper();
			move();
		}
		
	}
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	public void setPosition() {
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		move();
	}
	
	

}

