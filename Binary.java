class ShowBits {
	int maxIndex;

	ShowBits(int n) {
		maxIndex = n-1;
	}

	void show(long val) {
		for(int i=maxIndex; i>=0; i--) {
			System.out.print((val>>>i)&1);
			if(i%8 == 0)
				System.out.print(" ");
		} 
		System.out.println(" ");
	}

}


class Binary {
	public static void main (String args[]) {
		ShowBits byteBits = new ShowBits(8);

		char ch = 'a';
		char res;
		int a=2;

		byteBits.show(ch);

		a = res;
		res ^= 88;

		byteBits.show(res);



	}
}