package library;

import java.sql.SQLException;
import java.util.List;

public class TestBookDAO {

	public static void main(String[] args) throws SQLException {
		

		BookDAO bd = new BookDAO();
		
		//bd.addBook(new Book("Java", "KiranKumar", "Programming", 99.99));
		//bd.addBook(new Book("Python", "Kiran", "Programming", 49.99));
		//bd.addBook(new Book("C", "Inukollu", "Programming", 999.99));
		//bd.addBook(new Book("C++", "Kiran", "Programming", 9999.99));
		//bd.addBook(new Book("Anaconda", "python", "Programming", 0.99));
		
		//int updated = bd.updateBook(new Book(2, "Python", "Kumar", "Programming Language", 79.99));
		
		//System.out.println(updated + " rows updated!");
		
		
		
		//int deleted = bd.deleteBook(5);
		//System.out.println(deleted + " rows deleted!");
		
		
		
		List<Book> books = bd.viewAllBooks();
		for(Book b : books) {
			
			System.out.println(b);
		
		}
	}

}
