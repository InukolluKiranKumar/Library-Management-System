package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	//Book b = new Book();
	
	public String addBook(Book b) throws SQLException {
		
		String sql = "insert into books (bname, author, btype, price) values(?, ?, ?, ?);";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, b.getBname());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getBtype());
			ps.setDouble(4, b.getPrice());
			
			ps.executeUpdate();
			
			
			return "Book Added Successfully!";
		
		
		
	}
	
	public List<Book> viewAllBooks() throws SQLException{
		
		String sql = "select * from books";
		
		List<Book> list = new ArrayList<>();
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Book b = new Book(
						rs.getInt("id"),
						rs.getString("bname"),
						rs.getString("author"),
						rs.getString("btype"),
						rs.getDouble("price")
						);
				list.add(b);
				
			
		}
		
		
		return list;
		
	}
	
	public int updateBook(Book b) throws SQLException {
		
		String sql = "update books set bname = ?, author = ?, btype = ?, price = ? where id = ?";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, b.getBname());
		ps.setString(2, b.getAuthor());
		ps.setString(3, b.getBtype());
		ps.setDouble(4, b.getPrice());
		ps.setInt(5, b.getId());
		
		
		
		return ps.executeUpdate();
	}
	
	public int deleteBook(int id) throws SQLException {
		
		String sql = "delete from books where id = ?";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		//ps.executeUpdate();
		
		return ps.executeUpdate();
	}
}
