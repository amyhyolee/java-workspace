package mathgame;

import java.util.ArrayList;

import dto.ProblemDto;
import game.GameClass;

public class MainClass {

	public static void main(String[] args) {
		// 연산 게임
		System.out.println("연산 게임 시작");
		GameClass cc = new GameClass();

		// 문제 생성(사용자 지정한 수 만큼)
		// 사용자가 생성할 문제 수를 입력
		cc.inputN();
		// 입력한 만큼 문제 생성 n = 10;
		ArrayList<ProblemDto> mList = cc.makeProblem();


		// 입력한 문제 수 만큼 문제 나옴.
		// 맞으면 맞다 틀리면 틀렸다
		GameClass game = new GameClass();

		for (int i = 0; i < mList.size(); i++) {
			game.printQuestions();
		}
		game.printResult();
		game.isExit();
		System.out.println("게임 종료");
	}

}