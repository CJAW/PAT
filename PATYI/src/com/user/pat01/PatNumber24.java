package com.user.pat01;

import java.util.Scanner;

public class PatNumber24 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		int[] remeber = new int[1000000];
		for(int i=0;i<total;i++){
			
			int score = scanner.nextInt();
			remeber[score]++;
			
		}
			int scoreNum = scanner.nextInt();
			
			for(int i=0;i<scoreNum;i++){
				
				int search = scanner.nextInt();
				
				if(i==scoreNum-1){
					System.out.print(remeber[search]);
				}else {
					System.out.print(remeber[search]+" ");
				}
					
				
			}
		
			scanner.close();
	}
}
