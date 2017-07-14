package com.user.pat01;

import java.util.Scanner;

public class PatNumber22 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		String pic = scanner.next();
		int h = 0;
		double M = (double) num / 2 - num / 2;

		if (M >= 0.5) {
			h = num / 2 + 1;
		} else {
			h = num / 2;
		}
		for (int i = 0; i < h; i++) {
			if (i == 0) {
				for (int b = 0; b < num; b++) {
					System.out.print(pic);
				}
				System.out.println();
			}
			if (i >= 1 && i <= h - 2) {
				System.out.print(pic);
				for (int c = 0; c < num - 2; c++) {
					System.out.print(" ");
				}
				System.out.print(pic);
				System.out.println();
			}
             
			if (i == h - 1) {
				for (int b = 0; b < num; b++) {
					System.out.print(pic);
				}
			}
		}

		scanner.close();
	}
}
