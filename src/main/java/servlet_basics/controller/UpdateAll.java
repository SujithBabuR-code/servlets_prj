package servlet_basics.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basics.dao.PatientDao;
import servlet_basics.dto.PatientDto;

@WebServlet("/ud")
public class UpdateAll extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doGet(req, resp);
		String id = req.getParameter("uid");
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String password = req.getParameter("upassword");
		String number = req.getParameter("unumber");
		String gender = req.getParameter("ugender");
		String checkbox = req.getParameter("ucheckbox");
		String country = req.getParameter("ucountry");

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(number);
		System.out.println(gender);
		System.out.println(checkbox);
		System.out.println(country);

		int cid=Integer.parseInt(id);
		long cnumber=Long.parseLong(number);
		
		PatientDto dto=new PatientDto();
		dto.setId(cid);
		dto.setName(name);
		dto.setEmail(email);
		dto.setNumber(cnumber);
		dto.setPassword(password);
		dto.setGender(gender);
		dto.setCheckbox(checkbox);
		dto.setCountry(country);
		
		PatientDao dao=new PatientDao();
		dao.updateAll(dto);
		
	}
}
