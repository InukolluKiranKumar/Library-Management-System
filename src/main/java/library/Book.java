package library;

public class Book {
	
	private int id;
	private String bname, author, btype;
	private double price;
	
	
	public Book() {
		
	}
	
	public Book(String bname, String author, String btype, double price) {
		this.bname = bname;
		this.author = author;
		this.btype = btype;
		this.price = price;
	}
	
	public Book(int id, String bname, String author, String btype, double price) {
		super();
		this.id = id;
		this.bname = bname;
		this.author = author;
		this.btype = btype;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", author=" + author + ", btype=" + btype + ", price=" + price
				+ "]";
	}
	
	
}
