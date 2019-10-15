import qpack.*;

class ICharQDemo {
	public static void main(String args[]) {

		DynQueue dyn = new DynQueue(10);
		DynQueue dyn2 = new DynQueue(11);

		ICharQ obj;

		for(int i = 0; i < 20; i++) {
			dyn.put((char)('A'+i));
		}

		dyn2.copy(dyn);

		obj = dyn2;

		for(int i = 0; i<20; i++) {
			System.out.print(obj.get());
		}

		System.out.println();

	}
}