class StringRecur {
	void recur(String str, int n) {
		if(n > 0) {
			System.out.print(str.charAt(n-1));
			recur(str, n-1);
		}
	}
}

class StringRecurDemo {
	public static void main(String args[]) {
		String word = "Hello";
		StringRecur st = new StringRecur();
		System.out.println(word);
		st.recur(word, word.length());
		System.out.println();
	}
}