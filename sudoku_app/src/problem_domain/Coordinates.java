package problem_domain;

public class Coordinates {
	private final int x;
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private final int y;
	
	public Coordinates (int x, int y) {
		this.x = x;
		this.y = y;
	}

}
