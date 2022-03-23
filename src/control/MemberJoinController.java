package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;


@WebServlet("/Join.do")
public class MemberJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
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
		bean.seteMail(request.getParameter("email"));
		bean.setAddress(request.getParameter("address"));

	
		request.setAttribute("bean", bean);
		
		MemberDAO mdao = new MemberDAO();
		mdao.joinmember(bean);
	
		RequestDispatcher dis = request.getRequestDispatcher("Member.jsp");
		dis.forward(request, response);
	}
}
