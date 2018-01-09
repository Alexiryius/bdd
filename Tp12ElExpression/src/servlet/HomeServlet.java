package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Adresse;
import modele.Employe;
import modele.Personne;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Personne personne = new Employe();
		personne.setNom("Paul");
		request.setAttribute("personne", personne);
		
		Employe emp = new Employe();
		Adresse add = new Adresse();
		add.setAdresse("Lille");
		emp.setAdresse(add);
		emp.setId(1);
		emp.setNom("Pierre");
		
		HttpSession session = request.getSession();
		session.setAttribute("employe", emp);

		response.addCookie(new Cookie("User.Cookie", "Chez_Utilisateur"));
	
		this.getServletContext().setAttribute("User.Cookie", "Chez_Utilisateur");
		
		this.getServletContext().getRequestDispatcher("/TestJsp.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
