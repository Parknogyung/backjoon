package 토픽;
import java.io.*;
import java.util.*;
public class 더하기사이클 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum1 = n;
		int cnt = 0;
		
		while(true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
			
			if(n==sum1) {
				break;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
