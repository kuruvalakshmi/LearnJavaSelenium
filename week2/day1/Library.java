package week2.day1;

public class Library {
	public String addBook(String bookTitle){
	System.out.println(bookTitle);
		return bookTitle;
		}
	public void issueBook() {
		System.out.println("Book Issued Sucessfully");

	}
	public static void main(String[] args) {
		Library books=new Library ();
		books.addBook("Book Added Sucessfully");
		books.issueBook();
		
	}
}
	

