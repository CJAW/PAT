package com.user.pat01;

import java.util.Scanner;

public class PatNumber12 {
	
	public static void main(String[] args){
		
		Scanner str = new Scanner(System.in);
		int total =0;
		int[] number = new int[10];
		for(int i=0;i<10;i++){
			number[i] = str.nextInt();
			 total = total+number[i];
		}
		int[] num = new int[total];
		int c = 0,d=0;
		for(int i=0;i<number.length;i++){
			while(c<number[i]+d){
				num[c]=i;
				c++;
			}
			d=number[i]+d;
		}
		int b=1;
		for(int i=0;i<num.length;i++){
			if(num[0]==0&&num[b]!=0){	
				int change =0;
				change = num[b];
				num[b] = num[0];
				num[0] = change;
				break;
			}else {
				b++;
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]);
		}
			
		
		str.close();
		
	}

}
