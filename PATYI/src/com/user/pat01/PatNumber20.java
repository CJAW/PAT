package com.user.pat01;
import java.util.Scanner;

public class PatNumber20 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int peopleNum = scanner.nextInt();
		int[] people = new int[1000001];
		
		for(int i=1;i<peopleNum+1;i++){
			
			int scholl = scanner.nextInt();
			int score = scanner.nextInt();
			people[scholl] = people[scholl]+score;
			
		}
		int max=0;
		int schoolnum=0;
		
		for(int i=0;i<people.length;i++){

			if(people[i]==0){
				continue;
			}
			if(people[i]>max){
				max = people[i];
				schoolnum = i;
			}
			
		}
		
		System.out.println(schoolnum+" "+max);
		scanner.close();
	}
}
