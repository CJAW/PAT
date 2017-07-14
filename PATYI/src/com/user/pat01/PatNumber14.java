package com.user.pat01;


import java.util.Scanner;

public class PatNumber14 {

	public static void main(String[] args){
		
		
		Scanner str = new Scanner(System.in);
		
		long num1 = str.nextLong();
		long num2 = str.nextLong();
		
		
		
		double total = ((num2-num1)/100);//获得秒数
		
		if((num2-num1)%100>=50){ //控制小数为
			total = total+1;
		}
		
		int h = (int) (total/3600); //获得小时
		int m = (int) (total%3600/60);
		int s =(int) (total%3600%60);
		 System.out.printf("%02d:%02d:%02d\n",h,m,s);
		str.close();
		
	}
}
