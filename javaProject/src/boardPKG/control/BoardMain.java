package boardPKG.control;

import java.util.Scanner;

import boardPKG.model.Board;
//import boardPKG.model.Board;
import boardPKG.model.Service;
import boardPKG.model.impl.ServiceImpl;

//메인 메소드 
public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;

		Service service = new ServiceImpl();
		while (true) {
			System.out.println("====================================");
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("====================================");
			System.out.print("선택> ");
			menu = scn.nextInt();

			if (menu == 1) { // 입력
				System.out.print("게시글 번호를 입력하세요> "); // 줄바꿈 전 입력 print
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("게시글 제목을 입력하세요> ");
				String title = scn.nextLine();
				System.out.print("게시글 내용을 입력하세요> ");
				String content = scn.nextLine();
				System.out.print("게시글 작성자를 입력하세요> ");
				String writer = scn.nextLine();

				Board board = new Board(boardNo, title, content, writer, null);
				service.creatBoard(board);

			} else if (menu == 2) { // 수정
				System.out.print("수정 할 게시글 번호를 입력하세요> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("수정 할 내용을 입력하세요> ");
				String content = scn.nextLine();
				Board board = new Board(boardNo, null, content, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) { // 삭제
				System.out.print("삭제 할 게시글 번호를 입력하세요> ");
				int boardNo = scn.nextInt();
				scn.nextLine();

				Board board = new Board(boardNo, null, null, null, null);
				service.removeBorad(board);

			} else if (menu == 4) { // 조회
				System.out.print("수정 할 게시글 번호를 입력하세요> ");
				int boardNo = scn.nextInt();
				scn.next();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());

			} else if (menu == 5) { // 리스트
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				}
			} else if (menu == 9) {
				break;
			}
		} // end while
		System.out.println("프로그램 종료");

//		BoardDAO dao = new BoardDAO();
//		dao.selectBoards();
//		Service service = new ServiceImpl2();
//		service.getBoard(15);

//		Board[] list = service.getBoardList();
//		for(Board bo : list) {
//			if(bo != null)
//				System.out.println(bo.toString()); }

	} // main class
} // end class
