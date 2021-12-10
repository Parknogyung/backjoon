package 그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 통나무건너뛰기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < tc ; i ++) {
		int n = Integer.parseInt(br.readLine());
		int [] l = new int [n];
		int min = 100000;
		int [] arr = new int [n];
		
		st= new StringTokenizer(br.readLine(), " ");
		for(int j = 0 ; j < n ; j ++) {
		l[j] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(l);
		int t = -1;
		int index_start = 0;
		int index_end = n-1; 
		double half = Math.ceil(n/2);
		
		for(int j = 0 ; j < n  ; j++) {
			t++;
			if(t%2==0 || t==0) {
			arr[index_start]=l[t];
			index_start++;
			}
			else {
				arr[index_end] = l[t];
				index_end--;
			}
		}
		min = Math.abs(arr[0]-arr[n-1]);
		for(int j = 1 ; j < n ; j++) {
			min = Math.max(min, Math.abs(arr[j]-arr[j-1]));
			
		}
		bw.write(min+"\n");
		}
		bw.flush();
		
	}

}
