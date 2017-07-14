package com.user.pat01;

import java.util.Scanner;

public class PatNumber10 {

	public static void main(String[] args){
		//利用数组的下标与带计算的数字的个数的关系
		Scanner str = new Scanner(System.in);
		String number = str.nextLine();
		int[] count = new int[10]; 
		char[] num = number.toCharArray();
		
		for(int i =0;i<num.length;i++){
			count[num[i]-48]++; //计算数字的次数
		}
		
		for(int i=0;i<count.length;i++){ //输出
			if(count[i]!=0){
				System.out.println(i+":"+count[i]);
			}
			
		}
		str.close();
		
	}
	
}
