package com.user.pat01;

import java.util.Scanner;

public class PatNumber19 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		int[] w = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		int[] M = { 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 };
		String[] strings = new String[total];
		for(int i=0;i<total;i++){
			
			String number = scanner.next();
			int num =0;
			for(int j=0;j<number.length()-1;j++){
				
				if(number.charAt(j)>='0'&&number.charAt(j)<='9'){
				      num = num +(number.charAt(j)-48)*w[j];
					}else {
						strings[i] = number;
						num=0;
						break;
					}
			}
			
			if (num != 0) {
				int Z = num % 11;
				for (int k = 0; k < 11; k++) {
					if(Z==2&&(number.charAt(number.length() - 1))==M[k]){
						num=0;
						break;
					}
					if ( Z== k&&(number.charAt(number.length() - 1)-48)!=M[k]) {
						strings[i]=number;
						num=0;
						break;
					}
				}
			}
			
		}
		int k=0;
			for(int i=0;i<strings.length;i++){
				if(strings[i]!=null){
					System.out.println(strings[i]);
				}else {
				k++;	
				}
		}
			if(k==strings.length){
				System.out.println("All passed");
			}
		scanner.close();
	}

}
