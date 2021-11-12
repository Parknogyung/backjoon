package ÅäÇÈ;
import java.io.*;
import java.util.*;
public class oxÄûÁî {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tc1 = new String[n];
 		
		for(int i = 0 ; i < n ; i++) {
			String tc = br.readLine();
			tc1[i] = tc;
		}
	
		for(int i = 0 ; i < n ; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j = 0 ; j<tc1[i].length();j++) {
			if(tc1[i].charAt(j)=='O') {
				cnt++;
			}
			else {
				cnt=0;
			}
			sum = sum+cnt;
			}
		
		System.out.println(sum);
	}}

}
