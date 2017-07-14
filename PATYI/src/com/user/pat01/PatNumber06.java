package com.user.pat01;

import java.math.BigInteger;
import java.util.Scanner;

public class PatNumber06 {

	public static void main(String[] args){
	
		Scanner str = new Scanner(System.in);
		
		BigInteger a = str.nextBigInteger();
		BigInteger b = str.nextBigInteger();
		
		BigInteger[] c = a.divideAndRemainder(b);
		
		System.out.print(c[0]+" ");
		System.out.print(c[1]);
		str.close();
		
	}
	
	
	
	
	
}
