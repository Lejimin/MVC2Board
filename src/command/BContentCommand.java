package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BDao;
import model.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId = request.getParameter("bId"); //get방식으로 url에 실어서 보내고있음
		BDao dao = new BDao();  //db에 연결객체 생성
		BDto dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);

	}

}
