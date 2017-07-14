package com.user.pat01;

import java.util.Scanner;

public class PatNumber07 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		char j;
		char y;
		int a=0,b = 0,a1=0,a2=0,a3=0,a4=0;
		int c1=0,b1=0,j1=0;
		int c2=0,b2=0,j2=0;
		for(int i=0;i<total;i++){
			 j= scanner.next().charAt(0);
			 y=scanner.next().charAt(0);
			 if(j==y){
				 a3++;
				 a4++;
				 continue;	 
			 }
			 //甲赢
			 if(j=='C'&&y=='J'){
				 a++; 
				 a2++;
				 c1++;
				 continue;
			 }
			 if(j=='J'&&y=='B'){
				 a++;
				 a2++;
				j1++;
				 continue;
			 }
			 if(j=='B'&&y=='C'){
				 a++; 
				 a2++;
				b1++;
				 continue;
			 } 
			//乙赢
			 if(j=='J'&&y=='C'){
				 b++; 
				 a1++;
				c2++;
				 continue;
			 }
			 if(j=='B'&&y=='J'){
				 b++;
				 a1++;
				j2++;
				 continue;
			 }
			 if(j=='C'&&y=='B'){
				 b++; 
				 a1++;
				 b2++;
				 continue;
			 }	
		}
		System.out.println(a+" "+a3+" "+a1);
		System.out.println(b+" "+a4+" "+a2);
		 if(c1>b1&&c1>j1){
	            System.out.print("C"+" ");
	        }else if(b1>c1&&b1>j1){
	            System.out.print("B "+" ");
	        }else if(j1>c1&&j1>b1){
	            System.out.print("J "+" ");
	        }else{
	            if(b1==c1||b1==j1||(b1==c1&&b1==j1)){
	                System.out.print("B"+" ");
	            }else if(c1==j1){
	                System.out.print("C"+" ");
	            }
	        }
	 
		
		
		
		if (c2 > b2 && c2 > j2) {
			System.out.print("C");
		} else if (b2 > c2 && b2 > j2) {
			System.out.print("B");
		} else if (j2 > c2 && j2 > b2) {
			System.out.print("J");
		} else {

			if (b2 == c2 || b2 == j2 || (b2 == c2 && b2 == j2)) {
				System.out.print("B");
			} else if (c2 == j2) {
				System.out.print("C");
			}
		}
		
		scanner.close();
		
		
		
	}
}
