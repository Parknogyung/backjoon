package 토픽;
import java.io.*;
public class 소수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int sum = 0;
		int min = n;
		int index = 0;
		
		for(int i = m ; i <= n ; i++) {
			cnt = 0;
			if(i==1) {
				cnt++;
			}
			
			for(int j = 2 ; j < i ; j++) {
				if(i%j == 0) {
					cnt++;
					break;
				}
			}
			
			if(cnt==0) {
				sum = sum + i;
			if(min > i) {
				min = i;
				}
		}	
		}
		
		if(sum==0) {
			System.out.println(-1);
		}
		
		else {
		System.out.println(sum);
		System.out.println(min);
		}
}
}