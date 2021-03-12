package collections;

import java.util.ArrayList;
import java.util.List;

class Board {
	String subject;
	String content;
	String writer;

	Board() {
	}

	Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}

}

public class BoardExample {
	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>();
//		boards = new LikedList<>();
		Board b1 = new Board();
		b1.subject = "tset";
		b1.content = "content";
		b1.writer = "user1";
		Board b2 = new Board("java", "very good", "user2");
		Board b3 = new Board("javascript", "good", "user1");
		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(new Board("Javascript", "good" , "user1"));

		String searchStr = "java";
		for (int i = 0; i < boards.size(); i++) {
//			if (boards.get(i).subject.substring(0, 4).toLowerCase().equals(searchStr)) { toLowerCase 전부다 소문자로 바꾸는 것 배열 안에 있는 것들을 
//				System.out.println(boards.get(i));
				if (boards.get(i).subject.toLowerCase().startsWith(searchStr)) { 
					System.out.println(boards.get(i));
			}
		}

	}
}
