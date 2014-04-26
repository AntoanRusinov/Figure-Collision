public abstract class Figure {

	private double X;
	private double Y;

	public Figure(double X, double Y) {

		this.X = X;
		this.Y = Y;

	}

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

	public abstract double calcArea();
}
