package com.user.pat01;

import java.util.Scanner;

public class PatNumber17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String text1 = scanner.next();
		String text2 = scanner.next();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < text2.length(); i++) {
			for (int j = 0; j < text1.length(); j++) {
				if (text2.charAt(i) == text1.charAt(j)) {
					text1 = text1.replace(String.valueOf(text2.charAt(i)), "");
				}
			}
		}
		for (int j = 0; j < text1.length(); j++) {

			if (text1.charAt(j) >= 'a' && text1.charAt(j) <= 'z') {
				stringBuilder.append((char) (text1.charAt(j) - 32));
			} else {
				stringBuilder.append(text1.charAt(j));
			}

		}
		int i = 0;
		int j = 1;
		while (j < stringBuilder.length()) {
			for (i = 0; i < j; i++) {
				if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {

					stringBuilder.deleteCharAt(j);
					j -= 1;
					break;
				}

			}
			j++;
		}

		System.out.println(stringBuilder.toString());
		scanner.close();

	}
}
