package calculator;

import java.util.Scanner;
import dto.NumDto;
import dto.OpDto;

//Class 7
/* 숫자 부터 입력하기
* 연산 입력하기
* 결과 출력
* 한번만 연상 가능한 계산기.
*/

public class Calculator3 {
	// 변수 선언
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();

	// 메소드 만들기
	// 두개의 수를 입력하
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3번째 계산기 - 첫번째 수를 입력하세요: ");
		nDto.setNum1(sc.nextInt());
		System.out.print("3번째 계산기 - 두번째 수를 입력하세요: ");
		nDto.setNum2(sc.nextInt());
	}

	// 연사자를 입력 하기
	public void inputOp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력하세요: ");
		oDto.setOp(sc.next());
	}

	// 결과를 출력
	public void printResult() {
		System.out.print(nDto.getNum1() + " ");
		System.out.print(oDto.getOp() + " ");
		System.out.print(nDto.getNum2() + " = ");
		if (oDto.getOp().equals("+")) {
			System.out.println(add());
		} else if (oDto.getOp().equals("-")) {
			System.out.println(sub());
		} else if (oDto.getOp().equals("*")) {
			System.out.println(mul());
		} else if (oDto.getOp().equals("/")) {
			System.out.println(div());
		}
	}

	// 더하기 메소드
	public int add() {
		return nDto.getNum1() + nDto.getNum2();
	}

	// 빼 메소드
	public int sub() {
		return nDto.getNum1() - nDto.getNum2();
	}

	// 곱하 메소드
	public int mul() {
		return nDto.getNum1() * nDto.getNum2();
	}

	// 나누 메소드
	public int div() {
		return nDto.getNum1() / nDto.getNum2();
	}

}
