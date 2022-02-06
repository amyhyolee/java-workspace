package javaclass;

public class CallingClass { // 정의만 해줌. 실행하고 싶으면 main에서 실행. 객체로 만들어 주기.
	
	// Class 5
	
	// 클래스 안에 있는 것들
	// 1. 생서자라는게 존재 2. 변수 3. 메소드

	/*
	 * 변수란?
	 * 멤버변수(인스턴스, 클래스 변수)는 보통 접근 제어자(public, private, default..)를 private으로 선언한다.
	 * private -> 내꺼 안에서만 사용 가능. 
	 * public --> 외부에서도 사용 가능.
	 */
	
	private int a; // 값을 초기화를 하지 않으면 0으로 초기화
	private String b; // 값을 초기화를 하지 않으면 null으로 초기화

	/*
	 * 메소드란? 
	 * 메소드 메소드는 동작 또는 기능을 수행
	 * 보통 접근 제어자를 public으로 선언한다.
	 */
	
	// public: 접근제어, void(int, String, ...): 반환값의 타임, method1: 메소드 이름, (): 매개변수(파라미터) 넣는 곳
	public void method1() { // Hello World를 출력하는 기능을 정의해라
		System.out.println("Hello World from method 1");
	}
	
	public void method2() { // 이름이 들어오면 안녕하세요? 이름 입니다.를 출력하는 기능을 정의해라.
		System.out.println("안녕하세요? 이름 입니다.");
	}
	
	
	// Class 6
	
	// public String c = "바꾸기 전"; // public으로 되어 있어서 main에서 바꿀 수 있음. 하지만 변수는 private으로 해두는게 더 좋음. 
	private String c;
	
	//그래서 c라는 멤버 변수를 메소드를 활용해서 변수를 바꾸자!
	public void setC(String c) {
		this.c = c; // 위에 있는 private String c를 바꾸고 싶을 때 this 활용
		// System.out.println(c);
	}
	
}
