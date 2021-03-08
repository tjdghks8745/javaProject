package inheritance;

import java.util.Scanner;

//추가 scanner 클래스
//1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료

public class FE {
	static Friend[] friends = new Friend[10]; // 메인메소드랑 save메소드에서 사용 가능하게 만들어 주는 것 <static>

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;

		while (true) {
			System.out.println("===========================================================");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("===========================================================");
			System.out.println("선택 >");
			menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("친구이름 >");
				String name = scn.nextLine();
				System.out.println("전화번호 >");
				String phone = scn.nextLine();
				Friend friend = new Friend(name, phone);
				saveFriend(friend);
			}
			else if (menu == 2) {
				saveFriend(new UnivFriend("", "", ""));
			} else if (menu == 3) {
				saveFriend(new UnivFriend("", "", ""));
			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("찾을 이름 입력 >");
				String findName = scn.nextLine();
				for (Friend friend : friends) {
					if (friend != null && friend.name.equals(findName)) {
						System.out.println("친구정보:" + friend.toString());
					}
				}
			} else if (menu == 6) {
				break;
			}
		}
	}

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
}