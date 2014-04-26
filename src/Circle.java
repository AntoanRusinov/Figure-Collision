public class Circle extends Figure {

	private double radius;

	public Circle(double X, double Y, double radius) {
		super(X, Y);
		this.setRadius(radius);

	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException(
					"Radius can't be less or equal to 0!");
		}

		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double calcArea() {
		return Math.PI * this.radius * this.radius;
	}

}
