package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BDao;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		//답글에 대한 것
		String bGroup = request.getParameter("bGroup");  //bid와 같은 값 어떤 글에 답글을 다는지
		String bStep = request.getParameter("bStep"); //원본글 보다 몇줄 떨어졌는가 (밑으로 떨어지는거)
		String bIndent = request.getParameter("bIndent"); //옆으로 떨어지는거(들여쓰기)
		
		BDao dao = new BDao();
		dao.reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent);

	}

}
