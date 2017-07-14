package com.user.pat01;

import java.util.Scanner;

public class PatNumber23 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String P = scanner.next();
		String A = scanner.next();
		
		String[] p = P.split("\\.");
		String[] a = A.split("\\.");
		
		int[] p1 ={Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2])};
		int[] a1 ={Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
		int[] yu = new int[3];
		
		if(a1[0]<p1[0]){
			if(p1[2]-a1[2]>=0){
				
				yu[2] = p1[2]-a1[2];
			}else {
				yu[2] = (p1[2]+29)-a1[2];
				p1[1]--;
			}
			
			if (p1[1] - a1[1] >= 0) {

				yu[1] = p1[1] - a1[1];
			} else {
				yu[1] = (p1[1] + 17) - a1[1];
				p1[0]--;
			}
				yu[0] = p1[0]-a1[0];
			
				System.out.print("-"+yu[0]+"."+yu[1]+"."+yu[2]);
		}
		
		
         if(a1[0]>p1[0]){
        		if(a1[2]-p1[2]>=0){
    				
    				yu[2] = a1[2]-p1[2];
    			}else {
    				yu[2] = (a1[2]+29)-p1[2];
    				a1[1]--;
    			}
    			
    			if (a1[1] - p1[1] >= 0) {

    				yu[1] = a1[1] - p1[1];
    			} else {
    				yu[1] = (a1[1] + 17) - p1[1];
    				a1[0]--;
    			}
    			
    				yu[0] = a1[0]-p1[0];
    			
    				System.out.print(yu[0]+"."+yu[1]+"."+yu[2]);
         }
		scanner.close();
	}
}
