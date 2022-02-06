package foodmenu;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class FoodMenu {
	public static void main(String args[]) {
		
	// Class 3 
		
		/* 뭐먹지 프로그램
		
		 * 메뉴를 추가 (프로그램 자체에서 메뉴 설정)
		 * 메뉴를 추가 (이 프로그램 사용자가 직접 입력)
		 * 만약에 입력 받는것을 끝내기 위해 0을 입력하면 종료
		 * 지금까지 입력된 메뉴 리스트를 출력
		 * 저장된 메뉴들 중에 하나를 알아서 추천
		 * 추천 결과를 출력
		 **/
		
		System.out.println("뭐 먹지 프로그램 시작");
				
		ArrayList<String> menuList = new ArrayList<String>();
		// 사용자로 부터 입력을 받기 위한 준비
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 입력하세요.(0을 입력하면 종료됩니다.)");
			// sc.nextLine();   // 숫자입력 받고 난뒤 엔터키값(개행문자) 처리하기 위해
			System.out.print("메뉴 입력: ");
			String menu = sc.nextLine(); // 메뉴를 입력 받기
			// 만약에 입력값이 0 이면 반복문 종료 
			if (menu.equals("0")) {   // 문자열을 비교 할 때 equals 메소드를 사용
				break;
			}
			// 메뉴 리스트에 담기
			menuList.add(menu);
			
		}
		
		System.out.println("메뉴 목록: " + menuList);
		PrintWriter out = null;
		
		// menu.txt로 메뉴 보내는 방법
		try{
			out = new PrintWriter("/Users/hyojinlee/Desktop/menu.txt"); // Desktop에 파일
			 for (String m : menuList) {
				out.println("당신이 입력한 메뉴는? " + m);	
				}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			out.close();
	}
	// for each 반복문 	
	// for (String m : menuList) {
	//	System.out.println("당신이 입력한 메뉴는? " + m);	
	//	}

		Random rd = new Random();
		int rdNum = rd.nextInt(menuList.size());
		System.out.print("이 메뉴들 중에서 선택된 메뉴는 ");
		System.out.println(menuList.get(rdNum) + " 입니다.");
		System.out.println("맛있게 드세요. 감사합니다.");

		
		
	}
}