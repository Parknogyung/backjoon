package ±×¸®µð;

import java.util.*;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		for(int i = 0 ; i<t; i++) {
		int r = sc.nextInt();
		String s = sc.next();
		
		
		for(int j = 0 ; j < s.length(); j++) {
			for(int x = 0 ; x<r; x++) {
				System.out.printf("%c", s.charAt(j));
			}
		}
System.out.println();
		}}
}