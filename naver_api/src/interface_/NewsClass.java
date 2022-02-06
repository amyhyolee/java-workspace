package interface_;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.lhj.util.Util;

import dto.NaverapiDto;
import naver_api.NaverAPI;

public class NewsClass implements SearchImpl {

	public void search(String search) {
		String[] code = Util.readtoConsole("/Users/hyojinlee/java-workspace/naver_client.txt").split("\\n");
		String clientId = code[0]; // 애플리케이션 클라이언트 아이디값"
		String clientSecret = code[1]; // 애플리케이션 클라이언트 시크릿값"

		String text = null;
		try {
			text = URLEncoder.encode(search, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("검색어 인코딩 실패", e);
		}

		String apiURL = "https://openapi.naver.com/v1/search/news?query=" + text; // json 결과

		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		
		String responseBody = NaverAPI.get(apiURL, requestHeaders);
		
		// cleanSearch를 사용해서 제목, 링크, 날짜만 출력 하기.
		NaverAPI.getParsingData(responseBody);
		NaverAPI.cleanSearch(1, responseBody);
	}



}
