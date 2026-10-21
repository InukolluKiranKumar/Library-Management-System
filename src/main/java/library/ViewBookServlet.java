package library;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ViewBookServlet
 */
@WebServlet(name = "ViewBook", urlPatterns = { "/ViewBook" })
public class ViewBookServlet extends HttpServlet {
	
	/*
	private static final long serialVersionUID = 1L;
       */
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	/*
    public ViewBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<style>");
		
		pw.println("body { font-family: Arial, sans-serif; margin: 30px; }");
		pw.println("table { border-collapse: collapse; }");
		pw.println("th, td { border: 1px solid #999; padding: 8px 14px; }");
		pw.println("th { background-color: #2980b9; color: white; }");
		
		pw.println("</style>");

		
		pw.println("<h1>ALL BOOKS</h1>");
		
		BookDAO bd = new BookDAO();
		
		
		List<Book> list;
		try {
			list = bd.viewAllBooks();
		
		
		if(list.isEmpty()) {
			pw.println("<p>No Books Found!</p>");
		}
		else {
			
			pw.println("<table border='1' cellpadding='20' >");
			pw.println("<tr> <th>ID</th> <th>BOOK NAME</th> <th>AUTHOR</th> <th>BOOK TYPE</th> <th>PRICE</th> </tr>");
			
			for(Book b : list) {
				pw.println("<tr>"); 
				
				pw.println("<td>" + b.getId()+ "</td>");
				pw.println("<td>" + b.getBname()+ "</td>");
				pw.println("<td>" + b.getAuthor()+ "</td>");
				pw.println("<td>" + b.getBtype()+ "</td>");
				pw.println("<td>" + b.getPrice()+ "</td>");
				
				pw.println("</tr>");
			}
			pw.println("</table>");
			
			pw.println("<br><br>");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pw.println("<h3>Could not load books: " + e.getMessage() + "</h3>");
		}
		
		
		pw.println("<a href='addBook.html'>ADD ANOTHER BOOK</a>");
		pw.println(" || <a href='updatedBook.html'>UPDATE A BOOK</a>");
		pw.println(" || <a href='deleteBook.html'>DELETE A BOOK</a>");
		pw.println(" || <a href='Index.html'>MAIN MENU</a>");
		
		
		
		
		
		
	}

}
