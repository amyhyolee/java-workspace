package calculator;

import java.util.Scanner;

// Class 7
/* 숫자 부터 입력하기
 * 연산 입력하기
 * 나눗셈을 할 때 뒤에 수가 0이거나 더 클 때 다시 숫자 입력하게 하기
 * 결과 출력 뒤 다시 연산 할지 물어보기
 */

public class Calculator2 {
	
	// 두수의 변수를 선언(아래 메소드에 다 접근 가능 하게)
	private int num1;
	private int num2;
	private String op;

	// 두개의 수를 입력
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		this.num1 = sc.nextInt();
		System.out.println("입력: ");
		this.num2 = sc.nextInt();
	}

	// 연산기호를 입력
	public void inputOperan() {
		Scanner sc = new Scanner(System.in);
		this.op = sc.next();
	}

	// 결과 출력
	public void printResult() {
		if (this.op.equals("+")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + add());
		} else if (this.op.equals("-")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + sub());
		} else if (this.op.equals("*")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + mul());
		} else if (this.op.equals("/")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + div());
		} else {
			System.out.println("Error!!");
		}
	}

	// 숫자 체크 기능
	public boolean checkNum() {
		// 리턴값
		boolean isCheck = true;
		// 나누기 할 때(첫번째 수가 두번째 수보다 크고 나누는 숫자가 0이 되면 안됨)
		if (this.op.equals("/")) {
			if (this.num1 < this.num2) {// 두번째숫자가 0일때 더 클수가없다.
				System.out.println("첫번쨰 수가 두번째 수보다 커야합니다! 다시 입력해주세요!");
			} else if (this.num2 == 0) {
				System.out.println("두번째 수가 0이여서는 안되요! 다시 입력해주세요!");
			} else {
				isCheck = false;
			}
		} else {
			isCheck = false;
		}
		return isCheck;
	}

	// exit하는 기능
	private boolean play = true;

	public boolean exit() {
		Scanner sc = new Scanner(System.in);
		int next = sc.nextInt();
		if (next == 0) {
			this.play = false;
		}
		boolean output = this.play;
		return output;
	}

	// 덧셈
	public int add() {
		return this.num1 + this.num2;
	}

	// 뺄셈
	public int sub() {
		return this.num1 - this.num2;
	}

	// 곱셈
	public int mul() {
		return this.num1 * this.num2;
	}

	// 나눗셈
	public int div() {
		return this.num1 / this.num2;
	}
}
