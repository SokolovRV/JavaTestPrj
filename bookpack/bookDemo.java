package bookpack;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}

class bookDemo {
	public static void main(String args[]) {
		Book books[] = new Book[5];

		books[0] = new Book("Metro 2033", "Glukhovskii", 2011);
		books[1] = new Book("Metro 2034", "Glukhovskii", 2012);
		books[2] = new Book("Metro 2035", "Glukhovskii", 2013);
		books[3] = new Book("Piter", "Shimun Vrocheck", 2013); 
		books[4] = new Book("Budushee", "Glukhovskii", 2014);

		for(Book x : books) x.show();
	}
}