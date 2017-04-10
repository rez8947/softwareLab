package application;

public interface AddOrSubtractFromStats {
	//takes in the base stat for the class that is being used, the point at which its at right now, and the amount of stats left to give
	void changeStat(int basePoint, int point, int freePointsLeft);
}
