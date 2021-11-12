package 토픽;
import java.io.*;
import java.util.*;
public class 최소최대 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int []num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		for(int i = 0 ; i < n ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
		}
		int min = num[0];
		int max = num[0];
		for(int i = 1 ; i < n ; i ++) {
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);		
		}
		bw.write(min + " " + max);
		bw.flush();
		}

}
