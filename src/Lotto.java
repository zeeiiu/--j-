

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lotto
 */
@WebServlet("/Lotto")
public class Lotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lotto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		LottoNum nums = new LottoNum ();
		
		
		 PrintWriter out = response.getWriter();
		 out.println("<html><head></head><body>");
		 out.println(nums.getLottoNum());
		
	      out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		LottoNum nums = new LottoNum ();
		
		
		 PrintWriter out = response.getWriter();
		 out.println("<html><head></head><body>");
		 out.println(nums.getLottoNum());
		
	      out.println("</body></html>");
	}

}
