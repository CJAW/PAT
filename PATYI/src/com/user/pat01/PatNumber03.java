package com.user.pat01;

import java.util.ArrayList;
import java.util.Scanner;

public class PatNumber03 {
	
	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);

		int PN = str.nextInt();
		int PM = str.nextInt();
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int count=0;
		for (int i = PN; i <= PM; i++) {

			for (int b = 2; b <= Math.sqrt(i); b++) {

				if (i % b == 0) {
					break;
				}
				
			}
			
			
		}

		str.close();
	}

}
