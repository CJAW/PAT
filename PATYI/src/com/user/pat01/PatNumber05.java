package com.user.pat01;

import java.util.Scanner;

public class PatNumber05 {

	
	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		String string1 = str.next();
		String string2 = str.next();
		String string3 = str.next();
		String string4 = str.next();

		
		String[] num1 = string1.split("");
		String[] num2 = {string2};
		String[] num3 = string3.split("");
		String[] num4 ={ string4};
		

		StringBuilder total1 = new StringBuilder();
		StringBuilder total2 = new StringBuilder();
        
		
		for (int i = 0; i <num1.length; i++) {

			if (num1[i].equals(num2[0])) {
				 total1.append(num2[0]);
			}

		}
		for (int i = 0; i < num3.length; i++) {
			if (num3[i].equals(num4[0])) {
				total2.append(num4[0]);
			}

		}
		if (total1.length()==0&&total2.length()!=0) {
			System.out.println(Long.parseLong(total2.toString()));
		}
		if (total2.length()==0&&total1.length()!=0) {
			System.out.println(Long.parseLong(total1.toString()));
		}

		if (total2.length()==0&& (total1.length()==0)) {
			System.out.println("0");
		}

		if (total2.length()!=0 && (total1.length()!=0)) {
			System.out.print(Long.parseLong(total1.toString()) + Long.parseLong(total2.toString())); // string转int
		}
		
		str.close();

	}
}
