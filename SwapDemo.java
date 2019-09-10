class Storage {
	int a;

	Storage(int i) {
		a=i;
	}

	void swap(Storage obj) {
		a=obj.a;
	}
}

class SwapDemo {
	public static void main(String args[]) {
		Storage ob1 = new Storage(2);
		Storage ob2 = new Storage(10);

		System.out.println("ob1:" + ob1.a);
		System.out.println("ob2:" + ob2.a);

		ob2.swap(ob1);
		System.out.println("ob2:" + ob1.a);
	}
}