package ±×¸®µð;
import java.io.*;
import java.util.*;

public class AB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		int cnt = 1;
		while (a != b) {
		if(a>b) {
			System.out.println("-1");
			System.exit(0);
		}
		
		if(b%10 == 1) 
			b/=10;
		
		else if(b% 2 ==0) 
			b/=2;
		
		else {
			System.out.println(-1);
			System.exit(0);
		}
		cnt++;
		}
		System.out.println(cnt);
	}

}
