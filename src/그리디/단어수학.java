package 그리디;
import java.util.*;
import java.math.*;
public class 단어수학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		String[] c = new String[n];
		long sum = 0;
		
		for(int i = 0 ; i <n;i++) {
			a[i] = sc.next();
		}
		
		for(int i = 0 ; i <n-1;i++) {
			for(int j = 1 ; j<n;j++)
			if(a[i].length() < a[j].length()) {
				b[i] = a[j];
				b[i+1]=a[i];
			}
			else if(a[i].length() >= a[j].length()) {
				b[i] = a[i];
				b[i+1]=a[j];
			}
			}
		int su= 9;
		int ji=0;
		for(int i = 0 ; i<n;i++) {
			for(int j=0;j>=b[i].length();j--) {
			c[b[i].charAt(j)] = (int)(b[i].charAt(j) -  b[i].charAt(j)) +su ;
			
			
		}}
	
		}}
		
		
		
		
		
	

