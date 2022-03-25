package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BDao;
import model.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
//		String p = request.getParameter("pageNumber");
//		int pageNumber=1;
//		pageNumber = Integer.parseInt(p); 
		//매개변수 pageNumber넣기
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);

	}

}
