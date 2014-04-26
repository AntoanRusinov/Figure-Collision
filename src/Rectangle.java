public class Rectangle extends Figure {

	private double width;
	private double height;
	private double centerX;
	private double centerY;

	public Rectangle(double X, double Y, double width, double height) {
		super(X, Y);
		this.setWidth(width);
		this.setHeight(height);
		this.calcRectCenter();

	}

	public void setWidth(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException(
					"Width can't be less or equal to 0!");
		}
		this.width = width;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			throw new IllegalArgumentException(
					"Height can't be less or equal to 0!");
		}
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	private void calcRectCenter() {
		this.centerX = getX() + this.width / 2;
		this.centerY = getY() + this.height / 2;
	}

	public double getCenterX() {
		return this.centerX;
	}

	public double getCenterY() {
		return this.centerY;
	}

	public double calcArea() {
		return this.width * this.height;
	}

}
