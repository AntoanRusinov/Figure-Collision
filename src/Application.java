import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of figures: ");
		int N = scan.nextInt();

		Figure[] figures = calculateAreas(scan, N);

		System.out.println("Results");
		for (int i = 0; i < N; i++) {

			System.out.printf("Area of figure %d: %f", i + 1,
					figures[i].calcArea());

		}

	}

	public static Figure[] calculateAreas(Scanner scan, int N) {

		Figure[] figures = new Figure[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Enter type for figure %d: ", i + 1);

			int figure = scan.nextInt();

			if (figure == 1) {
				System.out.println("Enter X: ");
				double X = scan.nextDouble();
				System.out.println("Enter Y: ");
				double Y = scan.nextDouble();
				System.out.println("Enter width: ");
				double width = scan.nextDouble();
				System.out.println("Enter height: ");
				double height = scan.nextDouble();

				Figure rectangle = new Rectangle(X, Y, width, height);

				figures[i] = rectangle;

			} else if (figure == 2) {
				System.out.println("Enter X: ");
				double X = scan.nextDouble();
				System.out.println("Enter Y: ");
				double Y = scan.nextDouble();
				System.out.println("Enter Radius: ");
				double radius = scan.nextDouble();

				Figure circle = new Circle(X, Y, radius);

				figures[i] = circle;

			} else {
				throw new IllegalArgumentException(
						"Your choise have to be 1 or 2. Please enter 1 for rectangle and 2 for circle!");
			}

		}
		return figures;
	}

	// TODO: must implement properly
	public static boolean isCollision() {
		Circle circle = new Circle(5, 3, 2);
		Rectangle rect = new Rectangle(3, 7, 3, 2);
		if ((circle.getX() - rect.getCenterX()) <= (rect.getWidth() / 2 + circle
				.getRadius())) {
			return true;
		}
		if ((circle.getY() - rect.getCenterY()) <= (rect.getHeight() / 2 + circle
				.getRadius())) {

			return true;
		}
		return false;
	}
}
