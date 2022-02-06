package hello;

public class HelloClass {
 
	// Class 1

	public static void main(String[] args) {
		int st; // 변수명은 숫자로 시작할 수 없다.
		int a; // 변수명에 특수 문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할수 없다.

		String b = "찰리브라운"; // 문자열 변수 선언
		String c = "스누피";
		a = 10;

		System.out.println("안녕하세요."); // println은 출력하고 줄바꿈 해줌.
		System.out.println("저는 " + b + " 입니다.");
		System.out.println("잘 부탁드립니다.");
		System.out.println(b + "의 친구는 " + c + " 입니다.");
		System.out.println(c + "도 잘 부탁드립니다.");
		System.out.print(c + "와 저는 ");
		System.out.print(a);
		System.out.println("살 입니다.");


	// Class 2

		// 꽃 5개 심기
		// 물을 주어야하는 횟수
		int[] odds = { 2, 3, 1, 5, 10 };

		// 꽃의 갯수 출력
		int flowerNum = 0;
		int flower = 0;

		// 무한 반복
		while (true) {
			for (int i = 1; i <= odds[flowerNum]; i++) {
				System.out.println((flowerNum + 1) + "번 꽃에  " + i + "회 물을 주었습니다.");

				// 만약에 물을 주어야하는 횟수 만큼 주었으면
				if (i == odds[flowerNum]) {
					// 꽃이 핀다를 출력
					System.out.println("꽃이 피었습니다.");
					System.out.println("꽃에 물을 몇 번 주었나요? " + odds[flowerNum]);

					flower = flower + 1; // 꽃 추가

					// 물을 다 주지 않았으면
				} else {
					// 꽃이 피지 않는다를 출력
					System.out.println("꽃이 피지 않았습니다.");
				}
			}

			flowerNum++; // 다음 꽃 심기

			System.out.print("심은 꽃은? ");
			System.out.println(flower);
			System.out.println();

			// 꽃의 총 갯수가 5개면 종료
			// 반복 멈추기
			if (flowerNum == 5) {
				break;
			}
		}

		System.out.print("꽃 심기 성공");

	}
}