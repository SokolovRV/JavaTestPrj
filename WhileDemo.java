class WhileDemo {
	public static void main (String args[])
		throws java.io.IOException {
			char ch, ignore;
			int cnt = 0;
			do {
				ch = (char) System.in.read();
				if(ch >= 'A' && ch <= 'Z') {
					cnt++;
					System.out.print(" " + (char)(ch+32));
				}
				if(ch >= 'a' && ch <= 'z') {
					cnt++;
					System.out.print(" " + (char)(ch-32));
				}
				System.out.println();

				do
					ignore = (char) System.in.read();
				while(ignore != '\n');

			} while (ch != '.');
			System.out.println("count transform is:" + cnt);
		} 		
}