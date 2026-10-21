package library;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet(name = "UpdateBook", urlPatterns = { "/UpdateBook" })
public class UpdateBookServlet extends HttpServlet {
	
	/*
	private static final long serialVersionUID = 1L;
    */
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*
    public UpdateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String bname = request.getParameter("bname");
		String author = request.getParameter("author");
		String btype = request.getParameter("btype");
		double price = Double.parseDouble(request.getParameter("price"));
		
		Book b = new Book(id, bname, author, btype, price);
		
		BookDAO bd = new BookDAO();
		
		try {
			int rows = bd.updateBook(b);
			
			if(rows > 0) {
				pw.println(rows + "Book Updated Successfully");
			}
			else {
				pw.println("Book not found with entered "+ id +" id");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pw.println("<a href='updateBook.html'>Update another book</a><br>");
		pw.println("<a href='ViewBook'>View all books</a>");
		
	}

}
