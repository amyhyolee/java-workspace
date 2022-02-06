package calculator;

import java.util.Scanner;

import interface_.OperImpl;
import interface_.PlusClass;
import interface_.SuperClass;

public class MainClass {

	// 총 3개의 계산기

	public static void main(String[] args) {

		// Class 6 - Calculator.java

//		Scanner sc = new Scanner(System.in);
//		boolean play = true;
//
//		while (play) {
//			System.out.print("연산을 입력하세요 (+, -, *, /): ");
//			String operand = sc.next();
//
//			System.out.print("1번째 계산기 - 첫번째 수를 입력하세요: ");
//			int num1 = sc.nextInt();
//
//			System.out.print("1번째 계산기 - 두번째 수를 입력하세요: ");
//			int num2 = sc.nextInt();
//
//			Calculator calc = new Calculator();
//			int result = 0;
//
//			if (operand.equals("+")) {
//				result = calc.add(num1, num2);
//				System.out.println("Result: " + result);
//			} else if (operand.equals("-")) {
//				result = calc.sub(num1, num2);
//				System.out.println("Result: " + result);
//			} else if (operand.equals("*")) {
//				result = calc.mul(num1, num2);
//				System.out.println("Result: " + result);
//			} else if (operand.equals("/")) {
//				if (num2 == 0) {
//					System.out.println("0으로 나눌 수 없습니다.");
//				} else if (num2 > num1) {
//					System.out.println("두번째 수가 더 클 수 없습니다.");
//				}else {
//					result = calc.div(num1, num2);
//					System.out.println("Result: " + result);
//				}
//			}
//
//			System.out.println();
//			System.out.print("다른 연산을 하시겠습니까? 네(1), 아니오(0): ");
//			int next = sc.nextInt();
//			if (next == 0) {
//				play = false;
//			}
//		}
//
//		// Class 7 - Calculator2.java
//
//		// 계산기 클래스를 선언 (객체생성, 인스턴스 생성)
//		Calculator2 calc2 = new Calculator2();
//		boolean play2 = true;
//		while (play2) {
//			// 두개의 숫자를 입력하세요.
//			System.out.println("2번째 계산기 - 두개의 숫자를 입력하세요: ");
//			calc2.inputNumber();
//			// 연산자를 입력하시오.
//			System.out.println("연산자를 입력하세요: ");
//			calc2.inputOperan();
//			// 숫자 체크
//			if (calc2.checkNum()) { // 숫자가 아니면 error!
//				continue;
//			}
//			calc2.printResult();
//			System.out.print("다른 연산을 하시겠습니까? 네(1), 아니오(0): ");
//			play2 = calc2.exit();
//		}
//
//		// Class 7 - Calculator3.java
//
//		Calculator3 calc3 = new Calculator3();
//		// 수를 입력
//		calc3.inputNum();
//		// 연산자를 입력 받고
//		calc3.inputOp();
//		// 출력
//		calc3.printResult();

		// Class 8 - Calculator4.java
		
		OperImpl sc = new SuperClass(); // 연산에 따라 계산 다르게
		Calculator4 c4 = new Calculator4();
		c4.setOp(sc); // 연산자를 셋팅
		c4.printResult(); // 결과 출

	}
}
