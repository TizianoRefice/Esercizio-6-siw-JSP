package it.uniroma3.esercizio;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/processaDati")
public class ProcessaParametriRequest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		//gestione della RICHIESTA

		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();
		String dataNascita = request.getParameter("dataDiNascita");


		HttpSession session = request.getSession();
		session.setAttribute("NOME", nome);
		session.setAttribute("COGNOME", cognome); 
		session.setAttribute("dataDiNascita", dataNascita);// in questo modo salvo i dati nella sessione!

		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/confermaDati");
		rd.forward(request, response);
		return;

	}
	
}
