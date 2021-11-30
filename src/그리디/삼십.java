package ±×¸®µð;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class »ï½Ê {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		Integer [] num = new Integer [n.length()];
		int sum = 0;
		
		for(int i = 0 ; i < n.length() ; i++) {
			sum += (int)n.charAt(i)-48;
			num[i] = (int)n.charAt(i)-48;
		}
		Arrays.sort(num, Collections.reverseOrder());
		
		
		if(num[n.length()-1]==0 && sum % 3 ==0) {
			for(int i = 0 ; i < n.length() ; i++)
			System.out.printf("%d", num[i]);
			
		}
		else {
			System.out.println(-1);
		}
		
	}

}
