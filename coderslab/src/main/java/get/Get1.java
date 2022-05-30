package get;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "get1", urlPatterns = {"/get1"})
public class Get1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String start = req.getParameter("start");
		String end = req.getParameter("end");
		if (Objects.isNull(start) || Objects.isNull(end)) {
			resp.getWriter().print("BRAK");
		} else {
			for (int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++) {
				resp.getWriter().println(Integer.toString(i));
			}
			
		}
	}

}
