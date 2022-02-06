package mosolgame;

import java.util.Random;
import java.util.Scanner;

public class MosolGame {

	// Class 3

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		// 문자열 변수 선언
		String b = "찰리브라운";
		String c;
		a = 10;

		// 고백 게임 참가자 이름을 입력 받기
		System.out.println("고백 게임 시작");
		// 이름을 입력하세요를 출력하고 이름 입력 받기(문자열)
		System.out.println("이름을 입력하세요.");
		System.out.print("입력: ");
		b = sc.next();
		// 친구 이름을 입력하세요를 출력하고 이름 입력 받기(문자열)
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력: ");
		c = sc.next();
		// 나이를 입력하세요를 출력하고 나이 입력 받기(숫자)
		System.out.println("나이를 입력하세요.");
		System.out.print("입력: ");
		a = sc.nextInt();

		System.out.println("안녕하세요!");
		System.out.println("저는 " + b + "입니다.");
		System.out.println("잘 부탁합니다.");
		System.out.println(b + "의 친구는 " + c + "입니다.");
		System.out.print(c + "와 저는 ");
		System.out.print(a);
		System.out.println("살 입니다.");

		// 시도 횟수
		int tr;
		System.out.println();

		// 랜덤 객체 생성
		Random rd = new Random();

		int[] odds = new int[5];

		// 0에서 10 사이 숫자 자동 출력
		for (int i = 0; i < odds.length; i++) {
			odds[i] = rd.nextInt((10) + 1);
			System.out.println(odds[i]);
		}

//		for (int j = 0; j < odds.length; j++) {
//			System.out.println("=====================================");
//			System.out.print(j + 1 + "번 후보 고백 시도횟수를 맞춰 보세요 (0 ~ 10 사이의 수): ");
//			tr = sc.nextInt();
//
//			for (int i = 1; i <= odds[j]; i++) {
//				System.out.println(j + 1 + "번 후보는 " + i + "회 고백을 시도했다");
//				
//				// if 고백 확률이 높을 때 고백하면
//				if (i == odds[j]) {
//					System.out.println("모솔 탈출");
//				} else {
//					System.out.println("솔로입니다");
//				}
//			}
//			
//			// 만약에 사용자 입력한 고백시도 횟수와 각 사람의 가진 숫자와 비교해서
//			// 맞으면 맞다 틀리면 틀렸다
//			if (tr == odds[j]) {
//				System.out.println("당신 나와 함께 갑시다~");
//			} else {
//				System.out.println("나와 당신은 맞지 않네요~ 담에봐요");
//			}
//
//		}

		// 모솔 탈출 게임 시작
		for (int j = 0; j < odds.length; j++) {
			System.out.println("=====================================");
			System.out.print(j + 1 + "번에게 몇 번 고백하시겠습니까?(0 ~ 10 사이의 수): ");
			tr = sc.nextInt();

			for (int i = 1; i <= tr; i++) {
				System.out.println(j + 1 + "번 후보는 " + i + "회 고백을 시도했다");
				// if 고백을 원치 않거나 고백을 하지 않을 경우
				if (tr == 0 || odds[j] == 0) {
					break;
					// 고백 횟수가 맞지 않을 경우
				} else if (i == odds[j] && tr != odds[j]) {
					System.out.println("맞추지 못하였습니다.");
					break;
					// 고백 횟수가 더 많을 경우: 모솔 탈출
				} else if (i == odds[j] && tr >= odds[j]) {
					System.out.println("모솔 탈출");
					// 고백 횟수가 적을 경우: 계속 솔로
				} else {
					System.out.println("솔로 입니다.");

				}
			}
			// 만약에 사용자 입력한 고백시도 횟수와 각 사람의 가진 숫자와 비교해서
			// 맞으면 맞다 틀리면 틀렸다
			if (tr == 0 || odds[j] == 0) {
				System.out.println("우린 서로가 아닌가 봐요..");
			} else if (tr == odds[j]) {
				System.out.println("오늘 부터 1일?");
			} else {
				System.out.println("우린 서로가 아닌가 봐요..");
			}
		}

		System.out.println("게임 끝");
	}

}