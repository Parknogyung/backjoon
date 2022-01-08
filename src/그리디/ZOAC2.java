package ±×¸®µð;

import java.io.*;

public class ZOAC2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		char sta = 'A';
		int time = 0;
		
		for(int i = 0 ; i <word.length();i++) {
			char c = word.charAt(i);
			int n = Math.abs(c-sta);
			time+= Math.min(n, 26-n);
			sta = c;
		}
		System.out.print(time);
		
	}

}
