class TwoShape {
	private double width;
	private double height;

	TwoShape() {
		width = height = 0;
	}

	TwoShape(double w, double h) {
		width = w;
		height = h;
	}

	TwoShape(double wh) {
		width = height = wh;
	}

	TwoShape(TwoShape ob) {
		width = ob.width;
		height = ob.height;
	}

	double getWidth() { return width; }
	double getHeight() { return height; } 
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

	void showDim() {
		System.out.println("Shirina:" + width + "Visota:" + height);
	}
}

class Circle extends TwoShape {
	final private double Pi = 3.14;

	Circle(double rad) {
		super(rad);
	}

	double area() {
		return getHeight()/2 * getWidth()/2 * Pi;
	}
}

class TwoShapesDemo {
	public static void main(String args[]) {
		Circle round = new Circle(6.6);
		TwoShape two = TwoShape();

		TwoShape twoq;

		twoq = round;

		System.out.println(round.area());
	}
}