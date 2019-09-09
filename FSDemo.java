class FSDemo {
	public static void main(String args[]) {
		FailSoftArray mass = new FailSoftArray(10, -1);

		int x;

		mass.put(2, 10);
		x = mass.get(11);
		System.out.println(mass.length);
	}
}