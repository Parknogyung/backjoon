package �׸���;

import java.util.*;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		int sum = 0;
		
		for (int i = 0 ; i < n ; i ++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
		
		for(int i = 0 ; i<n;i++) {	
		for(int j = 0 ; j <=i ; j ++) {
			sum += time[j];
		}
		}
		System.out.println(sum);
}}
