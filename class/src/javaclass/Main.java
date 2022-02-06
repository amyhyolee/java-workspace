package javaclass; // package --> File

// 자바파일은 무조건 클래스가 존재 해야한다. 
public class Main {

	// Class 4

	/* main method란?
	 * 메소드(함수)는 프로그램의 시작점.
	 * 시작하기 위해서는 main 메소드가 있어야한다. main 메소드가 없으면 실행 안됨. 
	 * JVM이 main을 찾아서 실행 시킨다.
	 */
	
	public static void main(String[] args) {
		// MethodClass 불러오기 
		Method m = new Method(); // 객체 (Object) 생성 // new --> 생성자 / 메모리 할당
		m.printHello(4);
		m.m1();
		m.m2(); // m2 혼자로는 성공 메세지가 안 나옴. m1을 호출 해야함.
		m.m3();
		m.m4();
		
		// CallingClass 불러오기
		CallingClass object1 = new CallingClass();	// object1는 객체
		object1.method1(); // CallingClass 안에 method1메소드를 호출 (method1을 불러낸다)
		object1.method2(); // CallingClass 안에 method2메소드를 호출 (method2을 불러낸다)
		
	// Class 6
		
		// object1.c = "바꾼 후"; // 이렇게 쓰지 않는게 좋음.
		object1.setC("파레미터로 바꿈");
		
		// 생서자가 만들어 질때 기본 값 세팅
		ConstructorClass object2 = new ConstructorClass("생성자");
		object2.printD(); // "생성자"로 출력
		
		// Local variable
		object2.localVariable(); // "지역변수"로 출력
		
		// private 으로 되있는 변수들을 부르는 방법 (private 변수 접근 방법)
		int ee = object2.getE();
		System.out.println("getE의 값은: " + ee);
		
		object2.setE(100); // setE는 내부에서 e의 값을 100으로 변경한다.
		ee = object2.getE();
		System.out.println("getE의 값은: " + ee);

		// 같은 이름을 가진 메소드는 개변수가 다르면 된다.
		Parameter test = new Parameter();		
		test.method();
		test.method(1);
		test.method(1, 2);		
		test.method("String");


}

}

// 클래스로 넣어주면 좋은 이유 어떤 기능을 만들 때 한 곳 말고 다른 곳에도 쓰고 싶을 때. (두번안 만들고 하나를 재사용 가능.)
// random --> 외부에 있는걸 import 할 때
