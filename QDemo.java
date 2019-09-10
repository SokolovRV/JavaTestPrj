class Queue {
	private char q[];
	private int putloc, getloc;

	Queue(int size) {
		q=new char[size+1];
		putloc = getloc = 0;
	}

	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q=new char[ob.length];

		for(int i= getloc+1; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	Queue (char a[]) {
		putloc = getloc = 0;
		q = new char[a.length+1];

		for(int i=0; i < a.length; i++)
			put(a[i]);
	}


	void put (char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Ochered' zapolnena");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	char get() {
		if(getloc==putloc) {
			System.out.println(" - Ochered' pusta");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;

		System.out.println ("Sohranenie alphavita v bigQ:");
		for(int i=0; i<26; i++) {
			bigQ.put((char)('A'+i));
		}

		System.out.print("Soderzimoe bidQ: ");
		for(int i=0; i<26; i++) {
			ch = bigQ.get();
			System.out.print(ch);
		}
	}
}