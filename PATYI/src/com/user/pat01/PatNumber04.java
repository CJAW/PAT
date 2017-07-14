package com.user.pat01;

import java.util.Scanner;

public class PatNumber04 {

	public static void main(String[] args){
		Scanner str = new Scanner(System.in);
		
		String string1 = str.nextLine();
		String string2 = str.nextLine();
		String string3 = str.nextLine();
		String string4 = str.nextLine();
		
		char[] s1 = string1.toCharArray();
		char[] s2 = string2.toCharArray();
		char[] s3 = string3.toCharArray();
		char[] s4 = string4.toCharArray();
		String[] DAY = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		int i=0;
		for(i=0;i<s1.length;i++){
			if(s1[i]==s2[i]&&'A'<=s1[i]&&s1[i]<='G'){
				System.out.print(DAY[s1[i]-65]+" ");
				break;
			}
			
		}
		
		for(int b=i+1;b<s1.length;b++){
			if(s1[b]==s2[b]&&'A'<=s1[b]&&s1[b]<='N'){
				System.out.print(s1[b]-55+":");	
				break;
			}
			
			if(s1[b]==s2[b]&&'0'<=s1[b]&&s1[b]<='9'){
				System.out.print("0"+s1[b]+":");
				break;
				
			}
			
		}
		
		
		for(int c=0;c<s3.length;c++){

			if(s3[c]>='a'&&s3[c]<='z'&&s3[c]==s4[c]){
				
				if(c<10){
					System.out.print("0"+c);
					break;
				}else {
					System.out.print(c);
					break;
				}
				
			}
		}
		
		str.close();
		
	}
}