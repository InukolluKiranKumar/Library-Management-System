package library;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    /*public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String Bname = request.getParameter("bname");
		String Author = request.getParameter("author");
		String Btype = request.getParameter("btype");
		Double Price = Double.parseDouble(request.getParameter("price"));
		
		Book b = new Book(Bname, Author, Btype, Price);
		
		BookDAO bd = new BookDAO();
		
		try {
			
			String msg = bd.addBook(b);
			
			pw.println("<h3>" + msg + "</h3>");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			pw.println("<h3>Could not add the book: " + e.getMessage() + "</h3>");
			
		}
		
		pw.println("<a href='addBook.html'>ADD ANOTHER BOOK</a>");
		pw.println("|| <a href='ViewBook'>VIEW ALL BOOKS</a>");

		
		
		
	}

}
