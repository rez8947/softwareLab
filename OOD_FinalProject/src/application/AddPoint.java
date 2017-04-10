package application;

public class AddPoint implements AddOrSubtractFromStats {


	@Override
	public void changeStat(int basePoint, int point, int freePointsLeft) {


		
		//makes sure that the current point its at is not below the base point and also check to see that you can still have points to give
		//then it add a point to the stat
		if (point < basePoint) {
			System.out.println("the point cant be");
		} else if (freePointsLeft < 1) {
			System.out.println("you have no more free stats left");
		}


		else {
			point = point + 1;
			System.out.println("add point to stat " + point);
		}


	}
}
