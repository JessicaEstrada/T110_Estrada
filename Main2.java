

public class Main2 {
	private double i;
	private double j;
	private int choice;

	public void choice(int choice) {
		this.choice = choice;
	}

	public void setValue1(double i) {
		this.i = i;
	}

	public void setValue2(double j) {
		this.j = j;
	}

	public void printAnswer() {
		if(this.choice == 0) {
			System.out.println("Program Terminated");
		} else if(this.choice == 1) {
			System.out.println("The Area of Triangle is : " + triangleArea(i, j));
		} else if(this.choice == 2) {
			System.out.println("The Area of Triangle is : " + rectangleArea(i, j));
		} else if(this.choice == 3) {
			System.out.println("The Area of Triangle is : " + parrallelogramArea(i, j));
		} else if(this.choice == 4) {
			System.out.println("The Area of Triangle is : " + circleArea(i));
		} else {
			System.out.println("Error!");
		}
		System.out.println("------------------------------------------------------------------\n");
	}

	public double firstValue() {
		return this.i;
	}

	public double SecondValue() {
		return this.j;
	}

	public int getChoiceValue() {
		return this.choice;
	}

	public double getTriangleArea() {
		return triangleArea(i, j);
	}

	public double getRectangleArea() {
		return rectangleArea(i, j);
	}

	public double getParrallelogramArea() {
		return parrallelogramArea(i, j);
	}

	public double getCircleArea() {
		return circleArea(i);
	}
}