package squidgame;

import java.util.Random;
import java.util.Scanner;

public class Marbles {

	// Class 4

	public static void main(String[] args) {
		
		/*
		 * 오징어 게임의 구슬게임(홀짝) 
		 * 플레이어와 컴퓨가 구슬을 10개를 가지고 게임시작 
		 * 컴퓨터가 베팅을 하고 홀인지 짝인지 맞추면 구슬을 얻는다. 
		 * 다음, 플레이어가 베팅을 하고 홀인지 짝인지 맞추면 구슬을 얻는다.
		 * 틀리면 그대로.
		 * 10개를 다 잃으면 죽고 상대방의 구슬 10개를 다 따면 다음 스테이지
		 **/
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int userMarble = 10; // 구슬 갯수 10개
		int cpuMarble = 10; // 구슬 갯수 10개

		String userPick; // 플레이어의 홀 짝 저장 값
		String cpuPick; // 컴퓨터의 홀 짝 저장 값

		
		// 구술 게임 시작
		System.out.println("홀짝 구슬 게임 시작!");

		while (true) {
			
			// 게임 종료 조건
			// 만약에 플레이어 구슬이 0이면 게임오버
			if (userMarble == 0) {
				System.out.println("Game Over");
				break;
			}
			// 만약에 플레이어 구슬이 20개 가 되면 다음스테이지
			if (userMarble >= 20) {
				System.out.println("게임에서 승리 하였습니다.");
				break;
			}
			
			
			// 컴퓨터 예측
			System.out.println("-----------------------------");
			System.out.println("플레이어가 구슬을 정하고 있습니다.");
			System.out.println("뽑을 구슬의 수를 입력하세요(1 ~ " + userMarble + "):");
			int bet2 = 0; // 베팅 변수

			// 예외처리
			try {
				// 숫자를 입력해야 되는데 문자를 입력할 경우 에러나서 프로그램 종료가 됨
				// 이렇게 예외처리를 하면 된다
				bet2 = sc.nextInt(); // 베팅한 구슬의 수
			} catch (Exception e) {
				System.out.println("숫자만 입력이 가능 합니다.");
				sc.nextLine(); // 개행문자 처리
				continue;
			}

			if (userMarble < bet2) {
				System.out.println("플레이어가 가진 구슬이 부족합니다. 다시 입력해주세요.");
				continue; // 다시 반복문으로 올림
			}

			// 플레이어 홀짝 판단
			if (bet2 % 2 == 0) {
				userPick = "짝";
			} else {
				userPick = "홀";
			}

			// 컴퓨터 홀 짝 결정하기
			System.out.println("상대방이 예측을 시작 합니다.");
			System.out.println("");

			String[] oddeven = { "짝", "홀" };
			cpuPick = oddeven[(int) (Math.random() * oddeven.length)];
			System.out.println("상대방의 선택은 " + cpuPick + " 입니다.");

			// 만약에 컴퓨터의 예측이 맞으면 플레이어가 베팅한 구슬의 갯수만큼 컴퓨터가 구술 획득
			if (userPick == cpuPick) {
				System.out.println("상대방이 예측에 성공하였습니다! 상대방에게 구슬 " + bet2 + "(을)를 줍니다.");
				cpuMarble = cpuMarble + bet2; // 상대방이 플레이어 구슬 획득
				userMarble = userMarble - bet2; // 플레이어 구술 차감
				System.out.println("상대방: " + cpuMarble + ", 플레이어: " + userMarble);
				System.out.println("");
				
				// 게임 종료 조건으로 가기 (처음으로) 
				if (userMarble == 0 || cpuMarble == 20) {
					continue;
				}

			} else {
				System.out.println("예측 실패! 공격권이 바뀝니다.");
				System.out.println("상대방: " + cpuMarble + ", 플레이어: " + userMarble);
				System.out.println("");
			}

			
			// 플레이어 예측
			System.out.println("-----------------------------");
			System.out.println("상대방이 구슬을 정하고 있습니다.");
			int rdmarble = rd.nextInt(cpuMarble) + 1; // Random marble generator

			// 컴퓨터 홀짝 판단
			if (rdmarble % 2 == 0) {
				cpuPick = "짝";
			} else {
				cpuPick = "홀";
			}

			System.out.print("상대방은 홀을 골랐을까요? 짝을 골랐을까요?");
			System.out.println("");
			String bet = sc.next();
			sc.nextLine();

//			// 홀 짝이 아닐 경우 (다시 고쳐야 함)
//			if (!bet.equals("홀") || !bet.equals("짝")) {
//				System.out.println("홀이나 짝만 적을 수 있습니다. 다시 입력하세요.");
//				continue; // 다시 반복문으로 올림
//			}

			// 만약에 플레이어의 예측에 맞으면 컴퓨터가 베팅한 구슬의 갯수만큼 플레이어가 구술 획득
			if (bet.equals(cpuPick)) {
				System.out.println("예측 성공! 상대방이 뽑은 구슬 " + rdmarble + "을(를) 가져 옵니다.");
				System.out.println("");
				userMarble = userMarble + rdmarble; // 플레이어가 컴퓨터 구슬 획득
				cpuMarble = cpuMarble - rdmarble; // 컴퓨터 구슬 차감
				System.out.println("상대방: " + cpuMarble + ", 플레이어: " + userMarble);
				System.out.println("");

			} else {
				System.out.println("예측 실패! 공격권이 바뀝니다.");
				System.out.println("상대방: " + cpuMarble + ", 플레이어: " + userMarble);
				System.out.println("");
			}


		}

	} // Main
} // Class