package com.user.pat01;

import java.util.Scanner;


public class PatNumber {
		
	public static void main(String[] args){
		
		 

		 int IN_X;
		 
		 
		Scanner str = new Scanner(System.in);
		
		IN_X = str.nextInt();
		long[][] A = new long[IN_X+1][4];
		for(int i=1;i<=IN_X;i++){
			for(int b = 1;b<=3;b++){
				A[i][b] = str.nextLong();
			}
		
		}
		
		
		for(int i=1;i<=IN_X;i++){
			
			if((A[i][1])+(A[i][2])>A[i][3]){
				
				System.out.println("Case #"+i+": true");
			}else {
				System.out.println("Case #"+i+": false");
			}
			
		}
		
		
		str.close();
	}

	
}
