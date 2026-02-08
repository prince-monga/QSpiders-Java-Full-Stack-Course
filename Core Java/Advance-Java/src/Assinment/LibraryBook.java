package Assinment;

//TASK: Create a "Library Book" class with:
//1. Fields: bookId, title, author, isBorrowed
//2. Constructor to initialize
//3. Methods: borrowBook(), returnBook(), getBookInfo()
//4. Create 3 book objects and test all methods

//Your solution here:
public class LibraryBook {
	//1. Private fields because achieve encapsulation	
	private int book_id;
	private String title,author;
	private boolean is_borrowed;
	
	//2.Constructor to initialize
	LibraryBook(int book_id,String title,String author,boolean is_borrowed){
		this.book_id=book_id;
		this.title=title;
		this.author=author;
		this.is_borrowed=is_borrowed;
	}
	
	//3. create methods--  borrowBook(), returnBook(), getBookInfo()
	
	//borrowBook
	public boolean borrowBook(){
		if(is_borrowed) {
			System.out.println("Book is Borrowed");
			return is_borrowed;
		}
		else {
		return is_borrowed;
		}
	}
	//returnbook
	public boolean returnBook(){
		if(!(is_borrowed)) {
			System.out.println("Book is Return");
			return is_borrowed;
		}
		else {
		return !(is_borrowed)
				
				
				
				
			;
		}
	}
	
	//book details
	public String getBookInfo(){
		String s=title+" is book and its author is"+author; 
		System.out.println(s);
		return s;
	}
	
	
 public static void main(String[] args) {
     // Test your class
	 LibraryBook  obj=new LibraryBook(102,"ZeroToOne","XYZ",true);
	 LibraryBook  obj2=new LibraryBook(232,"Cyber hub","prince",false);
	 
	 obj.borrowBook();
	 obj.getBookInfo();
	 obj.returnBook();
	 
	 obj2.borrowBook();
	 obj2.getBookInfo();
	 obj2.returnBook();
 }
}