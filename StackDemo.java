class Stack {
	private char temp[];
	private int poplock, pushlock;

	Stack(int size) {
		temp = new char[size];
		pushlock = 0;
		poplock = -1;
	}

	void push(char symb) {
		if(pushlock == temp.length) {
			System.out.println("Err: Full stack!!!");
		}
		else {
			temp[pushlock] = symb;
			poplock = pushlock;
			pushlock++;
			if(pushlock == temp.length)
				System.out.println("Stack is full!");
		}
	}

	char pop() {
		char buff = (char) 0;
		if(poplock < 0) {
			System.out.println("Err: Empty temp!!!");
		}
		else {
			buff = temp[poplock];
			pushlock = poplock;
			poplock--;
			if(poplock < 0)
				System.out.println("Last symb!");
		}
		return buff;
	}
}

class sumdemo {
	static int sum (int ... v) {
		int summator=0;
		for(int x: v)
			summator+=x;
		return summator/v.length;
	}
}

class StackDemo {
	public static void main(String args[]) {
		Stack q = new Stack(5);


		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());

		System.out.println(sumdemo.sum(1,4,4,7));


	}
}