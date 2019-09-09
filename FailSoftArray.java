class FailSoftArray {
	private int a[];
	private int errval;
	public int length;

	FailSoftArray(int size, int ervl) {
		a = new int[size];
		length = size;
		errval = ervl;
	}

	private boolean indexOK (int index) {
		if(index >= 0 & index < length) return true;
		return false;
	}

	public boolean put (int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	public int get (int index) {
		if(indexOK(index)) return a[index];
		return errval;
	}
}