package 그리디;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class 단어수학 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] st = new String[n];
		int [] al = new int[26];
		int a=65;
		
		for(int i = 0 ; i < 26 ;i++) {
			al[i] = 0;
			a++;
		}
		
		for(int i = 0 ; i<n; i++) {
		st[i] = br.readLine();
		}
		
		Arrays.sort(st, Collections.reverseOrder());
		int num = 9;
		int [] sum = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < st[i].length();j++) {
				sum[i] = (int) (sum[i] + ((st[i].charAt(j)-st[i].charAt(j) +num)*Math.pow(10, (st[i].length()-1)-j)));
				if()
				
			}
			
			}
		for(int i = 0 ; i < n ; i++) {
			System.out.println(sum[i]);
		}
		
	}}

		
		
		
		
	

