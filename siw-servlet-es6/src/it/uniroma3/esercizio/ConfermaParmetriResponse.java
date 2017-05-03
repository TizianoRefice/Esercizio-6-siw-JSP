package it.uniroma3.esercizio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/confermaDati")
public class ConfermaParmetriResponse extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		//gestione della RISPOSTA
		//preparazione tipo (HTML)
		response.setContentType("text/html");
		//oggetto su cui scrivere la risposta
		PrintWriter out = response.getWriter();

		//scrivo il corpo
		out.println("<!DOCTYPE html>"); out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>mostra parametri</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>" + session.getAttribute("NOME") + "</b></li>");
		out.println("<li>Cognome: <b>" + session.getAttribute("COGNOME") + "</b></li>"); //prendo i dati dalla sessione
		out.println("</ul>");
		out.println("<h2>Scegli:</h2>");
		out.println("<ul>");
		String encodedURL = response.encodeURL("mostraParametri.jsp");
		out.println("<li><a href=\"" + encodedURL + "\">Conferma i dati inseriti</a></li>");
		out.println("<li><a href=\"inserimento.html\">Torna all'inserimento</a></li>"); // sono i link per tornare alla form oppure tornare 
		out.println("</ul>");															// indietro
		out.println("</body>\n</html> "); 
	}
		//commento del 26/04/2017 a fine lezione
}

