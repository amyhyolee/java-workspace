package com.lhj.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		String filePath = "/Users/hyojinlee/Desktop/major.txt";
//		ArrayList<String> list = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		String name = null;
//		while (true) {
//			System.out.println("추가: ");
//			name = sc.next();
//			if (name.equals("0")) {
//				break;
//			}
//			list.add(name);
//		}
//		Util.writeLineFile(list, filePath, true); // write only to the file
//		Util.readLineFile(filePath); 
		
		String major = Util.readtoConsole(filePath);
		String[] strArr= major.split("/n");
		for (String s : strArr) {
			System.out.println(s);
		}

}
}
