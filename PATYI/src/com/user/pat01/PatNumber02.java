package com.user.pat01;

import java.util.ArrayList;
import java.util.Scanner;

public class PatNumber02 {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
        int total = str.nextInt();
		int number;

		int A1 = 0, A2 = 0, A3 = 0, A5 = 0, b = 0, c = 0,d=0;
		double A4 = 0;
      
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 1; i <=total; i++) {
			number = str.nextInt();

			if (number % 5 == 0 && number % 2 == 0) {
				A1 = A1 + number;
			}

			if (number % 5 == 1) {
				num.add(number);
			}

			if (number % 5 == 2) {
				A3++;
			}
			
			if (number % 5 == 3) {
				A4 +=  number;
				d +=1;
			}

			if (number % 5 == 4) {

				if (number > A5) {
					A5 = number;
				}

			}
		}

		for (int i = 0; i < num.size(); i++) {
			if (i % 2 * 10 == 0) {
				c = c + num.get(i);
			}
			if (i % 2 * 10 != 0) {
				b = b + num.get(i);
			}

		}
		A2 = c - b;

		if (A1 == 0) {

			System.out.print("N" + " ");

		} else {
			System.out.print(A1 + " ");
		}
		if (A2 == 0) {

			System.out.print("N" + " ");

		} else {
			System.out.print(A2 + " ");
		}
		if (A3 == 0) {

			System.out.print("N" + " ");

		} else {
			System.out.print(A3 + " ");
		}
		if (A4 == 0) {

			System.out.print("N" + " ");

		} else {
		
			System.out.printf("%.1f ", A4 / d);
			
		}
		if (A5 == 0) {

			System.out.print("N");

		} else {
			System.out.print(A5);
		}
		
		str.close();

	}
}
