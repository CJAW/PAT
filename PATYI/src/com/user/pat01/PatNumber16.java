package com.user.pat01;

import java.util.Scanner;

public class PatNumber16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int b = 0;
		String youngName = null;
		String oldName = null;
		int curr = 20140906;
		int min=20000000;
		int max=0;
		for (int i = 0; i < num; i++) {

			String name = scanner.next();
			String birthday = scanner.next().replace("/","");
			int birthdayNum = Integer.parseInt(birthday);
            int year = curr - birthdayNum;	
            if(year<=2000000&&year>0){
            	b+=1;
            	if(year>max){
            		max = year;
            		oldName = name;
            	}
            	
            	if(year<min){
            		min = year;
            		youngName = name;
            	}
            	
            }
			

		}

		System.out.print(b + " " + oldName + " " + youngName);
		scanner.close();

	}
}
