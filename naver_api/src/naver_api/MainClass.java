package naver_api;

import java.util.Scanner;

import dto.NaverapiDto;
import interface_.BlogClass;
import interface_.BookClass;
import interface_.MovieClass;
import interface_.NewsClass;
import interface_.SearchImpl;

//네이버 검색 API

public class MainClass {

	// Class 11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NaverapiDto ndto = new NaverapiDto();
		System.out.println("검색 키워드를 입력해주세요: ");
		ndto.setSearch(sc.nextLine());
		
		System.out.println("검색 카테고리를 번호로 입력해주세요.");
		System.out.println("1.뉴스 2.블로그 3.영화 4.책");

		int num = sc.nextInt();
		sc.nextLine();


		// 1. 뉴스 검색 2. 블로그 검색 3. 영화 검색 4. 책 검색
		if (num == 1) {
			SearchImpl nNews = new NewsClass();
			nNews.search(ndto.getSearch());
		} else if (num == 2) {
			SearchImpl nBlog = new BlogClass();
			nBlog.search(ndto.getSearch());
		} else if (num == 3) {
			SearchImpl nMovie = new MovieClass();
			nMovie.search(ndto.getSearch());
		} else if (num == 4) {
			SearchImpl nBook = new BookClass();
			nBook.search(ndto.getSearch());
		} else {

		}

	}

}