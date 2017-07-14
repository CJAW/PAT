package com.user.pat01;

import java.util.Arrays;
import java.util.Scanner;

public class PatNumber18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		long P = scanner.nextLong();
		long[] number = new long[ N];
		int maxLength=0;
		for (int i = 0; i < N; i++) {
			long num = scanner.nextInt();
			number[i] = num;
		}
		Arrays.sort(number);
		
		for(int i=0;i<number.length;i++){

			for (int j = maxLength + i; j < number.length; j++) {
				if (number[i] * P >= number[j]) {
					maxLength++;
				} else {
					break;
				}
			}
		}

		System.out.println(maxLength);
		scanner.close();
	}
}
