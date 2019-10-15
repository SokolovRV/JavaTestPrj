package qpack;

public class DynQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public DynQueue(int size) {
		q=new char[size+1];
		putloc = getloc = 0;
	}


	public void put (char ch) {
		if(putloc == q.length-1) {
			char t[] = new char[q.length*2];
			for(int i = 0; i < q.length; i++)
				t[i] = q[i];
			q=t;
		}
		putloc++;
		q[putloc] = ch;
	}

	public char get() {
		if(getloc==putloc) {
			System.out.println(" - Ochered' pusta");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}

	public void clear() {
		getloc = putloc = 0;
		char t[] = new char[q.length];
		q = t; 
	}

	public void copy(DynQueue ob) {
		char t[] = new char[ob.q.length];
		getloc = ob.getloc;
		putloc = ob.putloc;
		for(int i = 0; i < t.length; i++)
			t[i] = ob.q[i];
		q = t;
	}
}