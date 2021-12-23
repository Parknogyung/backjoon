package 그리디;

import java.io.*;
import java.util.*;

public class 라디오 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		int min = Math.abs(a-b);
		int index = a;
		for(int i = 0 ; i < n ; i++) {
			int h = Integer.parseInt(br.readLine());
			min = Math.min(Math.abs(b-h)+1, min);
		}
			System.out.println(min);
		
		
	}
}
