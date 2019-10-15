class X1 {
	int a;
	int b;

	X1() {
		a=b=1;
	}

	void show() {
		System.out.println(a + "X" + b);
	}
}

class Y1 extends X1 {
	int c;
	int d;

	Y1() {
		c=d=2;
	}

	void show() {
		System.out.println(c + "Y" + d);
	}
}

class poly {
	public static void main(String args[]) {
		X1 x1 = new X1();
		Y1 y1 = new Y1();
		X1 x2;

		x2 = y1;
		x2.show();
		//System.out.println(x2.c);
	}
}