package servlet_basics.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basics.dao.PatientDao;
import servlet_basics.dto.PatientDto;

@WebServlet("/fetchall")
public class FetchAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		PatientDao dao = new PatientDao();
		List<PatientDto> lct = dao.fecthAll();
//		resp.getWriter().print(lct);

		req.setAttribute("objects", lct);
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);

//		resp.sendRedirect("http://www.facebook.com");

	}
}
