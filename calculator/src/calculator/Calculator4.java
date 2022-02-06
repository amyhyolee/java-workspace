package calculator;

import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;
import interface_.OperImpl;

public class Calculator4 {

	// Class 8
	// 인터페이스를 사용해 계산기 만들기
	// 계산 한 번 가능

	OperImpl sc;

	// 연산자를 정하기
	public void setOp(OperImpl sc) {
		this.sc = sc;
	}

	// 숫자 입력받기
	public void inputNum(NumDto dto) {
		// 숫자 입력 받는 기능을 여기에 작성
		// 스캐너를 활용해서 키보드로 부터 입력 받은 내용을
		// dto 에다가 셋팅
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		dto.setNum1(sc.nextInt());
		System.out.println("숫자 입력: ");
		dto.setNum2(sc.nextInt());
	}

	// 연산기호 입력받기
	public void inputOp(OpDto odto) {
		// 연산기호 입력 받는 기능을 여기에 작성
		// 스캐너를 활용해서 키보드로 부터 입력 받은 내용을
		// odto 에다가 셋팅
		Scanner sc = new Scanner(System.in);
		System.out.println("연산기호 입력: ");
		odto.setOp(sc.next());
	}

	// 연산하기
	// 출력하기
	public void printResult() {
		// 수를 담고 있는 dto를 생성
		// 연산을 담고 있는 odto를 생성
		NumDto dto = new NumDto();
		OpDto odto = new OpDto();
		// 입력 받고
		inputNum(dto);
		inputOp(odto);
		sc.calc(dto, odto);

		// 출력 하기
		System.out.println(dto.getNum1() + " " + odto.getOp() + " " + dto.getNum2() + " = " + dto.getResult());
	}

}