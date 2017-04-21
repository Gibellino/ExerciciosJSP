package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PolePosition
 */
@WebServlet("/PolePosition")
public class PolePosition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolePosition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*response.getWriter().append("<h1>Tempos</h1><br/>"
				+ "<form method='get'>"
					+ "<input type='text' name='t1'/><br/>"
					+ "<input type='text' name='t2'/><br/>"
					+ "<input type='text' name='t3'/><br/>"
					+ "<input type='text' name='t4'/><br/>"
					+ "<input type='submit' value='Enviar' onclick='response.setHeader('Refresh',1)'/>"
				+ "</form>");
		
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		t.add(Integer.valueOf(request.getParameter("t1")));
		t.add(Integer.valueOf(request.getParameter("t2")));
		t.add(Integer.valueOf(request.getParameter("t3")));
		t.add(Integer.valueOf(request.getParameter("t4")));
		
		Collections.sort(t);
		
		response.getWriter().append("Tempos por ordem:<br/>");
		for(int i=0; i<t.size(); i++){
			response.getWriter().append(" " + (i+1) + " - " + t.get(i) + "<br/>");
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		t.add(Integer.valueOf(request.getParameter("c1")));
		t.add(Integer.valueOf(request.getParameter("c2")));
		t.add(Integer.valueOf(request.getParameter("c3")));
		
		Collections.sort(t);
		
		//TODO ordenar tempos
		
		request.setAttribute("first", t.get(0));
		request.setAttribute("second", t.get(1));
		request.setAttribute("third", t.get(2));
		
		request.getRequestDispatcher("resultados.jsp").forward(request, response);
	}

}
