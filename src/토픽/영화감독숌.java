package 토픽;
import java.io.*;
public class 영화감독숌 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int start = 666;
		int cnt = 0;
		
		while(cnt < n) {
			if(String.valueOf(start).contains("666")) {
				cnt++;
			}
			start++;

			
		}
		System.out.println(start-1);
	}

}
