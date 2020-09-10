package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

	ArrayList<User>users = new ArrayList<User>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		var user1 = new User("Gabriel", "0609guimaraes@gmail.com", "21312435", "4325534");
		var user2 = new User("Pedro", "pedros@gmail.com", "2341432", "324143");
		var user3 = new User("Manoel", "manu@gmail.com", "3425", "3241243");
		var user4 = new User("Japones", "japa@gmail.com", "33421", "4334654");
		var user5 = new User("Lucas", "lukas@gmail.com", "5432", "8764324");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);

		System.out.println(users);
		 resp.setContentType("application/json");
		 for (User user : users) {
		     resp.getWriter().write(user.toString());
		 }
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

}