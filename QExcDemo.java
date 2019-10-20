import qpack.ICharQ;
import qpack.QueueFullException;
import qpack.QueueEmptyException;
import qpack.FixedQueue;


class QExcDemo {
	public static void main(String args[]) {
		FixedQueue q = new FixedQueue(10);
		char ch;

		try {
			for(int i = 0; i < 11; i++) {
				System.out.println("Try put ch...");
				q.put( (char)('A'+i) );
				System.out.println("OK");
			}
			System.out.println();
		}
		catch(QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			for(int i=0; i<11; i++) {
				System.out.println("Try get ch...");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}