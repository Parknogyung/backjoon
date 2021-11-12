package ≈‰«»;
import java.io.*;
import java.util.*;
public class ∆Ú±’ {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int [] num = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		float max = num[n-1];
		float sum = 0;
		
		for(int i = 0 ; i<n; i++) {
			sum = sum + (float)(num[i]/max)*100;
		
		}
		System.out.println(sum/n);
		
	}

}
