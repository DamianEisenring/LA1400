package EisenringDamian;
import robocode.*;


public class SturerEmil extends JuniorRobot
{
	


	public void run() {
		setColors(orange, blue, white, yellow, black);
		
		gotonorth();
	
		while(true) {
		
			turnTo(234);
			ahead(fieldHeight + 300);
			out.println("Corner: Bottom left");
			turnTo(0);
			ahead(fieldWidth);
			out.println("Corner: Top left");
			turnTo(126);
			ahead(fieldHeight + 300);
			out.println("Corner: Bottom right");
			turnTo(0);
			ahead(fieldHeight);
			out.println("Corner: Top right");
			}
	}
	
		public void gotonorth(){
		int heightdistance;
		int widthdistance;
		heightdistance = fieldHeight - robotY;
		widthdistance = fieldWidth - robotX;
		turnTo(0);
		ahead(heightdistance);
		turnTo(90);
		ahead(widthdistance);
		}
		

	public void onScannedRobot() {
		fire(3);
	}


	public void onHitByBullet() {
		out.println("aaaaaa, that hurts");
	}
	

	public void onHitWall() {

		back(20);
	}	
}
