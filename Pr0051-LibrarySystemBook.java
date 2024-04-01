/*
Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book 
instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the 
library
*/

class Book{
	String title;
	String author;
	String isbn;
	static int totalNoOfBooks;
	
	boolean isBorrowed;
	
	static {
		totalNoOfBooks = 0;
	}
	
	{
		totalNoOfBooks++; // Object Init
	}
	
	Book(String isbn, String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	Book(String isbn){
		this(isbn, "Unknown", "Unknown");
	}
	
	static int getTotalNoOfBooks(){
		return totalNoOfBooks;
	}
	
	void borrowBook(){
			if(isBorrowed){
				System.out.println("Book Is Already Borrowed.");
			}
			else{
				this.isBorrowed = true;
				System.out.println("Enjoy "+this.title);
			}
	}
	
	void returnBook(){
		if(isBorrowed){
			this.isBorrowed = false;
			
			System.out.println("Hope You Enjoyed, Please Leave A Review.");
		}
		else{
			System.out.println("This Book Is Already In The Library.");
		}
	}
	
	public static void main(String []args){
		Book designOfThings = new Book("1", "Design", "Author");
		Book myBook = new Book("2");
		System.out.println(Book.getTotalNoOfBooks());
		designOfThings.borrowBook();
		myBook.borrowBook();
		designOfThings.borrowBook();
		designOfThings.returnBook();
		designOfThings.returnBook();
	}
}