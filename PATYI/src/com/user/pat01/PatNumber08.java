package com.user.pat01;

import java.util.Scanner;

public class PatNumber08 {
	
	public static void main(String[] args){
		Scanner str = new Scanner(System.in);
		
		String number = str.nextLine();
		
		boolean control = true;
		
		
		while(control){
			char[] total = number.toCharArray();
			if(total.length<4){
				if(total.length==1){number = number+"000";}
				if(total.length==2){number = number+"00";}
				if(total.length==3){number = number+"0";}
				total = number.toCharArray();
				
			}
			char[] total2 =total;
			
			for(int i=0;i<total.length;i++){
				
				for(int b=0;b<total.length-i-1;b++){
					
					char change = 0;
					if(total[b]<total[b+1]){
						change = total[b+1];
						total[b+1] = total[b];
						total[b] = change;	
					}
				}	
			}
			String num1 = String.valueOf(total);
		   	
			
                for(int i=0;i<total.length;i++){
				
				for(int b=0;b<total.length-i-1;b++){
					
					char change = 0;
					if(total2[b]>total2[b+1]){
						change = total2[b+1];
						total2[b+1] = total2[b];
						total2[b] = change;					
					}				
				}
				
		}
		String num2 = String.valueOf(total2);
		int result = Integer.parseInt(num1)-Integer.parseInt(num2);
		
		if(result==6174){
			System.out.println(num1+" - "+num2+" = "+result);
			break;
			
		}
		if(result==0){
			
			System.out.println(num1+" "+" - "+num2+" = "+"0000");
			control=false;
			break;
		}else {
			System.out.println(num1+" "+" - "+num2+" = "+result);
            control = true;
            number = String.valueOf(result);
            continue;
		}		
		
		
	}

		str.close();
		
	}
}
