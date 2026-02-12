package teluskolearnings;

public class SquareCalc extends AdvCalc {
public int side;

public int area(int side) {
	this.side = side;
	int area = side * side;
	return area;
}
}
