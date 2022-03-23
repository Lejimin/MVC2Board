package control;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;


@WebServlet("/update.do")
public class MemberUpdateController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));
		bean.setPw(request.getParameter("password"));
		bean.setName(request.getParameter("name"));
		bean.seteMail(request.getParameter("eMail"));
		bean.setAddress(request.getParameter("address"));

	
		request.setAttribute("bean", bean);
		
		MemberDAO mdao = new MemberDAO();
		mdao.updatemember(bean);
	
		RequestDispatcher dis = request.getRequestDispatcher("list.do");
		dis.forward(request, response);
	}
}
