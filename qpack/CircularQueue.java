package qpack;

public class CircularQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public CircularQueue(int size) {
		q=new char[size+1];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc+1==getloc | ((putloc==q.length-1) & (getloc==0))) {
			System.out.println("Ochered Zapolnena!");
			return;
		}
		putloc++;
		if(putloc==q.length) putloc = 0;
		q[putloc]=ch;
	}

	public char get() {
		if(putloc==getloc) {
			System.out.println("Ochered Pusta!");
			return (char) 0;
		}
		getloc++;
		if(getloc==q.length) getloc = 0;
		return q[getloc];
	}

	public void clear() {
		getloc = putloc = 0;
		char t[] = new char[q.length];
		q = t; 
	}
}