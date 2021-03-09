package boardPKG.model.impl;

import boardPKG.control.BoardDAO;
import boardPKG.model.Board;
import boardPKG.model.Service;

//service 인터페이스를 구현하는 클래스
public class ServiceImpl implements Service {
	
	BoardDAO dao = new BoardDAO();
	

	@Override
	public Board[] getBoardList() {
		return dao.selectBoards();
	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.selectBoard(boardNo);
	}

	@Override
	public void creatBoard(Board board) {
		dao.inserBorad(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBorad(Board board) {
		dao.deleteBaord(board);
	}

}
