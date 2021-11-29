package ≈‰«»;
import java.io.*;
import java.util.StringTokenizer;
public class ∫Ì∑¢¿Ë {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum =0;
		int cha = 0;
		int[] card = new int [n];
		
		 st= new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < n ; i ++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		for(int i = 0 ; i < n ; i ++) {
			for(int j = i+1 ;  j< n ; j++ ) {
				for(int k = j+1 ; k<n ; k++) {
					sum = card[i] + card[j] + card[k];
					if(cha < sum && sum <= m) {
						cha = sum;
					}
				}
			}
			}
	System.out.println(cha);
	}

}
