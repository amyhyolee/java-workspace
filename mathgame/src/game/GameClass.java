package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dto.ProblemDto;

public class GameClass {

	// 사용자가 만들어낼 문제의 수
	private int n;

	// 문제를 사용자가 입력한 만큼 나오게 만들기
	public void inputN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 문제를 생성 할까요?");
		System.out.print("입력(숫자만 가능): ");
		n = sc.nextInt();
	}

	public String getRandOper() {
		Random rnd = new Random();
		// 랜덤으로 연산자를 만드는 기능
		ArrayList<String> opList = new ArrayList<String>();
		opList.add("+");
		opList.add("-");
		opList.add("*");
		opList.add("/");

		return opList.get(rnd.nextInt(opList.size()));
	}

	// 만약에 -, / 나올 때 첫번째 수와 두번째 수를 바꿔줌
	public void mySwap(ProblemDto dto) {
		if ((dto.getOp().equals("-") || dto.getOp().equals("/")) && (dto.getNum1() < dto.getNum2())) {
			int tmp = dto.getNum1();
			dto.setNum1(dto.getNum2());
			dto.setNum2(tmp);
		}
	}

	// 문제를 만들기
	public ArrayList<ProblemDto> makeProblem() {
		Random rnd = new Random();
		ArrayList<ProblemDto> mList = new ArrayList<ProblemDto>();
		for (int i = 0; i < n; i++) {
			ProblemDto dto = new ProblemDto();
			dto.setNum1(rnd.nextInt(100) + 1);
			dto.setOp(getRandOper());
			dto.setNum2(rnd.nextInt(100) + 1);
			mySwap(dto); // 앞뒤 숫자 바꾸기
			if (dto.getOp().equals("+")) {
				dto.setResult(dto.getNum1() + dto.getNum2());
			} else if (dto.getOp().equals("-")) {
				dto.setResult(dto.getNum1() - dto.getNum2());
			} else if (dto.getOp().equals("*")) {
				dto.setResult(dto.getNum1() * dto.getNum2());
			} else if (dto.getOp().equals("/")) {
				dto.setResult(dto.getNum1() / dto.getNum2());
			}
			mList.add(dto);
		} // for
		return mList;
	}

	// 문제 출력 메소드
	// 무작위로 문제 출력(두자리 수만 나오게)
	public void randomQuestion(ProblemDto dto) {
		Random rd = new Random();
		dto.setNum1(rd.nextInt(99) + 1);
		dto.setNum2(rd.nextInt(99) + 1);
		// 답까지 셋팅
		dto.setResult(dto.getNum1() + dto.getNum2());

	}

	// 사용자의 입력 메소드
	public int userAns() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	// 답 체크 메소드
	public boolean checkAns(int user, int com) {
		if (user == com) {
			return true;
		}
		return false;
	}

	// 나가기 메소드
	public boolean isExit() {
		System.out.print("다른 연산을 하시겠습니까?\n네(1), 아니오(0):");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			return true;
		}
		return false;
	}

	// 맞는 문제 수
	private int correctAns = 0;
	// 틀린 문제 수
	private int wrongAns = 0;;

	// 결과 출력 메소드
	public void printQuestions() {
		ProblemDto nDto = new ProblemDto();
		randomQuestion(nDto); // 문제를 만들고
		System.out.print(nDto.getNum1() + " + " + nDto.getNum2() + " = ");
		// 입력 받기
		int user = userAns();
		// 점수 계산하
		if (checkAns(user, nDto.getResult())) {
			correctAns++;

		} else {
			wrongAns++;
		}
	}

	// 점수 결과 출력하기
	public void printResult() {
		System.out.println();
		System.out.println("Correct: " + correctAns + " Wrong: " + wrongAns);
	}
}
