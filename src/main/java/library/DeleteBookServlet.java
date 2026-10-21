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
 * Servlet implementation class DeleteBookServlet
 */
@WebServlet(name = "DeleteBook", urlPatterns = { "/DeleteBook" })
public class DeleteBookServlet extends HttpServlet {
	
	
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	/*
    public DeleteBookServlet() {
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
		
		BookDAO bd = new BookDAO();
		
		int rows;
		try {
			rows = bd.deleteBook(id);
		
		
		if(rows>0) {
			pw.println(rows + " Book deleted");
		}
		else {
			pw.println("No book in the records with the entered "+ id);
		}}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<br><br>");
		pw.println("<a href='ViewBook'>View all books</a>");

	}

}
