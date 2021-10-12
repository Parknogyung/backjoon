package ±×¸®µð;

import java.util.Scanner;

public class sugar_delivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		while (true) {
			if(n%5==0) {
				count += n/5;
				break;
			}
			
			n-=3;
			count++;
		
			if(n<0){
			count =-1; break;
			}
		}
		System.out.println(count);

	}

}
