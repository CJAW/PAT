package com.user.pat01;

import java.util.Scanner;

public class PatNumber11 {
	
	public static void main(String[] args){
		
		Scanner str = new Scanner(System.in);
		long num1 = str.nextLong();
		long num2 = str.nextLong();
		int num3 =str.nextInt();
		int Y=0;
		long total = num1+num2;
		StringBuilder stringBuilder = new StringBuilder();
		while(total!=0){
			
            Y = (int) (total%num3);		
            
            if(Y>9){

            	Y = (char)Y+55;
            }
			total =  (total/num3);
			
			stringBuilder.append(Y);
		}
		
		char[] a = stringBuilder.toString().toCharArray();
		
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]);
			
		}
		str.close();
	}
	
	
}
