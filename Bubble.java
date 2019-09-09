class Bubble {
	public static void main(String args[]) {
		String nums[] = {"Dzhon","Cidni","Artur","Blorium"};

		int a,b;
		String t = "";
		int size=nums.length;

		for(int i=0; i<size; i++)
			System.out.print(nums[i] + "  ");

		System.out.println();

		for(a=1; a<size; a++) {
			for(b=size-1; b>=a; b--) {
				if(nums[b-1].charAt(0) > nums[b].charAt(0)) {
					t = nums[b-1];
					nums[b-1]=nums[b];
					nums[b]=t;
				}
			}
			for(int i=0; i<size; i++)
				System.out.print(nums[i] + "  ");
			System.out.println();
		}
		for(int i=0; i<size; i++)
			System.out.print(nums[i] + "  ");
		System.out.println();
	}
}